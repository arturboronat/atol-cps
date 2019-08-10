package org.eclipse.papyrus.aof.operations;

import org.eclipse.papyrus.aof.core.IBox;
import org.eclipse.papyrus.aof.core.IOne;
import org.eclipse.papyrus.aof.core.impl.operation.Operation;
import org.eclipse.papyrus.aof.core.impl.utils.DefaultObserver;
import org.eclipse.papyrus.aof.core.impl.utils.Equality;

public class Includes<E> extends Operation<Boolean> {

	public Includes(IBox<E> sourceBox, IOne<E> elementBox) {
		this.sourceBox = sourceBox;
		this.elementBox = elementBox;
		e = elementBox.get(0);
		recount();
		registerObservation(sourceBox, new SourceObserver());
		registerObservation(elementBox, new ElementObserver());
	}

	@Override
	public boolean isOptional() {
		return false;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	@Override
	public boolean isOrdered() {
		return true;
	}

	@Override
	public boolean isUnique() {
		return true;
	}

	private final IBox<E> sourceBox;
	private final IOne<E> elementBox;
	private int count;
	private E e;

	private void recount() {
		count = 0;
		for(E element : sourceBox) {
			if(Equality.optionalEquals(e, element)) {
				count++;
			}
		}
		getResult().set(0, count > 0);
	}

	@Override
	public Boolean getResultDefautElement() {
		return Boolean.FALSE;
	}

	private class SourceObserver extends DefaultObserver<E> {
		@Override
		public void added(int index, E element) {
			if(Equality.optionalEquals(e, element)) {
				count++;
				if(count == 1) {
					getResult().set(0, true);
				}
			}
		}

		@Override
		public void removed(int index, E element) {
			if(Equality.optionalEquals(e, element)) {
				assert count > 0;

				count--;
				if(count == 0) {
					getResult().set(0, false);
				}
			}
		}

		@Override
		public void replaced(int index, E newElement, E oldElement) {
			if(Equality.optionalEquals(e, oldElement)) {
				if(Equality.optionalEquals(e, newElement)) {
					// nothing to do
				} else {
					// removed
					assert count > 0;

					count--;
					if(count == 0) {
						getResult().set(0, false);
					}
				}
			} else if(Equality.optionalEquals(e, newElement)) {
				// added
				count++;
				if(count == 1) {
					getResult().set(0, true);
				}
			} else {
				// nothing to do
			}
		}

		@Override
		public void moved(int newIndex, int oldIndex, E element) {
			// nothing to do
		}
	}

	private class ElementObserver extends DefaultObserver<E> {
		@Override
		public void added(int index, E element) {
			if(!Equality.optionalEquals(element, e)) {
				e = element;
				recount();
			}
		}

		@Override
		public void moved(int newIndex, int oldIndex, E element) {
			throw new UnsupportedOperationException("TODO: auto-generated method stub");
		}

		@Override
		public void removed(int index, E element) {
			throw new UnsupportedOperationException("TODO: auto-generated method stub");
		}

		@Override
		public void replaced(int index, E newElement, E oldElement) {
			added(0, newElement);
		}
	}
}
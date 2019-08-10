package org.eclipse.papyrus.aof.operations;

import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.aof.core.IBox;
import org.eclipse.papyrus.aof.core.IUnaryFunction;
import org.eclipse.papyrus.aof.core.impl.operation.Operation;
import org.eclipse.papyrus.aof.core.impl.utils.DefaultObserver;
import org.eclipse.papyrus.aof.core.impl.utils.cache.IUnaryCache;
import org.eclipse.papyrus.aof.core.impl.utils.cache.StrongKeysStrongValuesUnaryCache;

// WARNING: result order not deterministic (result box & nestedBoxes)
public class GroupByAs<E, I, G> extends Operation<G> {

	// only works if (I extends EObject)
	// + it is basically useless at scale 32 & 64 (memory gain is around a few 100kB)
	private static final boolean USE_ADAPTER_MAPPING = false;

	private final IUnaryFunction<E, I> getGroupId;
	private final IUnaryFunction<I, G> groupCreator;
	private final IUnaryFunction<G, IBox<E>> getBox;

	private final IUnaryCache<I, G> groupById;

	public GroupByAs(IBox<E> sourceBox, IUnaryFunction<E, I> getGroupId, IUnaryFunction<I, G> groupCreator, IUnaryFunction<G, IBox<E>> getBox) {
		this.getGroupId = getGroupId;
		this.groupCreator = groupCreator;
		this.getBox = getBox;

		this.groupById = new StrongKeysStrongValuesUnaryCache<I, G>();

		for(E e : sourceBox) {
			processElement(e);
		}

		registerObservation(sourceBox, new SourceObserver());
	}

	private static class GroupMappingAdapter implements Adapter {
		public final Object group;

		public GroupMappingAdapter(Object group) {
			this.group = group;
		}

		@Override
		public void notifyChanged(Notification notification) {
		}
		@Override
		public Notifier getTarget() {
			return null;
		}
		@Override
		public void setTarget(Notifier newTarget) {
		}

		@Override
		public boolean isAdapterForType(Object type) {
			return false;
		}
	}

	private G getGroup(I id) {
		if(USE_ADAPTER_MAPPING) {
			EObject idObject = (EObject)id;
			List<Adapter> adapters = idObject.eAdapters();
			// we suppose it is the last one since no other operation should happen in parallel
			Adapter lastAdapter = adapters.get(adapters.size() - 1);
			if(lastAdapter instanceof GroupMappingAdapter) {
				GroupMappingAdapter mappingAdapter = (GroupMappingAdapter)lastAdapter;
				return (G)mappingAdapter.group;
			} else {
				return null;
			}
		} else {
			return groupById.get(id);
		}
	}

	private void putGroup(I id, G group) {
		if(USE_ADAPTER_MAPPING) {
			EObject idObject = (EObject)id;
			idObject.eAdapters().add(new GroupMappingAdapter(group));
		} else {
			groupById.put(id, group);
		}
	}

	// rename to show it is an add
	private void processElement(E element) {
		if(element != null) {
			I id = getGroupId.apply(element);
			G group = getGroup(id);
			if(group == null) {
				group = groupCreator.apply(id);
				putGroup(id, group);
			}
			IBox<E> nestedBox = getBox.apply(group);
			nestedBox.add(element);
			if(nestedBox.length() == 1) {
				// occurs upon group creation or re-addition
				getResult().add(group);
			}
		}
	}

	@Override
	public boolean isOptional() {
		return true;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

	@Override
	public boolean isOrdered() {
		return false;
	}

	@Override
	public boolean isUnique() {
		return true;
	}

	@Override
	public G getResultDefautElement() {
		return null;
	}

	private class SourceObserver extends DefaultObserver<E> {
		@Override
		public void added(int index, E element) {
			processElement(element);
		}

		@Override
		public void removed(int index, E element) {
			if(element != null) {	// same comment as in processElement
				I id = getGroupId.apply(element);
				G group = getGroup(id);
				IBox<E> nestedBox = getBox.apply(group);
				nestedBox.remove(element);
				if(nestedBox.length() == 0) {
					getResult().remove(group);
				}
			}
		}

		@Override
		public void replaced(int index, E newElement, E oldElement) {
			// could be optimized if same group (or if same element)
			removed(index, oldElement);
			added(index, newElement);
		}

		@Override
		public void moved(int newIndex, int oldIndex, E element) {
			// nothing to do
		}
	}
}
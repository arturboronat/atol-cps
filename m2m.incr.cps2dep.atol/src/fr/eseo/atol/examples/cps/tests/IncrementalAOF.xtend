//package fr.eseo.atol.examples.cps.tests
//
//import fr.eseo.atol.examples.cps.aof.CPS2DeploymentAOFTransformation
//import org.apache.log4j.Logger
//import org.eclipse.viatra.examples.cps.traceability.CPSToDeployment
//import org.eclipse.viatra.examples.cps.xform.m2m.launcher.CPSTransformationWrapper
//import org.eclipse.xtend.lib.annotations.Accessors
//
//class IncrementalAOF extends CPSTransformationWrapper {
//	protected extension Logger logger = Logger.getLogger(this.class)
//	
//	@Accessors
//	var CPS2DeploymentAOFTransformation xform
//	
//	override initializeTransformation(CPSToDeployment cps2dep) {
//		xform = new CPS2DeploymentAOFTransformation(cps2dep)
//	}
//	
//	override executeTransformation() {
//		xform.execute()
//	}
//    
//    override cleanupTransformation() {
//        if (xform !== null) {
//        	xform.dispose();
//            xform = null
//        }
//    }
//    
//    override isIncremental() {
//        return true
//    }
//	
//
//}

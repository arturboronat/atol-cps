package experiments.atol

import experiments.utils.BenchmarkRunner
import fr.eseo.atol.examples.cps.atl.CPS2DeploymentATLTransformation
import java.io.File
import java.io.IOException
import java.util.Collections
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceImpl
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.XMLResource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl
import org.eclipse.viatra.examples.cps.cyberPhysicalSystem.ApplicationType
import org.eclipse.viatra.examples.cps.cyberPhysicalSystem.CyberPhysicalSystem
import org.eclipse.viatra.examples.cps.cyberPhysicalSystem.CyberPhysicalSystemPackage
import org.eclipse.viatra.examples.cps.cyberPhysicalSystem.HostInstance
import org.eclipse.viatra.examples.cps.deployment.DeploymentFactory
import org.eclipse.viatra.examples.cps.deployment.DeploymentPackage
import org.eclipse.viatra.examples.cps.generator.utils.CPSModelBuilderUtil
import org.eclipse.viatra.examples.cps.traceability.CPSToDeployment
import org.eclipse.viatra.examples.cps.traceability.TraceabilityFactory
import org.eclipse.viatra.examples.cps.traceability.TraceabilityPackage

class Cps2DepRunner_ClientServer_ATOL_modification extends BenchmarkRunner {


	val trafo = 'clientServer'
//    val ROOT_PATH = '..'
    val ROOT_PATH = '/Users/ab373/Documents/ArturData/WORK/git/viatra-cps-batch-benchmark'





	var String iteration
	var CPSToDeployment cps2dep
    var CPS2DeploymentATLTransformation xform 
    
    extension CPSModelBuilderUtil builderUtil = new CPSModelBuilderUtil
     
    
	override getIdentifier() {
		"cps2dep_clientServer_atolv_incr_modification"
	}
	
	override getIterations() {
		#[1, 1, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768]
//		#[1, 1, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384]
//		#[1]
	}
    
	def static void main(String[] args) {
		val runner =  new Cps2DepRunner_ClientServer_ATOL_modification
//		runner.debug = true
		runner.runBenchmark
	
	} 

	// in our case
	// TODO: initialization should be performed before loading models	
	override doLoad(String iteration) {
		doStandaloneEMFSetup()
		
		var String inputModelPath = '''«ROOT_PATH»/m2m.batch.data/cps2dep/«trafo»/cps/'''
		var String outputModelPath = '''«ROOT_PATH»/m2m.batch.data/cps2dep/«trafo»/deployment/atol'''
		
		cps2dep = preparePersistedCPSModel(
			URI.createFileURI(new File(inputModelPath).absolutePath),
			'''clientServer_«iteration»''',
			URI.createFileURI(new File(outputModelPath).absolutePath)
		)
		
	}
	
	
	var ApplicationType appType
	var HostInstance hostInstance
	
	override doInitialization() {
		xform = new CPS2DeploymentATLTransformation(cps2dep)
		xform.execute()
		appType = cps2dep.cps.appTypes.findFirst[it.identifier.contains("Client")]
		hostInstance = cps2dep.cps.hostTypes.findFirst[it.identifier.contains("client")].instances.head
	}
	override doTransformation() {
		val appID = "new.app.instance" + "_NEW" // nextModificationIndex 
		appType.prepareApplicationInstanceWithId(appID, hostInstance)
	}
	
	override doSave(String iteration) {
		try {
	      cps2dep.deployment.eResource.save(Collections.EMPTY_MAP);
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
		try {
	      cps2dep.eResource.save(Collections.EMPTY_MAP);
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	}
	
	override doDispose() {
		if (xform !== null) {
        	xform.dispose();
            xform = null
        }
	}

	///////////////////////////////////////////////////////////////////////////////////////////
	// SOLUTION SPECIFIC
	///////////////////////////////////////////////////////////////////////////////////////////
	def doStandaloneEMFSetup() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		
		CyberPhysicalSystemPackage.eINSTANCE.eClass()
		DeploymentPackage.eINSTANCE.eClass()
		TraceabilityPackage.eINSTANCE.eClass()
	}
	
	def preparePersistedCPSModel(URI sourceUri, String modelName, URI targetUri) {
		val rs = new ResourceSetImpl()
		
		// register default factory - needed for standalone mode
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().
		put(
				Resource.Factory.Registry.DEFAULT_EXTENSION, 
				new XMIResourceFactoryImpl()
		);
		
		val modelNameURI = sourceUri.appendSegment(modelName)
		// Artur: use getResource instead of createResource for cps model
		val cpsRes = rs.createResource(modelNameURI.appendFileExtension("cyberphysicalsystem.xmi"))
		val Map<Object,Object> loadOptions = (cpsRes as XMLResourceImpl).getDefaultLoadOptions();
		loadOptions.put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
		loadOptions.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
		loadOptions.put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.TRUE);
		loadOptions.put(XMLResource.OPTION_USE_PARSER_POOL, new XMLParserPoolImpl());
		loadOptions.put(XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP, new HashMap());
		
		(cpsRes as ResourceImpl).setIntrinsicIDToEObjectMap(new HashMap());
		try {
			cpsRes.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}

		val targetModelNameURI = targetUri.appendSegment(modelName)
		val depRes = rs.createResource(targetModelNameURI.appendFileExtension("deployment.xmi"))
		val trcRes = rs.createResource(targetModelNameURI.appendFileExtension("traceability.xmi"))
		
		// Artur: to load the model
//		val cps = createCyberPhysicalSystem => [
//			identifier = modelName
//		]
//		cpsRes.contents += cps
		val cps = cpsRes.contents.head as CyberPhysicalSystem
		
		val dep = DeploymentFactory.eINSTANCE.createDeployment
		depRes.contents += dep
		 
		val cps2dep = TraceabilityFactory.eINSTANCE.createCPSToDeployment => [
			it.cps = cps
			it.deployment = dep
		]
		trcRes.contents += cps2dep
		cps2dep
	}	
}
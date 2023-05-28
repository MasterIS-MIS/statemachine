/*
 * generated by Xtext 2.25.0
 */
package lsi.us.es.mis.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import javax.inject.Inject

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
 
class MyStateMachineGenerator extends AbstractGenerator {

	//DependencyInjection
	@Inject MyStateMachineGraphVizGenerator genGraphViz
  	@Inject MyStateMachineJavaGenerator genJava
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		genGraphViz.doGenerate(resource, fsa, context)
 		genJava.doGenerate(resource, fsa, context)
	}
}
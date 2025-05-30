/*
 * generated by Xtext 2.30.0
 */
package lsi.us.es.mis.xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import lsi.us.es.mis.xtext.myStateMachine.MyStateMachinePackage;
import lsi.us.es.mis.xtext.myStateMachine.State;
import lsi.us.es.mis.xtext.myStateMachine.StateMachine;
import lsi.us.es.mis.xtext.myStateMachine.Transition;
import lsi.us.es.mis.xtext.services.MyStateMachineGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MyStateMachineSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyStateMachineGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyStateMachinePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyStateMachinePackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case MyStateMachinePackage.STATE_MACHINE:
				sequence_StateMachine(context, (StateMachine) semanticObject); 
				return; 
			case MyStateMachinePackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     StateMachine returns StateMachine
	 *
	 * Constraint:
	 *     (states+=State states+=State* transitions+=Transition*)
	 * </pre>
	 */
	protected void sequence_StateMachine(ISerializationContext context, StateMachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyStateMachinePackage.Literals.STATE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyStateMachinePackage.Literals.STATE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Transition returns Transition
	 *
	 * Constraint:
	 *     (from=[State|ID] to=[State|ID])
	 * </pre>
	 */
	protected void sequence_Transition(ISerializationContext context, Transition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyStateMachinePackage.Literals.TRANSITION__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyStateMachinePackage.Literals.TRANSITION__FROM));
			if (transientValues.isValueTransient(semanticObject, MyStateMachinePackage.Literals.TRANSITION__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyStateMachinePackage.Literals.TRANSITION__TO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTransitionAccess().getFromStateIDTerminalRuleCall_0_0_1(), semanticObject.eGet(MyStateMachinePackage.Literals.TRANSITION__FROM, false));
		feeder.accept(grammarAccess.getTransitionAccess().getToStateIDTerminalRuleCall_2_0_1(), semanticObject.eGet(MyStateMachinePackage.Literals.TRANSITION__TO, false));
		feeder.finish();
	}
	
	
}

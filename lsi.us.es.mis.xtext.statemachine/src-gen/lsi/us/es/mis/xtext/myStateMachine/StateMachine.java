/**
 * generated by Xtext 2.25.0
 */
package lsi.us.es.mis.xtext.myStateMachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lsi.us.es.mis.xtext.myStateMachine.StateMachine#getStates <em>States</em>}</li>
 *   <li>{@link lsi.us.es.mis.xtext.myStateMachine.StateMachine#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see lsi.us.es.mis.xtext.myStateMachine.MyStateMachinePackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends EObject
{
  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link lsi.us.es.mis.xtext.myStateMachine.State}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see lsi.us.es.mis.xtext.myStateMachine.MyStateMachinePackage#getStateMachine_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
   * The list contents are of type {@link lsi.us.es.mis.xtext.myStateMachine.Transition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference list.
   * @see lsi.us.es.mis.xtext.myStateMachine.MyStateMachinePackage#getStateMachine_Transitions()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getTransitions();

} // StateMachine

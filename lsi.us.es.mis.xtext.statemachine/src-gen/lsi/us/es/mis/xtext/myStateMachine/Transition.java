/**
 * generated by Xtext 2.30.0
 */
package lsi.us.es.mis.xtext.myStateMachine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lsi.us.es.mis.xtext.myStateMachine.Transition#getFrom <em>From</em>}</li>
 *   <li>{@link lsi.us.es.mis.xtext.myStateMachine.Transition#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see lsi.us.es.mis.xtext.myStateMachine.MyStateMachinePackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject
{
  /**
   * Returns the value of the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' reference.
   * @see #setFrom(State)
   * @see lsi.us.es.mis.xtext.myStateMachine.MyStateMachinePackage#getTransition_From()
   * @model
   * @generated
   */
  State getFrom();

  /**
   * Sets the value of the '{@link lsi.us.es.mis.xtext.myStateMachine.Transition#getFrom <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(State value);

  /**
   * Returns the value of the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' reference.
   * @see #setTo(State)
   * @see lsi.us.es.mis.xtext.myStateMachine.MyStateMachinePackage#getTransition_To()
   * @model
   * @generated
   */
  State getTo();

  /**
   * Sets the value of the '{@link lsi.us.es.mis.xtext.myStateMachine.Transition#getTo <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' reference.
   * @see #getTo()
   * @generated
   */
  void setTo(State value);

} // Transition

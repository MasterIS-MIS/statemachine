/**
 * generated by Xtext 2.30.0
 */
package lsi.us.es.mis.xtext.myStateMachine;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see lsi.us.es.mis.xtext.myStateMachine.MyStateMachinePackage
 * @generated
 */
public interface MyStateMachineFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyStateMachineFactory eINSTANCE = lsi.us.es.mis.xtext.myStateMachine.impl.MyStateMachineFactoryImpl.init();

  /**
   * Returns a new object of class '<em>State Machine</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Machine</em>'.
   * @generated
   */
  StateMachine createStateMachine();

  /**
   * Returns a new object of class '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State</em>'.
   * @generated
   */
  State createState();

  /**
   * Returns a new object of class '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition</em>'.
   * @generated
   */
  Transition createTransition();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyStateMachinePackage getMyStateMachinePackage();

} //MyStateMachineFactory

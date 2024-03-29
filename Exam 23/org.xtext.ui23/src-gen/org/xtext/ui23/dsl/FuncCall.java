/**
 * generated by Xtext 2.29.0
 */
package org.xtext.ui23.dsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Func Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ui23.dsl.FuncCall#getRef <em>Ref</em>}</li>
 *   <li>{@link org.xtext.ui23.dsl.FuncCall#getExps <em>Exps</em>}</li>
 * </ul>
 *
 * @see org.xtext.ui23.dsl.DslPackage#getFuncCall()
 * @model
 * @generated
 */
public interface FuncCall extends Exp
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(Function)
   * @see org.xtext.ui23.dsl.DslPackage#getFuncCall_Ref()
   * @model
   * @generated
   */
  Function getRef();

  /**
   * Sets the value of the '{@link org.xtext.ui23.dsl.FuncCall#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Function value);

  /**
   * Returns the value of the '<em><b>Exps</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ui23.dsl.Exp}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exps</em>' containment reference list.
   * @see org.xtext.ui23.dsl.DslPackage#getFuncCall_Exps()
   * @model containment="true"
   * @generated
   */
  EList<Exp> getExps();

} // FuncCall

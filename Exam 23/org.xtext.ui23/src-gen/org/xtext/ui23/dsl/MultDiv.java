/**
 * generated by Xtext 2.29.0
 */
package org.xtext.ui23.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mult Div</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ui23.dsl.MultDiv#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.ui23.dsl.MultDiv#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.ui23.dsl.MultDiv#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.xtext.ui23.dsl.DslPackage#getMultDiv()
 * @model
 * @generated
 */
public interface MultDiv extends Exp
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Exp)
   * @see org.xtext.ui23.dsl.DslPackage#getMultDiv_Left()
   * @model containment="true"
   * @generated
   */
  Exp getLeft();

  /**
   * Sets the value of the '{@link org.xtext.ui23.dsl.MultDiv#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Exp value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see org.xtext.ui23.dsl.DslPackage#getMultDiv_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.xtext.ui23.dsl.MultDiv#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Exp)
   * @see org.xtext.ui23.dsl.DslPackage#getMultDiv_Right()
   * @model containment="true"
   * @generated
   */
  Exp getRight();

  /**
   * Sets the value of the '{@link org.xtext.ui23.dsl.MultDiv#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Exp value);

} // MultDiv

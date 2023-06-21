/**
 * generated by Xtext 2.29.0
 */
package org.xtext.ui23.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ui23.dsl.Button#getValidate <em>Validate</em>}</li>
 *   <li>{@link org.xtext.ui23.dsl.Button#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.ui23.dsl.DslPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends Element
{
  /**
   * Returns the value of the '<em><b>Validate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Validate</em>' attribute.
   * @see #setValidate(String)
   * @see org.xtext.ui23.dsl.DslPackage#getButton_Validate()
   * @model
   * @generated
   */
  String getValidate();

  /**
   * Sets the value of the '{@link org.xtext.ui23.dsl.Button#getValidate <em>Validate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Validate</em>' attribute.
   * @see #getValidate()
   * @generated
   */
  void setValidate(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.ui23.dsl.DslPackage#getButton_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.ui23.dsl.Button#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Button
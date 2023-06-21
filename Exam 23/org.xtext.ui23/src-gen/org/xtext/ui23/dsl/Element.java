/**
 * generated by Xtext 2.29.0
 */
package org.xtext.ui23.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ui23.dsl.Element#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see org.xtext.ui23.dsl.DslPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends Component
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Exp)
   * @see org.xtext.ui23.dsl.DslPackage#getElement_Exp()
   * @model containment="true"
   * @generated
   */
  Exp getExp();

  /**
   * Sets the value of the '{@link org.xtext.ui23.dsl.Element#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Exp value);

} // Element
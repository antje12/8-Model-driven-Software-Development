/**
 * generated by Xtext 2.29.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Association#isManyFrom <em>Many From</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Association#getFrom <em>From</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Association#isManyTo <em>Many To</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Association#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Relation
{
  /**
   * Returns the value of the '<em><b>Many From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Many From</em>' attribute.
   * @see #setManyFrom(boolean)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAssociation_ManyFrom()
   * @model
   * @generated
   */
  boolean isManyFrom();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Association#isManyFrom <em>Many From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Many From</em>' attribute.
   * @see #isManyFrom()
   * @generated
   */
  void setManyFrom(boolean value);

  /**
   * Returns the value of the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' reference.
   * @see #setFrom(Entity)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAssociation_From()
   * @model
   * @generated
   */
  Entity getFrom();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Association#getFrom <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(Entity value);

  /**
   * Returns the value of the '<em><b>Many To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Many To</em>' attribute.
   * @see #setManyTo(boolean)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAssociation_ManyTo()
   * @model
   * @generated
   */
  boolean isManyTo();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Association#isManyTo <em>Many To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Many To</em>' attribute.
   * @see #isManyTo()
   * @generated
   */
  void setManyTo(boolean value);

  /**
   * Returns the value of the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' reference.
   * @see #setTo(Entity)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getAssociation_To()
   * @model
   * @generated
   */
  Entity getTo();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Association#getTo <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' reference.
   * @see #getTo()
   * @generated
   */
  void setTo(Entity value);

} // Association

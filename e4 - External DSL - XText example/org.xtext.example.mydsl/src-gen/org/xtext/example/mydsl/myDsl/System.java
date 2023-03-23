/**
 * generated by Xtext 2.29.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.System#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.System#getExternals <em>Externals</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.System#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSystem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.System#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Externals</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ExternalDefinitions}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Externals</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSystem_Externals()
   * @model containment="true"
   * @generated
   */
  EList<ExternalDefinitions> getExternals();

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSystem_Elements()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getElements();

} // System

/**
 * generated by Xtext 2.29.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Require;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Require</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RequireImpl#getRequire <em>Require</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequireImpl extends MinimalEObjectImpl.Container implements Require
{
  /**
   * The cached value of the '{@link #getRequire() <em>Require</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequire()
   * @generated
   * @ordered
   */
  protected EObject require;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RequireImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.REQUIRE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getRequire()
  {
    return require;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRequire(EObject newRequire, NotificationChain msgs)
  {
    EObject oldRequire = require;
    require = newRequire;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.REQUIRE__REQUIRE, oldRequire, newRequire);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRequire(EObject newRequire)
  {
    if (newRequire != require)
    {
      NotificationChain msgs = null;
      if (require != null)
        msgs = ((InternalEObject)require).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.REQUIRE__REQUIRE, null, msgs);
      if (newRequire != null)
        msgs = ((InternalEObject)newRequire).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.REQUIRE__REQUIRE, null, msgs);
      msgs = basicSetRequire(newRequire, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.REQUIRE__REQUIRE, newRequire, newRequire));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.REQUIRE__REQUIRE:
        return basicSetRequire(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.REQUIRE__REQUIRE:
        return getRequire();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.REQUIRE__REQUIRE:
        setRequire((EObject)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.REQUIRE__REQUIRE:
        setRequire((EObject)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.REQUIRE__REQUIRE:
        return require != null;
    }
    return super.eIsSet(featureID);
  }

} //RequireImpl

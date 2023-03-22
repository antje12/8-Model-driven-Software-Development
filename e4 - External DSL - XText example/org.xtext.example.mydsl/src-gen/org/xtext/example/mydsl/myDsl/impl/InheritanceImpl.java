/**
 * generated by Xtext 2.29.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.Entity;
import org.xtext.example.mydsl.myDsl.Inheritance;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inheritance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.InheritanceImpl#getBaseEntity <em>Base Entity</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.InheritanceImpl#getSuperEntity <em>Super Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InheritanceImpl extends RelationImpl implements Inheritance
{
  /**
   * The cached value of the '{@link #getBaseEntity() <em>Base Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseEntity()
   * @generated
   * @ordered
   */
  protected Entity baseEntity;

  /**
   * The cached value of the '{@link #getSuperEntity() <em>Super Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperEntity()
   * @generated
   * @ordered
   */
  protected Entity superEntity;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InheritanceImpl()
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
    return MyDslPackage.Literals.INHERITANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entity getBaseEntity()
  {
    if (baseEntity != null && baseEntity.eIsProxy())
    {
      InternalEObject oldBaseEntity = (InternalEObject)baseEntity;
      baseEntity = (Entity)eResolveProxy(oldBaseEntity);
      if (baseEntity != oldBaseEntity)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.INHERITANCE__BASE_ENTITY, oldBaseEntity, baseEntity));
      }
    }
    return baseEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetBaseEntity()
  {
    return baseEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBaseEntity(Entity newBaseEntity)
  {
    Entity oldBaseEntity = baseEntity;
    baseEntity = newBaseEntity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.INHERITANCE__BASE_ENTITY, oldBaseEntity, baseEntity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entity getSuperEntity()
  {
    if (superEntity != null && superEntity.eIsProxy())
    {
      InternalEObject oldSuperEntity = (InternalEObject)superEntity;
      superEntity = (Entity)eResolveProxy(oldSuperEntity);
      if (superEntity != oldSuperEntity)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.INHERITANCE__SUPER_ENTITY, oldSuperEntity, superEntity));
      }
    }
    return superEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetSuperEntity()
  {
    return superEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSuperEntity(Entity newSuperEntity)
  {
    Entity oldSuperEntity = superEntity;
    superEntity = newSuperEntity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.INHERITANCE__SUPER_ENTITY, oldSuperEntity, superEntity));
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
      case MyDslPackage.INHERITANCE__BASE_ENTITY:
        if (resolve) return getBaseEntity();
        return basicGetBaseEntity();
      case MyDslPackage.INHERITANCE__SUPER_ENTITY:
        if (resolve) return getSuperEntity();
        return basicGetSuperEntity();
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
      case MyDslPackage.INHERITANCE__BASE_ENTITY:
        setBaseEntity((Entity)newValue);
        return;
      case MyDslPackage.INHERITANCE__SUPER_ENTITY:
        setSuperEntity((Entity)newValue);
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
      case MyDslPackage.INHERITANCE__BASE_ENTITY:
        setBaseEntity((Entity)null);
        return;
      case MyDslPackage.INHERITANCE__SUPER_ENTITY:
        setSuperEntity((Entity)null);
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
      case MyDslPackage.INHERITANCE__BASE_ENTITY:
        return baseEntity != null;
      case MyDslPackage.INHERITANCE__SUPER_ENTITY:
        return superEntity != null;
    }
    return super.eIsSet(featureID);
  }

} //InheritanceImpl
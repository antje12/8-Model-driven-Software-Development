/**
 * generated by Xtext 2.29.0
 */
package dk.sdu.mmmi.mdsd.math;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.Number#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.math.MathPackage#getNumber()
 * @model
 * @generated
 */
public interface Number extends Exp
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getNumber_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.math.Number#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // Number
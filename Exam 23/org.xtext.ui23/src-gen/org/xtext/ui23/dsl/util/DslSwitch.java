/**
 * generated by Xtext 2.29.0
 */
package org.xtext.ui23.dsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.ui23.dsl.Button;
import org.xtext.ui23.dsl.Compare;
import org.xtext.ui23.dsl.Component;
import org.xtext.ui23.dsl.Concat;
import org.xtext.ui23.dsl.CrossRef;
import org.xtext.ui23.dsl.DslPackage;
import org.xtext.ui23.dsl.Element;
import org.xtext.ui23.dsl.Equal;
import org.xtext.ui23.dsl.Exp;
import org.xtext.ui23.dsl.Form;
import org.xtext.ui23.dsl.FormUse;
import org.xtext.ui23.dsl.FuncCall;
import org.xtext.ui23.dsl.Function;
import org.xtext.ui23.dsl.InputText;
import org.xtext.ui23.dsl.IntConstant;
import org.xtext.ui23.dsl.Label;
import org.xtext.ui23.dsl.Layout;
import org.xtext.ui23.dsl.Length;
import org.xtext.ui23.dsl.MultDiv;
import org.xtext.ui23.dsl.Not;
import org.xtext.ui23.dsl.Parameter;
import org.xtext.ui23.dsl.Parenthesis;
import org.xtext.ui23.dsl.PlusMinus;
import org.xtext.ui23.dsl.StringConstant;
import org.xtext.ui23.dsl.TypeConstant;
import org.xtext.ui23.dsl.UI23;
import org.xtext.ui23.dsl.VarRef;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.ui23.dsl.DslPackage
 * @generated
 */
public class DslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DslPackage.UI23:
      {
        UI23 ui23 = (UI23)theEObject;
        T result = caseUI23(ui23);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.FUNCTION:
      {
        Function function = (Function)theEObject;
        T result = caseFunction(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.FORM:
      {
        Form form = (Form)theEObject;
        T result = caseForm(form);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.LAYOUT:
      {
        Layout layout = (Layout)theEObject;
        T result = caseLayout(layout);
        if (result == null) result = caseComponent(layout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.COMPONENT:
      {
        Component component = (Component)theEObject;
        T result = caseComponent(component);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = caseComponent(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.LABEL:
      {
        Label label = (Label)theEObject;
        T result = caseLabel(label);
        if (result == null) result = caseElement(label);
        if (result == null) result = caseComponent(label);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.INPUT_TEXT:
      {
        InputText inputText = (InputText)theEObject;
        T result = caseInputText(inputText);
        if (result == null) result = caseElement(inputText);
        if (result == null) result = caseCrossRef(inputText);
        if (result == null) result = caseComponent(inputText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.BUTTON:
      {
        Button button = (Button)theEObject;
        T result = caseButton(button);
        if (result == null) result = caseElement(button);
        if (result == null) result = caseComponent(button);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.FORM_USE:
      {
        FormUse formUse = (FormUse)theEObject;
        T result = caseFormUse(formUse);
        if (result == null) result = caseComponent(formUse);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = caseCrossRef(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.EXP:
      {
        Exp exp = (Exp)theEObject;
        T result = caseExp(exp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.CROSS_REF:
      {
        CrossRef crossRef = (CrossRef)theEObject;
        T result = caseCrossRef(crossRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.BOOLEAN:
      {
        org.xtext.ui23.dsl.Boolean boolean_ = (org.xtext.ui23.dsl.Boolean)theEObject;
        T result = caseBoolean(boolean_);
        if (result == null) result = caseExp(boolean_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.EQUAL:
      {
        Equal equal = (Equal)theEObject;
        T result = caseEqual(equal);
        if (result == null) result = caseExp(equal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.COMPARE:
      {
        Compare compare = (Compare)theEObject;
        T result = caseCompare(compare);
        if (result == null) result = caseExp(compare);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.CONCAT:
      {
        Concat concat = (Concat)theEObject;
        T result = caseConcat(concat);
        if (result == null) result = caseExp(concat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.PLUS_MINUS:
      {
        PlusMinus plusMinus = (PlusMinus)theEObject;
        T result = casePlusMinus(plusMinus);
        if (result == null) result = caseExp(plusMinus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.MULT_DIV:
      {
        MultDiv multDiv = (MultDiv)theEObject;
        T result = caseMultDiv(multDiv);
        if (result == null) result = caseExp(multDiv);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.INT_CONSTANT:
      {
        IntConstant intConstant = (IntConstant)theEObject;
        T result = caseIntConstant(intConstant);
        if (result == null) result = caseExp(intConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.STRING_CONSTANT:
      {
        StringConstant stringConstant = (StringConstant)theEObject;
        T result = caseStringConstant(stringConstant);
        if (result == null) result = caseExp(stringConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.NOT:
      {
        Not not = (Not)theEObject;
        T result = caseNot(not);
        if (result == null) result = caseExp(not);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.LENGTH:
      {
        Length length = (Length)theEObject;
        T result = caseLength(length);
        if (result == null) result = caseExp(length);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.TYPE_CONSTANT:
      {
        TypeConstant typeConstant = (TypeConstant)theEObject;
        T result = caseTypeConstant(typeConstant);
        if (result == null) result = caseExp(typeConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.VAR_REF:
      {
        VarRef varRef = (VarRef)theEObject;
        T result = caseVarRef(varRef);
        if (result == null) result = caseExp(varRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.FUNC_CALL:
      {
        FuncCall funcCall = (FuncCall)theEObject;
        T result = caseFuncCall(funcCall);
        if (result == null) result = caseExp(funcCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslPackage.PARENTHESIS:
      {
        Parenthesis parenthesis = (Parenthesis)theEObject;
        T result = caseParenthesis(parenthesis);
        if (result == null) result = caseExp(parenthesis);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UI23</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UI23</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUI23(UI23 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction(Function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Form</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Form</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForm(Form object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLayout(Layout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponent(Component object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabel(Label object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputText(InputText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseButton(Button object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Form Use</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Form Use</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormUse(FormUse object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExp(Exp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cross Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cross Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCrossRef(CrossRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolean(org.xtext.ui23.dsl.Boolean object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEqual(Equal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compare</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compare</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompare(Compare object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Concat</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Concat</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConcat(Concat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plus Minus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plus Minus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlusMinus(PlusMinus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mult Div</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mult Div</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultDiv(MultDiv object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntConstant(IntConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringConstant(StringConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNot(Not object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Length</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Length</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLength(Length object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeConstant(TypeConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVarRef(VarRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Func Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Func Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFuncCall(FuncCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parenthesis</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parenthesis</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParenthesis(Parenthesis object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DslSwitch

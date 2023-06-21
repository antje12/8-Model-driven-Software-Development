/**
 * generated by Xtext 2.29.0
 */
package org.xtext.exam22.validation;

import com.google.common.base.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.exam22.dsl.CrossRef;
import org.xtext.exam22.dsl.DslPackage;
import org.xtext.exam22.dsl.End;
import org.xtext.exam22.dsl.Exp;
import org.xtext.exam22.dsl.FuncCall;
import org.xtext.exam22.dsl.Function;
import org.xtext.exam22.dsl.Model;
import org.xtext.exam22.dsl.MultDiv;
import org.xtext.exam22.dsl.Parameter;
import org.xtext.exam22.dsl.PlusMinus;
import org.xtext.exam22.dsl.Question;
import org.xtext.exam22.dsl.Scenario;
import org.xtext.exam22.dsl.Statement;
import org.xtext.exam22.dsl.Target;
import org.xtext.exam22.dsl.This;
import org.xtext.exam22.dsl.TypeConstant;
import org.xtext.exam22.dsl.VarRef;
import org.xtext.exam22.dsl.VariableDef;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class DslValidator extends AbstractDslValidator {
  public static final String SCENARIO_UNIQUE = "scenario_unique";

  public static final String FUNCTION_UNIQUE = "function_unique";

  public static final String STATEMENT_UNIQUE = "statement_unique";

  public static final String SCENARIO_END = "scenario_end";

  public static final String VALID_INPUT = "valid_input";

  public static final String VALID_THIS = "valid_this";

  public static final String VALID_VARIABLE = "valid_variable";

  @Check
  public void uniqueScenarioName(final Scenario scenario) {
    EObject _eContainer = scenario.eContainer();
    final Function1<Scenario, Boolean> _function = (Scenario it) -> {
      String _name = it.getName();
      String _name_1 = scenario.getName();
      return Boolean.valueOf(Objects.equal(_name, _name_1));
    };
    int _size = IterableExtensions.size(IterableExtensions.<Scenario>filter(((Model) _eContainer).getScenarios(), _function));
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      final String error = String.format("The scenario name must be unique");
      this.error(error, DslPackage.eINSTANCE.getCrossRef_Name(), DslValidator.SCENARIO_UNIQUE);
    }
  }

  @Check
  public void uniqueFunctionName(final Function function) {
    EObject _eContainer = function.eContainer();
    final Function1<Function, Boolean> _function = (Function it) -> {
      String _name = it.getName();
      String _name_1 = function.getName();
      return Boolean.valueOf(Objects.equal(_name, _name_1));
    };
    int _size = IterableExtensions.size(IterableExtensions.<Function>filter(((Model) _eContainer).getFunctions(), _function));
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      final String error = String.format("The function name must be unique");
      this.error(error, DslPackage.eINSTANCE.getCrossRef_Name(), DslValidator.FUNCTION_UNIQUE);
    }
  }

  @Check
  public void uniqueStatementName(final Statement statement) {
    EObject _eContainer = statement.eContainer();
    final Function1<Statement, Boolean> _function = (Statement it) -> {
      String _name = it.getName();
      String _name_1 = statement.getName();
      return Boolean.valueOf(Objects.equal(_name, _name_1));
    };
    int _size = IterableExtensions.size(IterableExtensions.<Statement>filter(((Scenario) _eContainer).getStatements(), _function));
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      final String error = String.format("The statement name must be unique");
      this.error(error, DslPackage.eINSTANCE.getCrossRef_Name(), DslValidator.FUNCTION_UNIQUE);
    }
  }

  @Check
  public void scenarioEnd(final Scenario scenario) {
    final Function1<Statement, Boolean> _function = (Statement it) -> {
      return Boolean.valueOf((it instanceof End));
    };
    int _size = IterableExtensions.size(IterableExtensions.<Statement>filter(scenario.getStatements(), _function));
    boolean _greaterThan = (_size > 0);
    boolean _not = (!_greaterThan);
    if (_not) {
      final String error = String.format("The statement must have an end");
      this.error(error, DslPackage.eINSTANCE.getScenario_Statements(), DslValidator.SCENARIO_END);
    }
  }

  @Check
  public void validInput(final Question question) {
    if (((!(question.getOutput() instanceof TypeConstant)) && (IteratorExtensions.size(IteratorExtensions.<EObject>filter(question.getOutput().eAllContents(), ((Function1<EObject, Boolean>) (EObject it) -> {
      return Boolean.valueOf((it instanceof TypeConstant));
    }))) != 1))) {
      final String error = String.format("The input is not valid");
      this.error(error, DslPackage.eINSTANCE.getQuestion_Output(), DslValidator.VALID_INPUT);
    }
  }

  @Check
  public void funcCallArguments(final FuncCall funcCall) {
    for (int i = 0; (i < funcCall.getExpressions().size()); i++) {
      {
        final Exp input = funcCall.getExpressions().get(i);
        final String type = this.getType(funcCall, input);
        String _get = funcCall.getRef().getTypes().get(i);
        boolean _notEquals = (!Objects.equal(type, _get));
        if (_notEquals) {
          this.error(
            "Wrong function argument", 
            DslPackage.Literals.FUNC_CALL__EXPRESSIONS, i);
          return;
        }
      }
    }
  }

  public String getType(final EObject current, final Exp input) {
    String _xifexpression = null;
    if ((input instanceof TypeConstant)) {
      _xifexpression = ((TypeConstant)input).getType();
    } else {
      String _xifexpression_1 = null;
      if ((input instanceof VarRef)) {
        String _xifexpression_2 = null;
        CrossRef _ref = ((VarRef)input).getRef();
        if ((_ref instanceof VariableDef)) {
          CrossRef _ref_1 = ((VarRef)input).getRef();
          _xifexpression_2 = ((VariableDef) _ref_1).getType();
        } else {
          String _xifexpression_3 = null;
          CrossRef _ref_2 = ((VarRef)input).getRef();
          if ((_ref_2 instanceof Parameter)) {
            CrossRef _ref_3 = ((VarRef)input).getRef();
            _xifexpression_3 = ((Parameter) _ref_3).getType();
          } else {
            _xifexpression_3 = null;
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      } else {
        String _xifexpression_4 = null;
        if ((input instanceof This)) {
          final Function1<EObject, Boolean> _function = (EObject it) -> {
            return Boolean.valueOf((it instanceof TypeConstant));
          };
          EObject _findFirst = IteratorExtensions.<EObject>findFirst(EcoreUtil2.<Question>getContainerOfType(current, Question.class).getOutput().eAllContents(), _function);
          _xifexpression_4 = ((TypeConstant) _findFirst).getType();
        } else {
          String _xifexpression_5 = null;
          if ((input instanceof FuncCall)) {
            _xifexpression_5 = ((FuncCall)input).getRef().getReturnType();
          } else {
            String _xifexpression_6 = null;
            if ((input instanceof PlusMinus)) {
              _xifexpression_6 = this.getType(current, ((PlusMinus)input).getLeft());
            } else {
              String _xifexpression_7 = null;
              if ((input instanceof MultDiv)) {
                _xifexpression_7 = this.getType(current, ((MultDiv)input).getLeft());
              } else {
                _xifexpression_7 = null;
              }
              _xifexpression_6 = _xifexpression_7;
            }
            _xifexpression_5 = _xifexpression_6;
          }
          _xifexpression_4 = _xifexpression_5;
        }
        _xifexpression_1 = _xifexpression_4;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }

  @Check
  public void scenarioCallArguments(final Target target) {
    if (((target.getTo() instanceof Scenario) && (!target.getExpressions().isEmpty()))) {
      for (int i = 0; (i < target.getExpressions().size()); i++) {
        {
          final Exp input = target.getExpressions().get(i);
          final String type = this.getType(target, input);
          CrossRef _to = target.getTo();
          String _type = ((Scenario) _to).getParameters().get(i).getType();
          boolean _notEquals = (!Objects.equal(type, _type));
          if (_notEquals) {
            this.error(
              "Wrong scenario argument", 
              DslPackage.Literals.TARGET__EXPRESSIONS, i);
            return;
          }
        }
      }
    }
  }
}
package org.xtext.ui23.generator;

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.xtext.ui23.dsl.Compare;
import org.xtext.ui23.dsl.Concat;
import org.xtext.ui23.dsl.Equal;
import org.xtext.ui23.dsl.Exp;
import org.xtext.ui23.dsl.FuncCall;
import org.xtext.ui23.dsl.IntConstant;
import org.xtext.ui23.dsl.Length;
import org.xtext.ui23.dsl.MultDiv;
import org.xtext.ui23.dsl.Not;
import org.xtext.ui23.dsl.Parenthesis;
import org.xtext.ui23.dsl.PlusMinus;
import org.xtext.ui23.dsl.StringConstant;
import org.xtext.ui23.dsl.TypeConstant;
import org.xtext.ui23.dsl.VarRef;

@SuppressWarnings("all")
public class ExpressionGenerator {
  protected static CharSequence _computeExp(final org.xtext.ui23.dsl.Boolean bool) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _computeExp = ExpressionGenerator.computeExp(bool.getLeft());
    _builder.append(_computeExp);
    _builder.append(" ");
    String _op = bool.getOp();
    _builder.append(_op);
    _builder.append(" ");
    CharSequence _computeExp_1 = ExpressionGenerator.computeExp(bool.getRight());
    _builder.append(_computeExp_1);
    _builder.append(")");
    return _builder;
  }

  protected static CharSequence _computeExp(final Equal equal) {
    CharSequence _switchResult = null;
    String _op = equal.getOp();
    if (_op != null) {
      switch (_op) {
        case "==":
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("(");
          CharSequence _computeExp = ExpressionGenerator.computeExp(equal.getLeft());
          _builder.append(_computeExp);
          _builder.append(").equals(");
          CharSequence _computeExp_1 = ExpressionGenerator.computeExp(equal.getRight());
          _builder.append(_computeExp_1);
          _builder.append(")");
          _switchResult = _builder;
          break;
        case "!=":
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("!(");
          CharSequence _computeExp_2 = ExpressionGenerator.computeExp(equal.getLeft());
          _builder_1.append(_computeExp_2);
          _builder_1.append(").equals(");
          CharSequence _computeExp_3 = ExpressionGenerator.computeExp(equal.getRight());
          _builder_1.append(_computeExp_3);
          _builder_1.append(")");
          _switchResult = _builder_1;
          break;
      }
    }
    return _switchResult;
  }

  protected static CharSequence _computeExp(final Compare compare) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _computeExp = ExpressionGenerator.computeExp(compare.getLeft());
    _builder.append(_computeExp);
    _builder.append(" ");
    String _op = compare.getOp();
    _builder.append(_op);
    _builder.append(" ");
    CharSequence _computeExp_1 = ExpressionGenerator.computeExp(compare.getRight());
    _builder.append(_computeExp_1);
    _builder.append(")");
    return _builder;
  }

  protected static CharSequence _computeExp(final Concat concat) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _computeExp = ExpressionGenerator.computeExp(concat.getLeft());
    _builder.append(_computeExp);
    _builder.append(" + ");
    CharSequence _computeExp_1 = ExpressionGenerator.computeExp(concat.getRight());
    _builder.append(_computeExp_1);
    _builder.append(")");
    return _builder;
  }

  protected static CharSequence _computeExp(final PlusMinus plusMinus) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _computeExp = ExpressionGenerator.computeExp(plusMinus.getLeft());
    _builder.append(_computeExp);
    _builder.append(" ");
    String _op = plusMinus.getOp();
    _builder.append(_op);
    _builder.append(" ");
    CharSequence _computeExp_1 = ExpressionGenerator.computeExp(plusMinus.getRight());
    _builder.append(_computeExp_1);
    _builder.append(")");
    return _builder;
  }

  protected static CharSequence _computeExp(final MultDiv multDiv) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _computeExp = ExpressionGenerator.computeExp(multDiv.getLeft());
    _builder.append(_computeExp);
    _builder.append(" ");
    String _op = multDiv.getOp();
    _builder.append(_op);
    _builder.append(" ");
    CharSequence _computeExp_1 = ExpressionGenerator.computeExp(multDiv.getRight());
    _builder.append(_computeExp_1);
    _builder.append(")");
    return _builder;
  }

  protected static CharSequence _computeExp(final IntConstant primitive) {
    StringConcatenation _builder = new StringConcatenation();
    int _value = primitive.getValue();
    _builder.append(_value);
    return _builder;
  }

  protected static CharSequence _computeExp(final StringConstant primitive) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    String _value = primitive.getValue();
    _builder.append(_value);
    _builder.append("\"");
    return _builder;
  }

  protected static CharSequence _computeExp(final Not primitive) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("!(");
    CharSequence _computeExp = ExpressionGenerator.computeExp(primitive.getExp());
    _builder.append(_computeExp);
    _builder.append(")");
    return _builder;
  }

  protected static CharSequence _computeExp(final Length primitive) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _computeExp = ExpressionGenerator.computeExp(primitive.getExp());
    _builder.append(_computeExp);
    _builder.append(".length()");
    return _builder;
  }

  protected static CharSequence _computeExp(final TypeConstant primitive) {
    StringConcatenation _builder = new StringConcatenation();
    String _javaName = Extensions.javaName(primitive.getType());
    _builder.append(_javaName);
    return _builder;
  }

  protected static CharSequence _computeExp(final VarRef primitive) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = primitive.getRef().getName();
    _builder.append(_name);
    return _builder;
  }

  protected static CharSequence _computeExp(final FuncCall primitive) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("external.");
    String _name = primitive.getRef().getName();
    _builder.append(_name);
    _builder.append("(");
    {
      EList<Exp> _exps = primitive.getExps();
      boolean _hasElements = false;
      for(final Exp exp : _exps) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        CharSequence _computeExp = ExpressionGenerator.computeExp(exp);
        _builder.append(_computeExp);
      }
    }
    _builder.append(")");
    return _builder;
  }

  protected static CharSequence _computeExp(final Parenthesis primitive) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _computeExp = ExpressionGenerator.computeExp(primitive.getExp());
    _builder.append(_computeExp);
    _builder.append(")");
    return _builder;
  }

  public static CharSequence computeExp(final Exp bool) {
    if (bool instanceof org.xtext.ui23.dsl.Boolean) {
      return _computeExp((org.xtext.ui23.dsl.Boolean)bool);
    } else if (bool instanceof Compare) {
      return _computeExp((Compare)bool);
    } else if (bool instanceof Concat) {
      return _computeExp((Concat)bool);
    } else if (bool instanceof Equal) {
      return _computeExp((Equal)bool);
    } else if (bool instanceof FuncCall) {
      return _computeExp((FuncCall)bool);
    } else if (bool instanceof IntConstant) {
      return _computeExp((IntConstant)bool);
    } else if (bool instanceof Length) {
      return _computeExp((Length)bool);
    } else if (bool instanceof MultDiv) {
      return _computeExp((MultDiv)bool);
    } else if (bool instanceof Not) {
      return _computeExp((Not)bool);
    } else if (bool instanceof Parenthesis) {
      return _computeExp((Parenthesis)bool);
    } else if (bool instanceof PlusMinus) {
      return _computeExp((PlusMinus)bool);
    } else if (bool instanceof StringConstant) {
      return _computeExp((StringConstant)bool);
    } else if (bool instanceof TypeConstant) {
      return _computeExp((TypeConstant)bool);
    } else if (bool instanceof VarRef) {
      return _computeExp((VarRef)bool);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(bool).toString());
    }
  }
}

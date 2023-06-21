package org.xtext.ui23.generator;

import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.ui23.dsl.Exp;
import org.xtext.ui23.dsl.Form;
import org.xtext.ui23.dsl.FormUse;
import org.xtext.ui23.dsl.InputText;
import org.xtext.ui23.dsl.TypeConstant;

@SuppressWarnings("all")
public class ValidityCheckGenerator {
  public static CharSequence generateValidityCheck(final Form form) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public boolean checkValidity(){");
    _builder.newLine();
    {
      List<InputText> _allContentsOfType = EcoreUtil2.<InputText>getAllContentsOfType(form, InputText.class);
      for(final InputText input : _allContentsOfType) {
        _builder.append("\t");
        final String type = EcoreUtil2.<TypeConstant>getAllContentsOfType(input, TypeConstant.class).get(0).getType();
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        CharSequence _switchResult = null;
        if (type != null) {
          switch (type) {
            case "string":
              _switchResult = ValidityCheckGenerator.validateString(input);
              break;
            case "number":
              _switchResult = ValidityCheckGenerator.validateNumber(input);
              break;
          }
        }
        _builder.append(_switchResult, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      List<FormUse> _allContentsOfType_1 = EcoreUtil2.<FormUse>getAllContentsOfType(form, FormUse.class);
      for(final FormUse formUse : _allContentsOfType_1) {
        _builder.append("\t");
        _builder.append("if(!");
        String _firstLower = StringExtensions.toFirstLower(formUse.getForm().getName());
        _builder.append(_firstLower, "\t");
        _builder.append(".checkValidity())");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return false;");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public static CharSequence validateString(final InputText input) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("String ");
    String _name = input.getName();
    _builder.append(_name);
    _builder.append(" = this.");
    String _name_1 = input.getName();
    _builder.append(_name_1);
    _builder.append("Component.getText();");
    _builder.newLineIfNotEmpty();
    {
      Exp _exp = input.getExp();
      boolean _not = (!(_exp instanceof TypeConstant));
      if (_not) {
        _builder.append("if(!");
        String _replace = ExpressionGenerator.computeExp(input.getExp()).toString().replace("String", input.getName());
        _builder.append(_replace);
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return false;");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }

  public static CharSequence validateNumber(final InputText input) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("int ");
    String _name = input.getName();
    _builder.append(_name);
    _builder.append(" = 0;");
    _builder.newLineIfNotEmpty();
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t");
    String _name_1 = input.getName();
    _builder.append(_name_1, "\t");
    _builder.append(" = Integer.parseInt(this.");
    String _name_2 = input.getName();
    _builder.append(_name_2, "\t");
    _builder.append("Component.getText());");
    _builder.newLineIfNotEmpty();
    {
      Exp _exp = input.getExp();
      boolean _not = (!(_exp instanceof TypeConstant));
      if (_not) {
        _builder.append("\t");
        _builder.append("if(!");
        String _replace = ExpressionGenerator.computeExp(input.getExp()).toString().replace("int", input.getName());
        _builder.append(_replace, "\t");
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return false;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("} catch (Exception ex) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}

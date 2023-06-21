package org.xtext.ui23.generator;

import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.ui23.dsl.Button;
import org.xtext.ui23.dsl.Component;
import org.xtext.ui23.dsl.Exp;
import org.xtext.ui23.dsl.Form;
import org.xtext.ui23.dsl.FormUse;
import org.xtext.ui23.dsl.InputText;
import org.xtext.ui23.dsl.Label;
import org.xtext.ui23.dsl.Layout;
import org.xtext.ui23.dsl.Parameter;
import org.xtext.ui23.dsl.UI23;

@SuppressWarnings("all")
public class FormGenerator {
  public static CharSequence generateForm(final String pkg, final UI23 model, final Form form) {
    CharSequence _xblockexpression = null;
    {
      int _panelCall = DslGenerator.panelCall;
      DslGenerator.panelCall = (_panelCall + 1);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package user_interface.");
      _builder.append(pkg);
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("import javax.swing.*;");
      _builder.newLine();
      _builder.append("import java.awt.event.*;");
      _builder.newLine();
      _builder.append("import user_interface.common.*;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public class ");
      String _name = form.getName();
      _builder.append(_name);
      _builder.append("Form extends Form{");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      {
        List<InputText> _allContentsOfType = EcoreUtil2.<InputText>getAllContentsOfType(form, InputText.class);
        for(final InputText input : _allContentsOfType) {
          _builder.append("\t");
          _builder.append("public JTextField ");
          String _name_1 = input.getName();
          _builder.append(_name_1, "\t");
          _builder.append("Component;");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        List<Button> _allContentsOfType_1 = EcoreUtil2.<Button>getAllContentsOfType(form, Button.class);
        for(final Button button : _allContentsOfType_1) {
          _builder.append("\t");
          _builder.append("public JButton ");
          String _name_2 = button.getName();
          _builder.append(_name_2, "\t");
          _builder.append("Component;");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        List<FormUse> _allContentsOfType_2 = EcoreUtil2.<FormUse>getAllContentsOfType(form, FormUse.class);
        for(final FormUse formUse : _allContentsOfType_2) {
          _builder.append("\t");
          _builder.append("Form ");
          String _firstLower = StringExtensions.toFirstLower(formUse.getForm().getName());
          _builder.append(_firstLower, "\t");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      _builder.append("UserInterface parent;");
      _builder.newLine();
      {
        boolean _isEmpty = model.getFunctions().isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          _builder.append("\t");
          _builder.append("External external;");
          _builder.newLine();
        }
      }
      {
        EList<Parameter> _parameters = form.getParameters();
        for(final Parameter param : _parameters) {
          _builder.append("\t");
          String _javaName = Extensions.javaName(param.getType());
          _builder.append(_javaName, "\t");
          _builder.append(" ");
          String _name_3 = param.getName();
          _builder.append(_name_3, "\t");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      String _name_4 = form.getName();
      _builder.append(_name_4, "\t");
      _builder.append("Form(UserInterface parent");
      String _xifexpression = null;
      boolean _isEmpty_1 = model.getFunctions().isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _xifexpression = ", External external";
      } else {
        _xifexpression = "";
      }
      _builder.append(_xifexpression, "\t");
      {
        boolean _isEmpty_2 = form.getParameters().isEmpty();
        boolean _not_2 = (!_isEmpty_2);
        if (_not_2) {
          _builder.append(", ");
          {
            EList<Parameter> _parameters_1 = form.getParameters();
            boolean _hasElements = false;
            for(final Parameter param_1 : _parameters_1) {
              if (!_hasElements) {
                _hasElements = true;
              } else {
                _builder.appendImmediate(", ", "\t");
              }
              String _javaName_1 = Extensions.javaName(param_1.getType());
              _builder.append(_javaName_1, "\t");
              _builder.append(" ");
              String _name_5 = param_1.getName();
              _builder.append(_name_5, "\t");
            }
          }
        }
      }
      _builder.append(") {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("this.parent = parent;");
      _builder.newLine();
      {
        boolean _isEmpty_3 = model.getFunctions().isEmpty();
        boolean _not_3 = (!_isEmpty_3);
        if (_not_3) {
          _builder.append("\t\t");
          _builder.append("this.external = external;");
          _builder.newLine();
        }
      }
      {
        List<InputText> _allContentsOfType_3 = EcoreUtil2.<InputText>getAllContentsOfType(form, InputText.class);
        for(final InputText input_1 : _allContentsOfType_3) {
          _builder.append("\t\t");
          String _name_6 = input_1.getName();
          _builder.append(_name_6, "\t\t");
          _builder.append("Component = new JTextField();");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        List<Button> _allContentsOfType_4 = EcoreUtil2.<Button>getAllContentsOfType(form, Button.class);
        for(final Button button_1 : _allContentsOfType_4) {
          _builder.append("\t\t");
          String _name_7 = button_1.getName();
          _builder.append(_name_7, "\t\t");
          _builder.append("Component = new JButton(");
          CharSequence _computeExp = ExpressionGenerator.computeExp(button_1.getExp());
          _builder.append(_computeExp, "\t\t");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        EList<Parameter> _parameters_2 = form.getParameters();
        for(final Parameter param_2 : _parameters_2) {
          _builder.append("\t\t");
          _builder.append("this.");
          String _name_8 = param_2.getName();
          _builder.append(_name_8, "\t\t");
          _builder.append(" = ");
          String _name_9 = param_2.getName();
          _builder.append(_name_9, "\t\t");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public JPanel createPanel(){");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return createPanel");
      _builder.append(DslGenerator.panelCall, "\t\t");
      _builder.append("();");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      {
        List<Layout> _allContentsOfType_5 = EcoreUtil2.<Layout>getAllContentsOfType(form, Layout.class);
        for(final Layout layout : _allContentsOfType_5) {
          _builder.append("\t");
          CharSequence _generateLayout = FormGenerator.generateLayout(layout, model);
          _builder.append(_generateLayout, "\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      _builder.append("\t");
      CharSequence _generateValidityCheck = ValidityCheckGenerator.generateValidityCheck(form);
      _builder.append(_generateValidityCheck, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }

  public static CharSequence generateLayout(final Layout layout, final UI23 model) {
    CharSequence _xblockexpression = null;
    {
      int _panelCreate = DslGenerator.panelCreate;
      DslGenerator.panelCreate = (_panelCreate + 1);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public JPanel createPanel");
      _builder.append(DslGenerator.panelCreate);
      _builder.append("() {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("JPanel panel = new JPanel();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("panel.setLayout(new BoxLayout(panel, ");
      String _xifexpression = null;
      String _axis = layout.getAxis();
      boolean _equals = Objects.equal(_axis, "row");
      if (_equals) {
        _xifexpression = "BoxLayout.X_AXIS";
      } else {
        _xifexpression = "BoxLayout.Y_AXIS";
      }
      _builder.append(_xifexpression, "\t");
      _builder.append("));");
      _builder.newLineIfNotEmpty();
      {
        EList<Component> _components = layout.getComponents();
        for(final Component component : _components) {
          _builder.append("\t");
          CharSequence _computeComponent = FormGenerator.computeComponent(component, model);
          _builder.append(_computeComponent, "\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      _builder.append("return panel;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }

  protected static CharSequence _computeComponent(final Layout layout, final UI23 model) {
    CharSequence _xblockexpression = null;
    {
      int _panelCall = DslGenerator.panelCall;
      DslGenerator.panelCall = (_panelCall + 1);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("panel.add(createPanel");
      _builder.append(DslGenerator.panelCall);
      _builder.append("());");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }

  protected static CharSequence _computeComponent(final Label label, final UI23 model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("panel.add(new JLabel(");
    CharSequence _computeExp = ExpressionGenerator.computeExp(label.getExp());
    _builder.append(_computeExp);
    _builder.append("));");
    return _builder;
  }

  protected static CharSequence _computeComponent(final InputText inputText, final UI23 model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("panel.add(");
    String _name = inputText.getName();
    _builder.append(_name);
    _builder.append("Component);");
    return _builder;
  }

  protected static CharSequence _computeComponent(final Button button, final UI23 model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("panel.add(");
    String _name = button.getName();
    _builder.append(_name);
    _builder.append("Component);");
    _builder.newLineIfNotEmpty();
    {
      String _validate = button.getValidate();
      boolean _tripleNotEquals = (_validate != null);
      if (_tripleNotEquals) {
        String _name_1 = button.getName();
        _builder.append(_name_1);
        _builder.append("Component.addActionListener(new ActionListener(){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("public void actionPerformed(ActionEvent e){");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("if(checkValidity()){");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("JOptionPane.showMessageDialog(");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("parent.frame, ");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("\"Data has been saved\");");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("else {");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("JOptionPane.showMessageDialog(");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("parent.frame, ");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("\"Validation Error\", ");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("\"Error\",");
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("JOptionPane.ERROR_MESSAGE);");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("});");
        _builder.newLine();
      }
    }
    return _builder;
  }

  protected static CharSequence _computeComponent(final FormUse formUse, final UI23 model) {
    StringConcatenation _builder = new StringConcatenation();
    String _firstLower = StringExtensions.toFirstLower(formUse.getForm().getName());
    _builder.append(_firstLower);
    _builder.append(" = new ");
    String _name = formUse.getForm().getName();
    _builder.append(_name);
    _builder.append("Form(parent");
    String _xifexpression = null;
    boolean _isEmpty = model.getFunctions().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      _xifexpression = ", external";
    } else {
      _xifexpression = "";
    }
    _builder.append(_xifexpression);
    {
      boolean _isEmpty_1 = formUse.getExps().isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append(", ");
        {
          EList<Exp> _exps = formUse.getExps();
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
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("panel.add(");
    String _firstLower_1 = StringExtensions.toFirstLower(formUse.getForm().getName());
    _builder.append(_firstLower_1);
    _builder.append(".createPanel());");
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  public static CharSequence computeComponent(final Component button, final UI23 model) {
    if (button instanceof Button) {
      return _computeComponent((Button)button, model);
    } else if (button instanceof InputText) {
      return _computeComponent((InputText)button, model);
    } else if (button instanceof Label) {
      return _computeComponent((Label)button, model);
    } else if (button instanceof FormUse) {
      return _computeComponent((FormUse)button, model);
    } else if (button instanceof Layout) {
      return _computeComponent((Layout)button, model);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(button, model).toString());
    }
  }
}

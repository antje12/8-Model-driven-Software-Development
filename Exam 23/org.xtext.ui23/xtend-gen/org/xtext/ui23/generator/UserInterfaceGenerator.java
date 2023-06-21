package org.xtext.ui23.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.xtext.ui23.dsl.Form;
import org.xtext.ui23.dsl.UI23;

@SuppressWarnings("all")
public class UserInterfaceGenerator {
  public static CharSequence generateUserInterface(final String pkg, final UI23 model, final Form form) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package user_interface.");
    _builder.append(pkg);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("import javax.swing.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class UserInterface{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public JFrame frame;");
    _builder.newLine();
    _builder.newLine();
    {
      boolean _isEmpty = model.getFunctions().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\t");
        _builder.append("External external;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public UserInterface(External external){");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("this.external = external;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("public void open() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("frame = new JFrame(\"");
    String _name = model.getName();
    _builder.append(_name, "\t\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);");
    _builder.newLine();
    _builder.append("\t\t");
    String _name_1 = form.getName();
    _builder.append(_name_1, "\t\t");
    _builder.append("Form form = new ");
    String _name_2 = form.getName();
    _builder.append(_name_2, "\t\t");
    _builder.append("Form(this");
    String _xifexpression = null;
    boolean _isEmpty_1 = model.getFunctions().isEmpty();
    boolean _not_1 = (!_isEmpty_1);
    if (_not_1) {
      _xifexpression = ", external";
    } else {
      _xifexpression = "";
    }
    _builder.append(_xifexpression, "\t\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("frame.add(form.createPanel());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("frame.pack();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("frame.setVisible(true);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}

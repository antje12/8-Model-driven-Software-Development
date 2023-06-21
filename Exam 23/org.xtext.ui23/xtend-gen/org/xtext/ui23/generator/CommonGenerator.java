package org.xtext.ui23.generator;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CommonGenerator {
  public static CharSequence generateCommon() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package user_interface.common;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import javax.swing.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public abstract class Form{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public abstract boolean checkValidity();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public abstract JPanel createPanel();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}

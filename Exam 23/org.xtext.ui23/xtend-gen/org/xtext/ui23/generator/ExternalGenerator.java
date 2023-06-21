package org.xtext.ui23.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.xtext.ui23.dsl.Function;
import org.xtext.ui23.dsl.UI23;

@SuppressWarnings("all")
public class ExternalGenerator {
  public static CharSequence generateExternal(final String pkg, final UI23 model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package user_interface.");
    _builder.append(pkg);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public interface External {");
    _builder.newLine();
    _builder.append("\t");
    int i = 0;
    _builder.newLineIfNotEmpty();
    {
      EList<Function> _functions = model.getFunctions();
      for(final Function function : _functions) {
        _builder.append("\t");
        _builder.append("public ");
        String _javaName = Extensions.javaName(function.getReturnType());
        _builder.append(_javaName, "\t");
        _builder.append(" ");
        String _name = function.getName();
        _builder.append(_name, "\t");
        _builder.append("(");
        {
          EList<String> _types = function.getTypes();
          boolean _hasElements = false;
          for(final String type : _types) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "\t");
            }
            String _javaName_1 = Extensions.javaName(type);
            _builder.append(_javaName_1, "\t");
            _builder.append(" param");
            int _plusPlus = i++;
            _builder.append(_plusPlus, "\t");
          }
        }
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}

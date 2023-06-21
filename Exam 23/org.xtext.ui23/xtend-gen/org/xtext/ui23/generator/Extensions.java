package org.xtext.ui23.generator;

@SuppressWarnings("all")
public class Extensions {
  public static String javaName(final String type) {
    String _switchResult = null;
    if (type != null) {
      switch (type) {
        case "string":
          _switchResult = "String";
          break;
        case "number":
          _switchResult = "int";
          break;
        default:
          _switchResult = type;
          break;
      }
    } else {
      _switchResult = type;
    }
    return _switchResult;
  }
}

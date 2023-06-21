/**
 * generated by Xtext 2.29.0
 */
package org.xtext.example.mydsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.example.mydsl.myDsl.Association;
import org.xtext.example.mydsl.myDsl.Attribute;
import org.xtext.example.mydsl.myDsl.Entity;
import org.xtext.example.mydsl.myDsl.EntitySystem;
import org.xtext.example.mydsl.myDsl.ExternalDefinition;
import org.xtext.example.mydsl.myDsl.Inheritance;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MyDslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EntitySystem sys = ((EntitySystem[])Conversions.unwrapArray((Iterables.<EntitySystem>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), EntitySystem.class)), EntitySystem.class))[0];
    String _firstLower = StringExtensions.toFirstLower(sys.getName());
    String _plus = (_firstLower + "/ExternalCode.java");
    fsa.generateFile(_plus, this.compileInterface(sys));
    Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entity.class);
    for (final Entity entity : _filter) {
      {
        final Function1<Inheritance, Boolean> _function = (Inheritance it) -> {
          Entity _baseEntity = it.getBaseEntity();
          return Boolean.valueOf(Objects.equal(_baseEntity, entity));
        };
        Inheritance relation = IterableExtensions.<Inheritance>findFirst(Iterables.<Inheritance>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Inheritance.class), _function);
        final Function1<Association, Boolean> _function_1 = (Association it) -> {
          return Boolean.valueOf((Objects.equal(it.getFrom(), entity) || Objects.equal(it.getTo(), entity)));
        };
        Iterable<Association> associations = IterableExtensions.<Association>filter(Iterables.<Association>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Association.class), _function_1);
        String _firstLower_1 = StringExtensions.toFirstLower(sys.getName());
        String _plus_1 = (_firstLower_1 + "/");
        String _name = entity.getName();
        String _plus_2 = (_plus_1 + _name);
        String _plus_3 = (_plus_2 + ".java");
        fsa.generateFile(_plus_3, this.compile(entity, sys, relation, IterableExtensions.<Association>toList(associations)));
      }
    }
  }

  public CharSequence compileInterface(final EntitySystem sys) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _firstLower = StringExtensions.toFirstLower(sys.getName());
    _builder.append(_firstLower);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("public interface ExternalCode {");
    _builder.newLine();
    {
      EList<ExternalDefinition> _externals = sys.getExternals();
      for(final ExternalDefinition external : _externals) {
        _builder.append("    ");
        int i = 0;
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("public boolean ");
        String _name = external.getName();
        _builder.append(_name, "    ");
        _builder.append("(");
        {
          EList<String> _types = external.getTypes();
          boolean _hasElements = false;
          for(final String type : _types) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "    ");
            }
            String _javaType = this.javaType(type);
            _builder.append(_javaType, "    ");
            _builder.append(" name");
            int _plusPlus = i++;
            _builder.append(_plusPlus, "    ");
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

  public CharSequence compile(final Entity entity, final EntitySystem system, final Inheritance inheritance, final List<Association> associations) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _firstLower = StringExtensions.toFirstLower(system.getName());
    _builder.append(_firstLower);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = entity.getName();
    _builder.append(_name);
    _builder.append(" ");
    {
      if ((inheritance != null)) {
        _builder.append("extends ");
        String _name_1 = inheritance.getSuperEntity().getName();
        _builder.append(_name_1);
        _builder.append(" ");
      }
    }
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private ExternalCode externalCode;");
    _builder.newLine();
    _builder.newLine();
    {
      List<Attribute> _attributes = this.attributes(entity);
      for(final Attribute attribute : _attributes) {
        _builder.append("    ");
        _builder.append("private ");
        String _javaType = this.javaType(attribute);
        _builder.append(_javaType, "    ");
        _builder.append(" ");
        String _name_2 = attribute.getName();
        _builder.append(_name_2, "    ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      for(final Association association : associations) {
        _builder.append("    ");
        CharSequence _compileInstanceVariables = this.compileInstanceVariables(entity, association);
        _builder.append(_compileInstanceVariables, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    String _name_3 = entity.getName();
    _builder.append(_name_3, "    ");
    _builder.append("(ExternalCode externalCode, ");
    String _compileConstructorAttributes = this.compileConstructorAttributes(entity, inheritance);
    _builder.append(_compileConstructorAttributes, "    ");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    {
      if ((inheritance != null)) {
        _builder.append("        ");
        _builder.append("super(externalCode, ");
        {
          List<Attribute> _attributes_1 = this.attributes(inheritance.getSuperEntity());
          boolean _hasElements = false;
          for(final Attribute attribute_1 : _attributes_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "        ");
            }
            String _name_4 = attribute_1.getName();
            _builder.append(_name_4, "        ");
          }
        }
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("        ");
    _builder.append("this.externalCode = externalCode;");
    _builder.newLine();
    {
      List<Attribute> _attributes_2 = this.attributes(entity);
      for(final Attribute attribute_2 : _attributes_2) {
        _builder.append("        ");
        _builder.append("this.set");
        String _firstUpper = StringExtensions.toFirstUpper(attribute_2.getName());
        _builder.append(_firstUpper, "        ");
        _builder.append("(");
        String _name_5 = attribute_2.getName();
        _builder.append(_name_5, "        ");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    {
      List<Attribute> _attributes_3 = this.attributes(entity);
      for(final Attribute attribute_3 : _attributes_3) {
        _builder.append("    ");
        _builder.append("public ");
        String _javaType_1 = this.javaType(attribute_3);
        _builder.append(_javaType_1, "    ");
        _builder.append(" get");
        String _firstUpper_1 = StringExtensions.toFirstUpper(attribute_3.getName());
        _builder.append(_firstUpper_1, "    ");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("return ");
        String _name_6 = attribute_3.getName();
        _builder.append(_name_6, "        ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("public void set");
        String _firstUpper_2 = StringExtensions.toFirstUpper(attribute_3.getName());
        _builder.append(_firstUpper_2, "    ");
        _builder.append("(");
        String _javaType_2 = this.javaType(attribute_3);
        _builder.append(_javaType_2, "    ");
        _builder.append(" ");
        String _name_7 = attribute_3.getName();
        _builder.append(_name_7, "    ");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("this.");
        String _name_8 = attribute_3.getName();
        _builder.append(_name_8, "        ");
        _builder.append(" = ");
        String _name_9 = attribute_3.getName();
        _builder.append(_name_9, "        ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.newLine();
    {
      for(final Association association_1 : associations) {
        _builder.append("    ");
        CharSequence _compileAssociationMethods = this.compileAssociationMethods(entity, association_1);
        _builder.append(_compileAssociationMethods, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public String javaType(final Attribute attribute) {
    return this.javaType(attribute.getType());
  }

  public String javaType(final String type) {
    String _switchResult = null;
    if (type != null) {
      switch (type) {
        case "string":
          _switchResult = "String";
          break;
        case "number":
          _switchResult = "int";
          break;
      }
    }
    return _switchResult;
  }

  public String compileConstructorAttributes(final Entity base, final Inheritance inheritance) {
    String _xblockexpression = null;
    {
      final Function1<Attribute, String> _function = (Attribute it) -> {
        String _javaType = this.javaType(it);
        String _plus = (_javaType + " ");
        String _name = it.getName();
        return (_plus + _name);
      };
      String[] attributes = ((String[])Conversions.unwrapArray(ListExtensions.<Attribute, String>map(this.attributes(base), _function), String.class));
      if ((inheritance != null)) {
        final String[] _converted_attributes = (String[])attributes;
        final Function1<Attribute, String> _function_1 = (Attribute it) -> {
          String _javaType = this.javaType(it);
          String _plus = (_javaType + " ");
          String _name = it.getName();
          return (_plus + _name);
        };
        List<String> _map = ListExtensions.<Attribute, String>map(this.attributes(inheritance.getSuperEntity()), _function_1);
        Iterable<String> _plus = Iterables.<String>concat(((Iterable<? extends String>)Conversions.doWrapArray(_converted_attributes)), _map);
        attributes = ((String[])Conversions.unwrapArray(_plus, String.class));
      }
      final String[] _converted_attributes_1 = (String[])attributes;
      _xblockexpression = IterableExtensions.join(((Iterable<?>)Conversions.doWrapArray(_converted_attributes_1)), ", ");
    }
    return _xblockexpression;
  }

  public CharSequence compileInstanceVariables(final Entity entity, final Association association) {
    CharSequence _xblockexpression = null;
    {
      final Entity otherEntity = this.associationEntity(entity, association);
      final boolean cardinality = this.associationCardinality(entity, association);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("private ");
      {
        if (cardinality) {
          _builder.append("List<");
        }
      }
      String _name = otherEntity.getName();
      _builder.append(_name);
      {
        if (cardinality) {
          _builder.append(">");
        }
      }
      _builder.append(" ");
      String _associationVariableName = this.associationVariableName(entity, association);
      _builder.append(_associationVariableName);
      {
        if (cardinality) {
          _builder.append(" = new ArrayList<>()");
        }
      }
      _builder.append(";");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }

  public CharSequence compileAssociationMethods(final Entity entity, final Association association) {
    CharSequence _xifexpression = null;
    boolean _associationCardinality = this.associationCardinality(entity, association);
    if (_associationCardinality) {
      _xifexpression = this.compileCardinalityAssociationMethods(entity, association);
    } else {
      _xifexpression = this.compileNonCardinalityAssociationMethods(entity, association);
    }
    return _xifexpression;
  }

  public CharSequence compileCardinalityAssociationMethods(final Entity entity, final Association association) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public List<");
    String _name = this.associationEntity(entity, association).getName();
    _builder.append(_name);
    _builder.append("> get");
    String _firstUpper = StringExtensions.toFirstUpper(this.associationVariableName(entity, association));
    _builder.append(_firstUpper);
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("return this.");
    String _associationVariableName = this.associationVariableName(entity, association);
    _builder.append(_associationVariableName, "    ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public void add");
    String _firstUpper_1 = StringExtensions.toFirstUpper(this.associationSingularVariableName(entity, association));
    _builder.append(_firstUpper_1);
    _builder.append("(");
    String _name_1 = this.associationEntity(entity, association).getName();
    _builder.append(_name_1);
    _builder.append(" element) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("this.");
    String _associationVariableName_1 = this.associationVariableName(entity, association);
    _builder.append(_associationVariableName_1, "    ");
    _builder.append(".add(element);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public CharSequence compileNonCardinalityAssociationMethods(final Entity entity, final Association association) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _name = this.associationEntity(entity, association).getName();
    _builder.append(_name);
    _builder.append(" get");
    String _firstUpper = StringExtensions.toFirstUpper(this.associationVariableName(entity, association));
    _builder.append(_firstUpper);
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("return this.");
    String _associationVariableName = this.associationVariableName(entity, association);
    _builder.append(_associationVariableName, "    ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public void set");
    String _firstUpper_1 = StringExtensions.toFirstUpper(this.associationSingularVariableName(entity, association));
    _builder.append(_firstUpper_1);
    _builder.append("(");
    String _name_1 = this.associationEntity(entity, association).getName();
    _builder.append(_name_1);
    _builder.append(" element) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("this.");
    String _associationVariableName_1 = this.associationVariableName(entity, association);
    _builder.append(_associationVariableName_1, "    ");
    _builder.append(" = element;");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public String associationVariableName(final Entity entity, final Association association) {
    String _xifexpression = null;
    boolean _associationCardinality = this.associationCardinality(entity, association);
    if (_associationCardinality) {
      String _associationSingularVariableName = this.associationSingularVariableName(entity, association);
      _xifexpression = (_associationSingularVariableName + "s");
    } else {
      _xifexpression = this.associationSingularVariableName(entity, association);
    }
    return _xifexpression;
  }

  public String associationSingularVariableName(final Entity entity, final Association association) {
    return StringExtensions.toFirstLower(this.associationEntity(entity, association).getName());
  }

  public boolean associationCardinality(final Entity entity, final Association association) {
    boolean _xifexpression = false;
    Entity _to = association.getTo();
    boolean _equals = Objects.equal(entity, _to);
    if (_equals) {
      _xifexpression = association.isManyFrom();
    } else {
      _xifexpression = association.isManyTo();
    }
    return _xifexpression;
  }

  public Entity associationEntity(final Entity entity, final Association association) {
    Entity _xifexpression = null;
    Entity _to = association.getTo();
    boolean _equals = Objects.equal(entity, _to);
    if (_equals) {
      _xifexpression = association.getFrom();
    } else {
      _xifexpression = association.getTo();
    }
    return _xifexpression;
  }

  public List<Attribute> attributes(final Entity entity) {
    return IterableExtensions.<Attribute>toList(Iterables.<Attribute>filter(entity.getElements(), Attribute.class));
  }
}
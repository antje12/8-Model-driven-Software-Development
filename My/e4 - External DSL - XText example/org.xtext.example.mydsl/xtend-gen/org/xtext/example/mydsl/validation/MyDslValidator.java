/**
 * generated by Xtext 2.29.0
 */
package org.xtext.example.mydsl.validation;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.HashSet;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.example.mydsl.myDsl.Entity;
import org.xtext.example.mydsl.myDsl.EntitySystem;
import org.xtext.example.mydsl.myDsl.FunctionCall;
import org.xtext.example.mydsl.myDsl.Inheritance;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class MyDslValidator extends AbstractMyDslValidator {
  public static final String INVALID_NAME = "invalidName";

  @Check
  public void noCycleInheritance(final Inheritance relation) {
    final EntitySystem system = EcoreUtil2.<EntitySystem>getContainerOfType(relation, EntitySystem.class);
    final Iterable<Inheritance> inheritances = Iterables.<Inheritance>filter(system.getElements(), Inheritance.class);
    final HashSet<Entity> seen = new HashSet<Entity>();
    seen.add(relation.getBaseEntity());
    Inheritance currentInheritance = relation;
    while ((currentInheritance != null)) {
      {
        final Entity superEntity = currentInheritance.getSuperEntity();
        boolean _contains = seen.contains(superEntity);
        if (_contains) {
          this.error("Cycle detected", MyDslPackage.Literals.INHERITANCE__SUPER_ENTITY);
          return;
        }
        seen.add(superEntity);
        final Function1<Inheritance, Boolean> _function = (Inheritance it) -> {
          Entity _baseEntity = it.getBaseEntity();
          return Boolean.valueOf(Objects.equal(_baseEntity, superEntity));
        };
        currentInheritance = IterableExtensions.<Inheritance>findFirst(inheritances, _function);
      }
    }
  }

  @Check
  public void externalCallArgumentType(final FunctionCall functionCall) {
    for (int i = 0; (i < functionCall.getVariables().size()); i++) {
      String _type = functionCall.getVariables().get(i).getType();
      String _get = functionCall.getFunction().getTypes().get(i);
      boolean _notEquals = (!Objects.equal(_type, _get));
      if (_notEquals) {
        this.error("Wrong number of arguments", MyDslPackage.Literals.FUNCTION_CALL__VARIABLES, i);
        return;
      }
    }
  }
}

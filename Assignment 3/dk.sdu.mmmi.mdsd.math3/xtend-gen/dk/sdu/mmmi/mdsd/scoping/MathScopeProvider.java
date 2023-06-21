/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.scoping;

import com.google.common.base.Objects;
import dk.sdu.mmmi.mdsd.math.Expression;
import dk.sdu.mmmi.mdsd.math.LetBinding;
import dk.sdu.mmmi.mdsd.math.MathExp;
import dk.sdu.mmmi.mdsd.math.VarBinding;
import dk.sdu.mmmi.mdsd.math.VariableUse;
import java.util.Arrays;
import java.util.Collections;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class MathScopeProvider extends AbstractMathScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    return this.scopeForEObject(context, reference);
  }

  protected IScope _scopeForEObject(final EObject context, final EReference reference) {
    return super.getScope(context, reference);
  }

  protected IScope _scopeForEObject(final VariableUse varUse, final EReference reference) {
    return this.scopeForVarUse(varUse);
  }

  public IScope scopeForVarUse(final EObject context) {
    IScope _xblockexpression = null;
    {
      final EObject container = context.eContainer();
      IScope _switchResult = null;
      boolean _matched = false;
      if (container instanceof LetBinding) {
        _matched=true;
        IScope _xifexpression = null;
        Expression _binding = ((LetBinding)container).getBinding();
        boolean _equals = Objects.equal(_binding, context);
        if (_equals) {
          _xifexpression = this.scopeForVarUse(container);
        } else {
          _xifexpression = Scopes.scopeFor(Collections.<EObject>unmodifiableList(CollectionLiterals.<EObject>newArrayList(container)), this.scopeForVarUse(container));
        }
        _switchResult = _xifexpression;
      }
      if (!_matched) {
        if (container instanceof MathExp) {
          _matched=true;
          final Function1<VarBinding, Boolean> _function = (VarBinding it) -> {
            return Boolean.valueOf((!Objects.equal(it, context)));
          };
          _switchResult = Scopes.scopeFor(IterableExtensions.<VarBinding>filter(((MathExp)container).getVariables(), _function));
        }
      }
      if (!_matched) {
        _switchResult = this.scopeForVarUse(container);
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }

  public IScope scopeForEObject(final EObject varUse, final EReference reference) {
    if (varUse instanceof VariableUse) {
      return _scopeForEObject((VariableUse)varUse, reference);
    } else if (varUse != null) {
      return _scopeForEObject(varUse, reference);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(varUse, reference).toString());
    }
  }
}

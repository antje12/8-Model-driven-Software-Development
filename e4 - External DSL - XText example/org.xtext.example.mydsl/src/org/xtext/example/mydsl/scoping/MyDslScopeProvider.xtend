/*
 * generated by Xtext 2.29.0
 */
package org.xtext.example.mydsl.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.xtext.example.mydsl.myDsl.Require
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.EcoreUtil2
import org.xtext.example.mydsl.myDsl.Entity
import org.xtext.example.mydsl.myDsl.Attribute
import org.xtext.example.mydsl.myDsl.Inheritance
import org.xtext.example.mydsl.myDsl.System
import org.eclipse.xtext.scoping.Scopes

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class MyDslScopeProvider extends AbstractMyDslScopeProvider {

    override getScope(EObject context, EReference reference) {
        switch(context) {
            Require: return context.getScope
        }
        super.getScope(context, reference)
    }
    
    def getScope(Require require){
        val entity = EcoreUtil2.getContainerOfType(require, Entity)
        Scopes.scopeFor(entity.elements.filter(Attribute), entity.recursiveScope)
    }
    
    def IScope recursiveScope(Entity entity){
        val superEntity = entity.superEntity
        if(superEntity === null)
            return IScope.NULLSCOPE
        return Scopes.scopeFor(superEntity.elements.filter(Attribute), superEntity.recursiveScope)
    }
        
    def Entity superEntity(Entity entity) {
        val system = EcoreUtil2.getContainerOfType(entity, System)
        val relations = system.elements.filter(Inheritance)
        val inheritanceRelation = relations.findFirst[baseEntity == entity]
        if(inheritanceRelation === null)
            return null
            
        return inheritanceRelation.superEntity
    }
}
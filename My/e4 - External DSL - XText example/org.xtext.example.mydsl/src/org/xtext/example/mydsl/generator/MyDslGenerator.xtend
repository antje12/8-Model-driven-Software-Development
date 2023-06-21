/*
 * generated by Xtext 2.29.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import org.xtext.example.mydsl.myDsl.EntitySystem
import org.xtext.example.mydsl.myDsl.Entity
import org.xtext.example.mydsl.myDsl.Attribute
import org.xtext.example.mydsl.myDsl.Association
import org.xtext.example.mydsl.myDsl.Inheritance

import java.util.List

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {

    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        var sys = resource.allContents.toIterable.filter(EntitySystem).get(0)
        fsa.generateFile(sys.name.toFirstLower+"/ExternalCode.java", sys.compileInterface)
        for (entity: resource.allContents.toIterable.filter(Entity)){
            var relation = resource.allContents.toIterable.filter(Inheritance).findFirst[baseEntity == entity]
            var associations = resource.allContents.toIterable.filter(Association).filter[from == entity || to == entity ]
            fsa.generateFile(sys.name.toFirstLower+"/"+entity.name + ".java", entity.compile(sys, relation, associations.toList))
        }
    }
    
    def compileInterface(EntitySystem sys)'''
    package «sys.name.toFirstLower»;
        
    public interface ExternalCode {
        «FOR external: sys.externals»
        «var i = 0»
        public boolean «external.name»(«FOR type : external.types SEPARATOR ','»«type.javaType» name«i++»«ENDFOR»);
        «ENDFOR»
    }
    '''
    
    def compile(Entity entity, EntitySystem system, Inheritance inheritance, List<Association> associations)'''
    package «system.name.toFirstLower»;
    
    import java.util.*;
    
    public class «entity.name» «IF inheritance !== null»extends «inheritance.superEntity.name» «ENDIF»{
        
        private ExternalCode externalCode;

        «FOR attribute: entity.attributes»
        private «attribute.javaType» «attribute.name»;
        «ENDFOR»
        «FOR association: associations»
        «entity.compileInstanceVariables(association)»
        «ENDFOR»
    
        public «entity.name»(ExternalCode externalCode, «entity.compileConstructorAttributes(inheritance)») {
            «IF inheritance !== null»
            super(externalCode, «FOR attribute: inheritance.superEntity.attributes SEPARATOR ", "»«attribute.name»«ENDFOR»);
            «ENDIF»
            this.externalCode = externalCode;
            «FOR attribute: entity.attributes»
            this.set«attribute.name.toFirstUpper»(«attribute.name»);
            «ENDFOR»
        }
        «FOR attribute: entity.attributes»
        public «attribute.javaType» get«attribute.name.toFirstUpper»() {
            return «attribute.name»;
        }
        public void set«attribute.name.toFirstUpper»(«attribute.javaType» «attribute.name») {
            this.«attribute.name» = «attribute.name»;
        }
        «ENDFOR»
        
        «FOR association : associations»
        «entity.compileAssociationMethods(association)»
        «ENDFOR»
    }
    '''
    
    def javaType(Attribute attribute){
        attribute.type.javaType
    }
    
    def javaType(String type){
        switch type {
            case "string": "String"
            case "number": "int"
        }
    }
    
    def compileConstructorAttributes(Entity base, Inheritance inheritance) {
        var String[] attributes = base.attributes.map[javaType +" "+ name]
        if(inheritance !== null){
            attributes = attributes + inheritance.superEntity.attributes.map[javaType +" "+ name]
        }
        attributes.join(", ")
    }
    
    def compileInstanceVariables(Entity entity, Association association){
        val otherEntity = entity.associationEntity(association)
        val cardinality = entity.associationCardinality(association)
        
        '''private «IF cardinality»List<«ENDIF»«otherEntity.name»«IF cardinality»>«ENDIF» «entity.associationVariableName(association)»«IF cardinality» = new ArrayList<>()«ENDIF»;'''
    }
    
    def compileAssociationMethods(Entity entity, Association association){
        if (entity.associationCardinality(association))
            entity.compileCardinalityAssociationMethods(association)
        else
            entity.compileNonCardinalityAssociationMethods(association)
    }
    
    def compileCardinalityAssociationMethods(Entity entity, Association association)'''
    public List<«entity.associationEntity(association).name»> get«entity.associationVariableName(association).toFirstUpper»() {
        return this.«entity.associationVariableName(association)»;
    }
    
    public void add«entity.associationSingularVariableName(association).toFirstUpper»(«entity.associationEntity(association).name» element) {
        this.«entity.associationVariableName(association)».add(element);
    }
    '''
    
    def compileNonCardinalityAssociationMethods(Entity entity, Association association)'''
    public «entity.associationEntity(association).name» get«entity.associationVariableName(association).toFirstUpper»() {
        return this.«entity.associationVariableName(association)»;
    }
    
    public void set«entity.associationSingularVariableName(association).toFirstUpper»(«entity.associationEntity(association).name» element) {
        this.«entity.associationVariableName(association)» = element;
    }
    '''
    
    def associationVariableName(Entity entity, Association association){
        entity.associationCardinality(association) ? entity.associationSingularVariableName(association) + "s" : entity.associationSingularVariableName(association)
    }
    
    def associationSingularVariableName(Entity entity, Association association){
        entity.associationEntity(association).name.toFirstLower
    }
    
    def associationCardinality(Entity entity, Association association){
        if(entity == association.to){
            association.manyFrom
        }
        else{
            association.manyTo
        }
    }
    
    def associationEntity (Entity entity, Association association){
        if(entity == association.to){
            association.from
        }
        else{
            association.to
        }
    }
    
    def List<Attribute> attributes(Entity entity){
        entity.elements.filter(Attribute).toList
    }
}
/*
 * generated by Xtext 2.29.0
 */
package org.xtext.example.mydsl.validation

import org.eclipse.xtext.validation.Check
import org.xtext.example.mydsl.myDsl.Inheritance
import org.xtext.example.mydsl.myDsl.MyDslPackage.Literals
import org.xtext.example.mydsl.myDsl.Entity
import org.xtext.example.mydsl.myDsl.EntitySystem
import org.xtext.example.mydsl.myDsl.FunctionCall
import java.util.HashSet
import org.eclipse.xtext.EcoreUtil2

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class MyDslValidator extends AbstractMyDslValidator {
    
    public static val INVALID_NAME = 'invalidName'
    
    @Check
    def noCycleInheritance(Inheritance relation){
        val system = EcoreUtil2.getContainerOfType(relation, EntitySystem)
        val inheritances = system.elements.filter(Inheritance)
        val seen = new HashSet<Entity>
        seen.add(relation.baseEntity)
        
        var currentInheritance = relation 
        
        while(currentInheritance !== null) {
            val superEntity = currentInheritance.superEntity
            if(seen.contains(superEntity)){
                error("Cycle detected", Literals.INHERITANCE__SUPER_ENTITY)
                return
            }
            seen.add(superEntity)
            currentInheritance = inheritances.findFirst[baseEntity == superEntity]
        }
     }
     
     @Check
   	 def externalCallArgumentType(FunctionCall functionCall){
   	 	for(var i=0; i < functionCall.variables.size; i++){
   	 		if (functionCall.variables.get(i).type != functionCall.function.types.get(i)){
   	 			error("Wrong number of arguments", Literals.FUNCTION_CALL__VARIABLES, 
   	 				i // error shown at argument at index i
   	 				  // so if the error was because of the second argument, this is shown
   	 			)
                return
   	 		}
   	 	}
   	 }
}

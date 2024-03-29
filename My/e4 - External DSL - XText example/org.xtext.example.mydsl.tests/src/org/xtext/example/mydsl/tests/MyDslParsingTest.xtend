/*
 * generated by Xtext 2.29.0
 */
package org.xtext.example.mydsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.example.mydsl.myDsl.EntitySystem
import org.xtext.example.mydsl.myDsl.Attribute
import org.xtext.example.mydsl.myDsl.Entity

@ExtendWith(InjectionExtension)
@InjectWith(MyDslInjectorProvider)

class MyDslParsingTest {
    
    @Inject extension ParseHelper<EntitySystem>
    
    @Test
    def void loadModel() {
        val result = '''
            system University
            entity Person
        '''.parse
        Assertions.assertNotNull(result)
        val errors = result.eResource.errors
        Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
    }
    
    @Test
    def void simpleEntity() {
        val result = '''
            system University
            entity Person
        '''.parse
        Assertions.assertEquals("University", result.name)
        Assertions.assertEquals(1, result.elements.size)
        
        val entity = result.elements.get(0) as Entity
        Assertions.assertEquals("Person", entity.name)
    }
    
    @Test
    def void multipleEntities() {
        val result = '''
            system University
            entity Person
            entity Teacher
        '''.parse
        Assertions.assertEquals("University", result.name)
        Assertions.assertEquals(2, result.elements.size)
        
    }
    
    @Test
    def void attributes() {
        val result = '''
            system University
            entity Person
                attribute name as string
        '''.parse
        
        val entity = result.elements.get(0) as Entity
        Assertions.assertEquals(1, entity.elements.size)
        
        val attribute = entity.elements.get(0) as Attribute
        Assertions.assertEquals("name", attribute.name)
        Assertions.assertEquals("string", attribute.type)
    }
}

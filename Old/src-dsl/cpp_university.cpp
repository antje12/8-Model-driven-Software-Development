/*
Copyright (c) 2012, Ulrik Pagh Schultz, University of Southern Denmark
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met: 

1. Redistributions of source code must retain the above copyright notice, this
   list of conditions and the following disclaimer. 
2. Redistributions in binary form must reproduce the above copyright notice,
   this list of conditions and the following disclaimer in the documentation
   and/or other materials provided with the distribution. 

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

The views and conclusions contained in the software and documentation are those
of the authors and should not be interpreted as representing official policies, 
either expressed or implied, of the University of Southern Denmark.
*/
#include "cpp_entity_macros.cpp"

package examples.entityrelation;

import entityrelation.Entity;
import entityrelation.EntityRelation;

/**
 * Entity-Relation example: small hierarchy of Student,Teacher extending Person and being related through Course
 * @author ups
 */
public class University extends EntityRelation {

    /*
     * Build concrete instance of semantic model
     * @see entityrelation.EntityRelation#build()
     */
    ENTITIES {
        ENTITY(Person)
          FIELD(String,name)
          FIELD(Integer,age)
        ENTITY(Course)
          FIELD(String,title)
        ENTITY(Student) EXTENDS(Person)
          FIELD(Integer,id)
          RELATION(n_n,follows,Course,enrolled)
        ENTITY(Teacher) EXTENDS(Person)
          RELATION(n_1,teaches,Course,taught_by)
        ;
    }

    /**
     * Use semantic model to create small system, query for data
     */
    void main() {
        Entity ulrik = new Entity(this, "Teacher","Ulrik",41,EMPTY);
        Entity swc = new Entity(this, "Course","SWC",EMPTY,ulrik);
        Entity opn = new Entity(this, "Course","OPN",EMPTY,ulrik);
        new Entity(this, "Student","John",23,9123456,EMPTY).associate("follows",swc);
        new Entity(this, "Student","Doe",23,234234,EMPTY).associate("follows",swc);
        new Entity(this, "Student","Jane",23,8347543,EMPTY).associate("follows",opn);
        System.out.println("Ulriks students: "+ulrik.getMulti("teaches").getMulti("enrolled"));
    }

    /**
     * Run demo
     * @param argv
     */
    public static void main(String argv[]) {
        new University().main();
    }

}

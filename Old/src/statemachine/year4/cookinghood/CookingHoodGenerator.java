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

package statemachine.year4.cookinghood;

import statemachine.year3.cookinghood.CookingHoodMachine;
import statemachine.year3.dsl.FluentMachine;
import statemachine.year4.codegen.MachineGenerator;

/**
 * Compiler driver that generates code for the cooking hood in the "gen" source code
 * folder.  Assumes that the target folder already exists.
 * @author ups
 *
 */
public class CookingHoodGenerator {

	/**
	 * Package name to use for the generated code
	 */
	public static final String packageName = "statemachine.year4.generated";
	/**
	 * Class name to use for the generated code
	 */
	public static final String className = "CookingHood4Impl";

	/**
	 * Run the compiler
	 */
	public static void main(String argv[]) {
    	FluentMachine model = new CookingHoodMachine();
    	MachineGenerator comp = new MachineGenerator(model);
    	comp.compile("gen", packageName, className);
    }
    
   
}

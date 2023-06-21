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

package examples.gui_sequence;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JLabel;

/**
 * Small, simple GUI example: the counter
 * @author ups
 */
public class Counter implements ActionListener {
    
    /**
     * The specific GUI to use for this application
     * @author ups
     */
    public static class CountingGUI extends QuickSequenceGUI.GUIBuilder {
        
        @Override 
        public void build() {
            frame("Counter").
           		  label("display","0").
                newline().
           		  button("Less").button("More").
           		newline().
               	  button("Reset").button("Quit").
               	newline();
            ;
        }
    }

    /**
     * Create GUI and then wait for events
     */
    public static void main(String argv[]) throws IOException {
        Counter calc = new Counter();
        calc.gui = new QuickSequenceGUI(new CountingGUI(),calc);
    }

    /**
     * The GUI 
     */
    private QuickSequenceGUI gui;
    private int value = 0;
    
    /**
     * Respond to GUI events
     */
    @Override
    public void actionPerformed(ActionEvent event) {
    	String button = event.getActionCommand();
    	if("Less".equals(button)) setDisplay(Integer.toString(--value));
    	else if("More".equals(button)) setDisplay(Integer.toString(++value));
    	else if("Reset".equals(button)) setDisplay(Integer.toString(value=0));
    	else if("Quit".equals(button)) System.exit(0);
        else System.err.println("Warning: unknown event "+event);
    }

	/**
     * Update calculator display
     */
    private void setDisplay(String content) {
    	JLabel display = (JLabel)gui.getComponent("display");
    	display.setText(content);
    }

}

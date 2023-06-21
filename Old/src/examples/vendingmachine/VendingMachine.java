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

package examples.vendingmachine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.regex.Pattern;

import javax.swing.JLabel;

import examples.gui_nested.QuickNestedGUI;
import qui_generic_model.QPanel.Layout;

/**
 * Small, canonical GUI example: the calculator
 * @author ups
 */
public class VendingMachine implements ActionListener {
    
    /**
     * The specific GUI to use for this application
     * @author ups
     */
    public static class VendingMachineGUI extends QuickNestedGUI.GUIBuilder {
        
        @Override 
        public void build() {
            frame("Vending Machine",Layout.VERTICAL,
            	panel(Layout.HORIZONTAL,
            		label(name("display"),text("..."))),
            	panel(Layout.HORIZONTAL,
            		button(name("coin"),text("Insert 20 kr coin")),
            		button(name("coke"),text("Coke")),
            		button(name("sprite"),text("Sprite"))),
                panel(Layout.HORIZONTAL,
                	button(name("return"),text("Return")),
                    button(name("refill"),text("Refill"))))
            ;
        }
    }

    /**
     * Create GUI and then wait for events
     */
    public static void main(String argv[]) throws IOException {
        VendingMachine vm = new VendingMachine();
        vm.gui = new QuickNestedGUI(new VendingMachineGUI(),vm);
    }

    /**
     * The GUI 
     */
    private QuickNestedGUI gui;

    /**
     * Respond to GUI events
     */
    @Override
    public void actionPerformed(ActionEvent event) {
    	String button = event.getActionCommand();
    	if("coin".equals(button)) coinAction();
    	else if("coke".equals(button)) cokeAction();
    	else if("sprite".equals(button)) spriteAction();
    	else if("return".equals(button)) returnAction();
    	else if("refill".equals(button)) refillAction();
        else System.err.println("Warning: unknown event "+event);
    	updateDisplay();
    }

	/**
     * Update calculator display
     */
    private void setDisplay(String content) {
    	JLabel display = (JLabel)gui.getComponent("display");
    	display.setText(content);
    }
    
    /**
     * Vending machine logic
     */

    /**
     * levels of supplies
     */
    private static final int Max = 10;
    private int coke = 10;
    private int sprite = 10;
    private boolean coin_inserted;
    private String message = "";
    
	private void coinAction() {
		if(coin_inserted==true)
			message = "Coin already inserted";
		else
			coin_inserted = true;
	}

	private void cokeAction() {
		if(coin_inserted==true) {
			if(coke>0) {
				message = "Here is your Coke";
				coke--;
				coin_inserted = false;
			} else
				message = "No Coke left";
		} else {
			message = "Insert 20 dkk coin";
		}
			
	}

	private void spriteAction() {
		if(coin_inserted==true) {
			if(sprite>0) {
				message = "Here is your Sprite";
				sprite--;
				coin_inserted = false;
			} else
				message = "No Sprite left";
		} else {
			message = "Insert 20 dkk coin";
		}
			
	}

	/**
	 * Increment accumulator according to current
	 */
	private void returnAction() {
		if(coin_inserted==true) {
			message = "Here is your 20 dkk coin";
			coin_inserted = false;
		} else {
			message = "No payment inserted";
		}
	}
	
	/**
	 * Clear the display and the accumulator
	 */
    private void refillAction() {
    	coke = Max;
    	sprite = Max;
	}

    /**
     * Update the value in the display to show the value of current
     */
    private void updateDisplay() {
    	setDisplay(message+" / coin="+coin_inserted+",coke="+coke+",sprite="+sprite);
    }
}

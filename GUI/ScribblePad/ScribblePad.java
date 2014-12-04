package scribblepad;

/**
 *
 * @author dennis
 */

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class ScribblePad extends Applet implements ActionListener {

    String textGuider, textGuiderBackUp, buttonGuider;
    Button clear, recall, remember;
    TextField inputArea, buttonPressDisplay;
    
    public void init() {
        
        /* Adding Labels */
        Label textInput = new Label("\nEnter text : ");
        Label buttonPress  = new Label("Button Pressed : ");
        
        /* Initializing the text Fields */
        inputArea           = new TextField(30);
        buttonPressDisplay  = new TextField(30);
        
        /* Initializing the Buttons */
        clear   = new Button("clear");
        recall  = new Button("recall");
        remember= new Button("remember");
        
        /* Add actionListeners for buttons */
        clear.addActionListener(this);
        recall.addActionListener(this);
        remember.addActionListener(this);
        
        /* Add the elements to the window */
        add(textInput);     add(inputArea);
        add(buttonPress);   add(buttonPressDisplay);
        add(clear);
        add(recall);
        add(remember);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear) {
            textGuider = "";
            inputArea.setText(textGuider);
            buttonGuider = "clear";
            buttonPressDisplay.setText(buttonGuider);
        }
        
        if (ae.getSource() == recall) {
            inputArea.setText(textGuiderBackUp);
            buttonGuider = "recall";
            buttonPressDisplay.setText(buttonGuider);
        }
        
        if (ae.getSource() == remember) {
            textGuiderBackUp = inputArea.getText();
            buttonGuider = "remember";
            buttonPressDisplay.setText(buttonGuider);
        }
    }
}

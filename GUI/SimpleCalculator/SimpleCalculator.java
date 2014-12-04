package simplecalculator;

/**
 *
 * @author dennis
 */

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class SimpleCalculator extends Applet implements ActionListener {

    String input = "";
    Button add, sub, mul, div, clear;
    TextField firstNum, secondNum, result;

    public void init() {
        /* Initialize Labels and Text Fields */
        Label first     = new Label("First Number");
        firstNum        = new TextField(15);
        Label second    = new Label("Second Number");
        secondNum       = new TextField(15);

        /* Initialize Buttons */
        add     = new Button("Add");
        sub     = new Button("Subtract");
        mul     = new Button("Multiply");
        div     = new Button("Divide");
        clear   = new Button("Clear");

        /* Add ActionListeners for buttons */
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        clear.addActionListener(this);

        Label res   = new Label("Result");
        result      = new TextField(15);

        /* Add the elements */
        add(first); add(firstNum); add(second); add(secondNum);
        add(res); add(result);
        add(add); add(sub); add(mul); add(div); add(clear);
    }

    public void actionPerformed(ActionEvent ae) {
        String first = firstNum.getText();
        String second = secondNum.getText();

        if (ae.getSource() == add) {
            int r = Integer.parseInt(first) + Integer.parseInt(second);
            result.setText(String.valueOf(r));
        }
        if (ae.getSource() == sub) {
            int r = Integer.parseInt(first) - Integer.parseInt(second);
            result.setText(String.valueOf(r));
        }
        if (ae.getSource() == mul) {
            int r = Integer.parseInt(first) * Integer.parseInt(second);
            result.setText(String.valueOf(r));
        }
        if (ae.getSource() == div) {
            int r = Integer.parseInt(first)/Integer.parseInt(second);
            result.setText(String.valueOf(r));
        }
        if (ae.getSource() == clear) {
            result.setText(" ");
        }
    }

    /* Applets don't have main() functions */
    /**public static void main(String[] args) {

    }*/

}

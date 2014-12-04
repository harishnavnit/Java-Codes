import java.util.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ButtonDemo extends Applet implements ActionListener {

    /* Field Declarations */
    Button one, two;
    String s = "";

    public void init() {

        one = new Button("One");
        add(one);

        two = new Button("two");
        add(two);

        one.addActionListener(this);
        two.addActionListener(this);
    }

    public void paint(Graphics g) {

        g.drawString("Button Pressed : " + s, 50, 125);
    }

    public void actionPerformed(ActionEvent e) {

        if((e.getSource() == one || (e.getSource() == two))) {
            s = e.getActionCommand();
        }
        repaint();
    }
}

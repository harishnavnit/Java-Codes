package LoginScreen;

import entities.*;

import java.applet.Applet;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

/**
 *
 * @author dennis
 */
public class LoginSuccessful extends Frame {

    TextField c_displayName;
    Customer    c  = new Customer();
    
    public void init() {
        Label loginSuccess = new Label("Welcome");
        c_displayName = new TextField(15);
        c_displayName.setText(c.getName());
        add(loginSuccess);
        add(c_displayName);
    }
}

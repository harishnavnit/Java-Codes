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

    Customer  c  = new Customer();
    
    public void init() {
        Label loginSuccess = new Label("Welcome " + c.getName());
        add(loginSuccess);
    }
}

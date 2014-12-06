package LoginScreen;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;

/**
 *
 * @author dennis
 */
public class LoginFailure extends Frame {

    Button back;  
    public void init() {
        //back = new Button("Back");
        Label loginFailure = new Label("Failed to Login");
        add(loginFailure);
        //add(back);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            
        }
    }
}

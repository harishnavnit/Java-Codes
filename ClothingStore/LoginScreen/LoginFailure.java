package LoginScreen;

import java.applet.Applet;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;

/**
 *
 * @author dennis
 */
public class LoginFailure extends Frame {

    public void init() {
        Label loginFailure = new Label("Failed to Login");
        add(loginFailure);
    }
}

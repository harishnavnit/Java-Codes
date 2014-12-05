package LoginScreen;

import entities.*;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dennis
 */
public class LoginScreen extends Applet implements ActionListener {

    /* Field variable declarations */
    String      c_name, c_id;
    TextField   userName, password;
    Button      enter, clear, exit;
    boolean     dbConnected, customerLoggedIn;

    Connection c = null;
    Statement  s = null;

    // Creating instances
    LoginSuccessful success = new LoginSuccessful();
    LoginFailure    failure = new LoginFailure();
    Customer customer  = new Customer();

    public void init() {
        // Establish connection with the DataBase server first
        dbConnected = establishConnection();

        /* Adding Labels */
        Label name = new Label("Username");
        Label pass = new Label("Password");

        /* Initialize the Text Fields */
        userName = new TextField(30);
        password = new TextField(30);

        /* Initialize the Buttons */
        enter = new Button("Enter");
        clear = new Button("Clear");
        exit  = new Button("Exit");

        /* Add ActionListeners for the buttons */
        enter.addActionListener(this);
        clear.addActionListener(this);
        exit.addActionListener(this);

        /* Add the elements to the browser */
        add(name);      add(userName);
        add(pass);      add(password);
        add(enter);     add(clear);         add(exit);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        c_name  = userName.getText();
        c_id    = password.getText();

        if (ae.getSource() == clear) {
            handleClearPress();
        }

        if (ae.getSource() == exit) {
            handleExitPress();
        }

        if (ae.getSource() == enter) {
            handleEnterPress();
        }
    }

    /* Connect to the DataBase server */
    public boolean establishConnection() {
        /* Attempt connecting to the Data Base */
            try {
                // Register the driver
                Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dennis", "dennis", "********");
            }
            catch (Exception e) {
                e.printStackTrace();
                System.err.print("Unable to connect to server"
                        + "\nPlease contact the administrator");
                return false;
            }
            return true;
    }

    /* Method to load the next frame settings */
    public void loadFrameSettings(final Frame f, boolean mode) {
        f.setSize(200, 200);
        f.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        f.setVisible(false);
                    }
                });
        f.setVisible(mode);
    }

    /* Methods to respond to the
     * respective button press by the user.
     */
    public void handleClearPress() {
        userName.setText("");
        password.setText("");
        c_name = userName.getText();
        customer.setName(c_name);
        c_id   = password.getText();
        customer.setId(c_id);
    }

    public void handleEnterPress() {
        try {
            customerLoggedIn = customerLogin();
        } catch (SQLException ex) {
            Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Go to the next Frame(screen) */
        if (!customerLoggedIn) {
            // Login Not successful
            loadFrameSettings(success, false);
            loadFrameSettings(failure, true);
        }
        else {
            // Login Successful
            loadFrameSettings(success, true);
            loadFrameSettings(failure, false);
        }
    }

    public void handleExitPress() {
        System.exit(0);
    }

    /* Check for the customer's credentials in the DataBase */
    public boolean customerLogin() throws SQLException {

        boolean entryFoundFlag = false;

        if (establishConnection()) {
            try {
                s = c.createStatement();
                ResultSet rs = s.executeQuery("SELECT * from Customer");

                while(rs.next()) {
                    String customerId = rs.getString("c_id");
                    String customerName = rs.getString("c_name");

                    if ((c_name == customerName) && (c_id == customerId)) {
                        entryFoundFlag = true;
                        break;
                    }
                }
            }
            catch (SQLException se) {
                se.printStackTrace();
            }
        }

        return (entryFoundFlag) ? true : false;
    }
}

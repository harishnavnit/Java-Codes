import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Calendar;

public class DigitalClock extends java.applet.Applet {

    /* Field Declarations */
    protected Timer timer;
    protected Font font   = new Font("Monospaced", Font.BOLD, 48);
    protected Color color = Color.GREEN;

    /* Object Initializations - Constructors */
    public DigitalClock() {
        timer = new Timer(1000, createTimerTickHandler() );
    }


    protected ActionListener createTimerTickHandler() {

        return new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                repaint();
            }
        };
    }

    /* Methods for DigitalClock */
    public void start() {
        timer.start();
    }

    public void stop() {
        timer.stop();
    }

    public void paint(Graphics g) {
        Calendar calendar = Calendar.getInstance();

        int hour    = calendar.get(Calendar.HOUR_OF_DAY);
        int minute  = calendar.get(Calendar.MINUTE);
        int second  = calendar.get(Calendar.SECOND);

        g.setFont(font);
        g.setColor(color);
        g.drawString(hour/10 + hour%10 + ":" + minute/10 + minute%10 + ":" + second/10 + second%10, 10, 60);
    }
}

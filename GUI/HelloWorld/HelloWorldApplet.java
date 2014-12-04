import java.awt.*;
import java.applet.*;

/* Public class extending applet */
public class HelloWorldApplet extends Applet {

    public void paint(Graphics g) {
        Dimension d = getSize();
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, d.width, d.height);        // Paint background
        g.setFont(new Font("San-serif", Font.BOLD, 24));
        g.setColor(new Color(255, 215, 0));
        g.drawString("Hello World !", 60, 40);
    }
}

import java.applet.Applet;
import java.awt.Graphics;

public class SumApplet extends Applet {
    float a = 12.5f;
    float b = 13.5f;

    public void paint(Graphics g) {
        float sum = a + b;
        g.drawString("The sum is " + sum, 50, 50);
    }
}

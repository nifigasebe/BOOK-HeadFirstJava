/**
 * Created by adminlocal on 23.09.2014.
 */
import java.awt.*;
import javax.swing.*;

public class Drawing extends JPanel {

    public void paintComponent (Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g.setColor(Color.black);
        g.fillRect(0,0,this.getWidth(),this.getHeight());

        int red = (int)(Math.random() * 255);
        int green = (int)(Math.random() * 255);
        int blue = (int)(Math.random() * 255);
        Color startColor = new Color(red,green,blue);

        red = (int)(Math.random() * 255);
        green = (int)(Math.random() * 255);
        blue = (int)(Math.random() * 255);
        Color endColor = new Color(red,green,blue);

        GradientPaint gradient = new GradientPaint(70,70,startColor,500,500,endColor);

        g2d.setPaint(gradient);
        g2d.fillOval(70,70,300,300);
        g2d.fillOval(390,390,500,500);
    }
}

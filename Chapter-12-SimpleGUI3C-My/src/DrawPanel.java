import javax.swing.*;
import java.awt.*;
/**
 * Created by adminlocal on 29.09.2014.
 */
public class DrawPanel extends JPanel {

    public void paintComponent(Graphics g){

        Colors colors = new Colors();

        Graphics2D g2d = (Graphics2D) g;

        int ovalParams1[] = {50, 100,200,200};
        int ovalParams2[] = {550,100,200,200};
        int rectParams1[] = {300,100,200,200};


        g.setColor(colors.get3RandomColor());
        g.fillOval(ovalParams1[0],ovalParams1[1],ovalParams1[2],ovalParams1[3]);

        g2d.setPaint(colors.getGradient());
        g2d.fillRect(rectParams1[0],rectParams1[1],rectParams1[2],rectParams1[3]);

        g.setColor(colors.get3RandomColor());
        g.fillOval(ovalParams2[0],ovalParams2[1],ovalParams2[2],ovalParams2[3]);
    }
}
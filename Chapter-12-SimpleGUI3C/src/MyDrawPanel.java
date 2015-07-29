import javax.swing.*;
import java.awt.*;
/**
 * Created by alexeychizhov on 28.09.2014.
 */

public class MyDrawPanel extends JPanel {

    public void paintComponent(Graphics g) {

        g.fillRect(0,0,this.getWidth(), this.getHeight());

        int color1 = (int) (Math.random() * 255);
        int color2 = (int) (Math.random() * 255);
        int color3 = (int) (Math.random() * 255);

        Color randomColor = new Color(color1,color2,color3);
        g.setColor(randomColor);
        g.fillOval(70,70,100,100);
    }
}
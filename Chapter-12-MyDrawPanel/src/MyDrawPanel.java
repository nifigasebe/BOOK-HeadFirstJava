/**
 * Created by adminlocal on 23.09.2014.
 */
import java.awt.*;
import javax.swing.*;

public class MyDrawPanel extends JPanel {

    public void paintComponent(Graphics g) {

        Image image = new ImageIcon("angryIvan.jpg").getImage();
        g.drawImage(image,0,0,this);

        g.setColor(Color.orange);
        g.fillRect(30,30,100,100);

        g.setColor(Color.green);
        g.fillOval(200,200,123,123);
    }
}

import javax.swing.*;
import java.awt.*;

/**
 * Created by alexeychizhov on 21.10.2014.
 */
public class Gui1 {

    public void go() {

        JFrame frame = new JFrame("Gui1");
        JButton button1 = new JButton("button1");

        frame.setSize(800,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(BorderLayout.EAST,button1);
    }
}

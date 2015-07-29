import javax.swing.*;
import java.awt.*;

/**
 * Created by alexeychizhov on 21.10.2014.
 */
public class Gui2 {

    public void go(){

        JFrame frame = new JFrame("Gui2");
        JPanel panel1 = new JPanel();
        JButton button1 = new JButton("PressMe1");
        JButton button2 = new JButton("PressMe2");
        JButton button3 = new JButton("PressMe333");

        frame.setSize(800,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel1.setBackground(Color.darkGray);
        panel1.setLayout(new BoxLayout(panel1,BoxLayout.Y_AXIS));
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);

        frame.getContentPane().add(BorderLayout.EAST,panel1);
    }

}

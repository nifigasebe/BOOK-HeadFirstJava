import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by adminlocal on 23.09.2014.
 */
public class StartDrow {

    public static void main (String[] args) {

        MyDrawPanel drawPanel = new MyDrawPanel();
        JFrame frame = new JFrame();
        frame.getContentPane().add(drawPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);

    }
}

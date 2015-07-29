import javax.swing.*;

/**
 * Created by adminlocal on 23.09.2014.
 */
public class Window {

    public static void main (String[] args ) {

        JFrame frame = new JFrame();
        Drawing drawing = new Drawing();

        frame.getContentPane().add(drawing);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024,780);
        frame.setVisible(true);
    }
}

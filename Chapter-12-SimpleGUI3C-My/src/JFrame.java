/**
 * Created by adminlocal on 29.09.2014.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrame {

    javax.swing.JFrame superFrame;
    JLabel label;
    JButton superButton2;

    public static void main (String[] args) {

        JFrame gui = new JFrame();
        gui.go();
    }

    public void go() {

        DrawPanel dp = new DrawPanel();                                                                                 //DrawPanel
        Colors colors = new Colors();

        JButton superButton1 = new JButton("Change color 1");                                                           //Buttons
        superButton1.setBackground(colors.get3RandomColor());
        superButton1.addActionListener(new SuperButton1Listener());

        superButton2 = new JButton("Change color 2");
        superButton2.setBackground(colors.get3RandomColor());
        superButton2.addActionListener(new SuperButton2Listener());

        JButton superButton3 = new JButton("Change color 3");
        superButton3.setBackground(colors.get3RandomColor());
        superButton3.addActionListener(new SuperButton3Listener());

        label = new JLabel("Yo!Bro:)");                                                                                 //Label

        superFrame = new javax.swing.JFrame();                                                                          //Frame

        superFrame.setSize(1024, 680);
        superFrame.setTitle("superFrame");
        superFrame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        superFrame.setVisible(true);

        superFrame.getContentPane().add(BorderLayout.EAST, superButton1);                                               //AddToFrame
        superFrame.getContentPane().add(BorderLayout.WEST, superButton2);
        superFrame.getContentPane().add(BorderLayout.SOUTH, superButton3);
        superFrame.getContentPane().add(BorderLayout.NORTH, label);
        superFrame.getContentPane().add(dp);
    }

    class SuperButton1Listener implements ActionListener {

        public void actionPerformed (ActionEvent event) {

            for (int i=0;i<50;i++) {

                superFrame.repaint();
                System.out.println(i);

            }
        }
    }

    class SuperButton2Listener implements ActionListener {

        public void actionPerformed (ActionEvent event) {


            label.setText("FUCK YEEEAAAAA");
        }
    }

    class SuperButton3Listener implements ActionListener {

        public void actionPerformed (ActionEvent event) {
            Colors colors = new Colors();
            superButton2.setBackground(colors.get3RandomColor());
        }
    }
}

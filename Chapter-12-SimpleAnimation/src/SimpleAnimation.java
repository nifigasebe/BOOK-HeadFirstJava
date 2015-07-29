/**
 * Created by adminlocal on 03.10.2014.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class SimpleAnimation {

    JFrame superframe;
    DrawPanel dp;
    JButton startOvalButton;
    JButton startRectButton;

    int x;
    int y;
    int x2;
    int y2;
    boolean flag1;

    public static void main (String[] args){
        SimpleAnimation simpleAnimation = new SimpleAnimation();
        simpleAnimation.go();
        simpleAnimation.startOval();
    }

    public void go() {

        superframe = new JFrame();
        dp = new DrawPanel();

        startOvalButton = new JButton("Krug");
        startOvalButton.setBackground(Color.RED);
        startOvalButton.addActionListener(new StartOvalButtonListener());

        startRectButton = new JButton("Rvadrat");
        startRectButton.setBackground(Color.RED);
        startOvalButton.addActionListener(new StartRectButtonListener());

        superframe.setSize(800,800);
        superframe.setVisible(true);
        superframe.setTitle("Hallucinogen");
        superframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //superframe.getContentPane().add(BorderLayout.SOUTH,startOvalButton);
        //superframe.getContentPane().add(BorderLayout.NORTH,startRectButton);
        superframe.getContentPane().add(BorderLayout.CENTER,dp);

    }




    public class DrawPanel extends JPanel {

        public void paintComponent (Graphics g){
            Graphics2D g2d = (Graphics2D) g;

            int rnd1 = (int)(Math.random() * 255);
            int rnd2 = (int)(Math.random() * 255);
            int rnd3 = (int)(Math.random() * 255);
            Color color1 = new Color(rnd1,rnd2,rnd3);

            int rnd4 = (int)(Math.random() * 255);
            int rnd5 = (int)(Math.random() * 255);
            int rnd6 = (int)(Math.random() * 255);
            Color color2 = new Color(rnd4,rnd5,rnd6);

            GradientPaint gradient = new GradientPaint(x,y,color1,x2,y2,color2);

            g2d.setPaint(gradient);

            if (!(flag1)){
                g2d.fillOval(x, y, 200, 200);
            }
            if (flag1){
                g2d.fillRect(x, y, 200, 200);
            }
        }
    }

    class StartOvalButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            x = 0;
            y = 0;
            x2 = 0;
            y2 = 0;
            flag1 = false;
            startOval();
        }
    }

    class StartRectButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            System.out.print("333");
            x = 800;
            y = 800;
            x2 = 0;
            y2 = 0;
            flag1 = true;
            startRect();
        }
    }

    public void startOval() {
        for (int i=0; i<800; i++) {
            x += 1;
            y += 1;
            x2 +=2;
            y2 +=2;
            //superframe.repaint();
            dp.repaint();
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                // Handle here
            }
        }
    }

    public void startRect(){
        System.out.print("111");
        for (int i=0; i<800; i++) {
            System.out.print("222");
            x -= 1;
            y -= 1;
            x2 +=2;
            y2 +=2;
            //superframe.repaint();
            dp.repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                // Handle here
            }
        }
    }
}

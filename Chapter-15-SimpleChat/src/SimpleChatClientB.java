/**
 * Created by Alexey on 17.11.2014.
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.net.*;
import java.awt.*;
import  java.awt.event.*;
import java.util.*;
public class SimpleChatClientB {

    JTextArea incoming;
    JTextField outgoing;
    BufferedReader reader;
    PrintWriter writer;
    Socket sock;

    public static void main(String[] args) {
        SimpleChatClientB clientB = new SimpleChatClientB();
        clientB.go();
    }

    public void go(){
        JFrame frame = new JFrame("Simple Client Chat");
        JPanel mainPael = new JPanel();
        incoming = new JTextArea(15,50);
        incoming.setLineWrap(true);
        incoming.setWrapStyleWord(true);
        incoming.setEditable(false);

        JScrollPane qScroller = new JScrollPane(incoming);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        outgoing = new JTextField(20);
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());

        mainPael.add(qScroller);
        mainPael.add(outgoing);
        mainPael.add(sendButton);

        setUPNetWorking();

        Thread readerThread = new Thread(new IncomingReader());
        readerThread.start();
        frame.getContentPane().add(BorderLayout.CENTER,mainPael);
        frame.setSize(600,400);
        frame.setVisible(true);
    }

    private void setUPNetWorking(){
        try {
            sock = new Socket("10.0.0.1",5876);
            InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
            reader = new BufferedReader(streamReader);
            writer = new PrintWriter(sock.getOutputStream());
            System.out.println("Networking established");
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public class SendButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent ev){
            try {
                writer.println(outgoing.getText());
                writer.flush();
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
            outgoing.setText("");
            outgoing.requestFocus();
        }
    }

    public class IncomingReader implements Runnable{
        public void run(){
            String message;
            try {
                while ((message = reader.readLine()) !=null){
                    incoming.append((message + "\n"));
                }
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}

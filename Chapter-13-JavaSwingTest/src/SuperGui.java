import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by alexeychizhov on 21.10.2014.
 */

//TODO
//TODO Сделать кнопку очичтки textArea
//TODO Сделать счетчик для кнопки снизу
//TODO CheckBox toLower();
//TODO JList
//TODO Продвигаться дальше по книжке
//TODO

public class SuperGui {

    JFrame frame;
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JButton button1;
    JButton button2;
    JTextArea textArea;
    JTextField textField;
    JList list1;
    JLabel label1;
    JLabel label2;
    JCheckBox checkBox1;
    JCheckBox checkBox2;

    int wordsCount;
    int button1Count;
    boolean checkBox1State1;
    boolean checkBox1State2;
    String[] stringArray = {"alpha","beta","gamma","delta","epsilon","zeta","eta","theta"};
    String listChoice;

    public void go(){

        frame = new JFrame("Gui3");
        //--------------------------------
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        //--------------------------------
        label1 = new JLabel("Enter text");
        label2 = new JLabel();
        //--------------------------------
        textField  = new JTextField(10);
        //--------------------------------
        button1 = new JButton("ClickMe!");
        button1.addActionListener(new Button1Listener());
        button2 = new JButton("ClearArea");
        button2.addActionListener(new Button2Listener());
        //--------------------------------
        checkBox1 = new JCheckBox("ToUpper");
        checkBox1.setSelected(false);
        checkBox1.setBackground(Color.red);
        checkBox1.addItemListener(new Checkbox1Listener());
        //--------------------------------
        checkBox2 = new JCheckBox("UseWordList");
        checkBox2.setSelected(false);
        checkBox2.setBackground(Color.green);
        checkBox2.addItemListener(new Checkbox2Listener());
        //--------------------------------
        textArea = new JTextArea(30,40);
        //--------------------------------
        list1 = new JList(stringArray);


        textField.setSize(20,60);
        textField.addActionListener(new TextFieldActionListener());

        panel1.add(label1);
        panel1.add(textField);
        panel1.add(label2);
        panel1.add(checkBox1);
        panel1.add(button2);
        panel1.setBackground(Color.yellow);

        textArea.setLineWrap(true);
        JScrollPane scrollPane1 = new JScrollPane(textArea);
        //scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        //scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel2.add(scrollPane1);

        JScrollPane scrollPane2 = new JScrollPane(list1);

        panel3.add(scrollPane2);
        panel3.add(checkBox2);

        list1.setVisibleRowCount(4);
        list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list1.addListSelectionListener(new List1Listener());

        frame.setSize(800,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.NORTH,panel1);
        frame.getContentPane().add(BorderLayout.CENTER,panel2);
        frame.getContentPane().add(BorderLayout.SOUTH,button1);
        frame.getContentPane().add(BorderLayout.WEST,panel3);
    }

    public class TextFieldActionListener implements ActionListener  {

        public void actionPerformed (ActionEvent e){

            System.out.println("Event! - panel1/textField");

            String userText = textField.getText();


            if (checkBox1State1 & checkBox1State2 ) {
                textArea.append(userText.toUpperCase() + listChoice + "\n");
            }
            else {
                System.out.println("checkBox1State1 is " + checkBox1State1 + "," + " checkBox1State2 is " + checkBox1State2);
                if (checkBox1State1){
                    textArea.append(userText.toUpperCase() + "\n");
                }
                else {
                    if (checkBox1State2) textArea.append(userText + listChoice + "\n");
                    else {
                        textArea.append(userText + "\n");
                    }
                }
            }

            wordsCount++;

            label2.setText("TextCount is: " + wordsCount);

            textField.setText("");
            label2.repaint();
        }
    }

    public class List1Listener implements ListSelectionListener{

        public void valueChanged (ListSelectionEvent lse){

            if (!lse.getValueIsAdjusting()){
                String selection = (String) list1.getSelectedValue();
                listChoice = selection;
                System.out.println(selection);
            }
        }
    }

    class Button1Listener implements ActionListener {
        public void actionPerformed (ActionEvent e){
            System.out.println("Event! - Button1");
            button1Count ++;
            button1.setText("Button was clicked " + button1Count + " times.");

        }
    }

    class Button2Listener implements ActionListener {
        public void actionPerformed (ActionEvent e){
            System.out.println("Event! - Button2");
            textArea.setText(null);
        }
    }

    class Checkbox1Listener implements ItemListener{
        public void itemStateChanged (ItemEvent e){
            String onOrOff = "Off";
            if(checkBox1.isSelected()) onOrOff = "On";
            System.out.println("Checkbox1 is " + onOrOff);

            if (checkBox1.isSelected()) checkBox1State1 = true;
            if (!(checkBox1.isSelected())) checkBox1State1 = false;
        }
    }

    class Checkbox2Listener implements ItemListener{
        public void itemStateChanged (ItemEvent e){
            String onOrOff = "Off";
            if(checkBox2.isSelected()) onOrOff = "On";
            System.out.println("Checkbox2 is " + onOrOff);

            if (checkBox2.isSelected()) checkBox1State2 = true;
            if (!(checkBox2.isSelected())) checkBox1State2 = false;
        }
    }
}
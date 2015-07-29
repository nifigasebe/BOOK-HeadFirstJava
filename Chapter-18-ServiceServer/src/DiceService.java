/**
 * Created by Chizhov-AS on 10.02.2015.
 */

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class DiceService implements Service {
    JLabel label;
    JComboBox numOfDice;

    public JPanel getGuiPanel(){
        JPanel panel = new JPanel();
        JButton button = new JButton("Roll 'em!");
        String[] choises = {"1","2","3","4","5"};
        numOfDice = new JComboBox(choises);
        label = new JLabel("Dice values here");
        button.addActionListener(new RollEmListener());
        panel.add(numOfDice);
        panel.add(button);
        panel.add(label);
        return panel;
    }

    public class RollEmListener implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            String diceOutput = "";
            String selection = (String) numOfDice.getSelectedItem();
            int numOfDiceToRoll = Integer.parseInt(selection);
            for (int i=0; i < numOfDiceToRoll; i++){
                int r = (int)((Math.random() * 6) + 1);
                diceOutput += (" " + r);
            }

        label.setText(diceOutput);
        }
    }
}
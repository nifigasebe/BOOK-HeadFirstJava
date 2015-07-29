/**
 * Created by alexeychizhov on 20.10.2014.
 */

import java.io.*;
import java.awt.*;
import javax.swing.*;
import javax.sound.midi.*;

public class MiniMusicPlayer3 {

    static JFrame f = new JFrame("Мой первый музыкальный клип");
    static MyDrawPanel ml;

    public static void main(String[] args){

        MiniMusicPlayer3 mini = new MiniMusicPlayer3();
        mini.go();
    }

    public void setUpGui(){

        ml = new MyDrawPanel();
        f.setContentPane(ml);
        f.setBounds(30,30,300,300);
        f.setVisible(true);
    }

    public void go(){

        setUpGui();

        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addControllerEventListener(ml,new int[] {127});
            Sequence seq = new Sequence(Sequence.PPQ,4);
            Track track = seq.createTrack();

            for (int i=0; i<60; i+=4) {
                int r = (int) (Math.random() * 60);
                System.out.println(r);
                track.add(makeEvent(144, 1, r, 100, i));
                track.add(makeEvent(176, 1, 127, 0, i));
                track.add(makeEvent(128, 1, r, 100, i + 2));
            }

            sequencer.setSequence(seq);
            sequencer.start();
            sequencer.setTempoInBPM(120);
        }

        catch (Exception ex) {ex.printStackTrace();}
    }

    public MidiEvent makeEvent(int comd,int chan,int one,int two,int tick){
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd,chan,one,two);
            event = new MidiEvent(a,tick);
        }

        catch (Exception e) {}
        return event;
    }
}

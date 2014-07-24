/**
 * Created by alexeychizhov on 24.07.2014.
 */
import java.io.*;
import java.util.*;
import static java.lang.System.out;


public class FullMoons {

    static int DAY_IM = 60 * 60 * 24;
                                                                                                                        //static int DAY_IM = 1000 * 60 * 60 * 24;
    public static void main (String[] args) {

                                                                                                                        //Calendar c = new Calendar();
        Calendar c = Calendar.getInstance();
        c.set(2004,1,7,15,40);
                                                                                                                        //c.set(2004,0,7,15,40);
        long day1 = c.getTimeInMillis();
                                                                                                                        //c.setTimeInMillis(day1);
        for (int x = 0; x < 60; x++) {
            day1 += (DAY_IM * 29.52);
        }

        out.println (String.format("Полнолуние было в %tc", c));                                                        //(c.format
                                                                                                                        //out.println();
                                                                                                                        //("Full moon %tc", c));
    }
}

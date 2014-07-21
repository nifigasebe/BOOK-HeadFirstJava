/**
 * Created by alexeychizhov on 09.06.2014.
 */
import java.util.*;

public class DotCom {

    private ArrayList<String> locatioCells;
    private String name;

    public void setLocatioCells(ArrayList<String> loc) {

        locatioCells = loc;

    }

    public void setName(String n) {

        name = n;
    }

    public String checkYourSelf(String userInput) {

        String result = "Мимо";
        int index = locatioCells.indexOf(userInput);
        if ( index >= 0) {

            locatioCells.remove(index);

            if(locatioCells.isEmpty()) {

                result = "Потопил";
                System.out.println("Ой,Вы потопили " + name + " :( " );

            }

            else {

                result = "Попал";
            }

        }

        return result;
    }

}
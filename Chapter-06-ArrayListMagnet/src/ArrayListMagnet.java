/**
 * Created by alexeychizhov on 13.06.2014.
 */

import java.util.ArrayList;

public class ArrayListMagnet {

    public static void main (String [] args) {

        ArrayList<String> a = new ArrayList<String>();

        a.add(0,"ноль");
        a.add(1,"один");
        a.add(2,"два");
        a.add(3,"три");

        printAl(a);

        a.remove(2);

        if (a.contains("три")) {
            a.add("четыре");
        }

        if (a.contains("два")) {
            a.add("2.2");
        }

        printAl(a);

        if (a.indexOf("четыре") != 4) {
            a.add(4,"4.2");
        }

        printAl(a);
        printAl(a);
    }

    public static void printAl (ArrayList<String> al) {

        for (String element : al) {

        System.out.print(element + " ");

        }

        System.out.println(" ");

    }

}

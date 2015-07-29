/**
 * Created by Chizhov-as on 19.01.2015.
 */
import java.util.*;

public class SortMountains {
    LinkedList <Mountain> mtn = new LinkedList <Mountain>();

    class NameCompare implements Comparator <Mountain> {
        public int compare (Mountain one, Mountain two){
            return one.name.compareTo(two.name);
        }
    }

    class HeightCompare implements Comparator <Mountain> {
        public int compare (Mountain one, Mountain two) {
            return (two.height - one.height);
        }
    }

    public static void main(String[] args) {
        new SortMountains().go();
    }

    public void go(){

        mtn.add(new Mountain("А-Лонг-Рейндж", 1000));
        mtn.add(new Mountain("Г-Эльберт", 1030));
        mtn.add(new Mountain("В-Мурун", 1020));
        mtn.add(new Mountain("Б-Касл", 1010));

        System.out.println("В порядке добавления:\n" + mtn);

        NameCompare nc = new NameCompare();
        Collections.sort(mtn,nc);
        System.out.println("По названию:\n" + mtn);

        HeightCompare hc = new HeightCompare();
        Collections.sort(mtn,hc);
        System.out.println("По высоте:\n" + mtn);
    }
}
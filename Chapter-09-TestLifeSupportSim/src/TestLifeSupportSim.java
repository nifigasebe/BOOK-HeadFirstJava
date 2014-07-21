/**
 * Created by alexeychizhov on 13.07.2014.
 */
import java.util.ArrayList;

public class TestLifeSupportSim {

        public static void main (String [] args){

        ArrayList aList = new ArrayList();
        V2Radiator v2 = new V2Radiator(aList);
        V3Radiator v3 = new V3Radiator(aList);

        for (int z=0; z<20; z++) {

            RetentionBot ret = new RetentionBot(aList);
            //System.out.println("RetentionBot");
        }

//MY//////////////////////////////////////////////////////////

        System.out.println(aList.get(1));

        System.out.println("---------------------");
        System.out.println("aList - " + aList.size());
        System.out.println("V2Radiator - " + SimUnit.v2);
        System.out.println("V3Radiator - " + SimUnit.v3);
        System.out.println("RetentionBot - " + SimUnit.rt);
    }
}

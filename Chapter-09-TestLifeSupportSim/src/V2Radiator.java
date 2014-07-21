/**
 * Created by alexeychizhov on 13.07.2014.
 */
import java.util.ArrayList;
public class V2Radiator {

    V2Radiator(){}

    V2Radiator(ArrayList list){

        for (int x=0; x<5; x++) {

            list.add(new SimUnit("V2Radiator"));
            //System.out.println("V2Radiator");

        }
    }
}

/**
 * Created by alexeychizhov on 13.07.2014.
 */
import java.util.ArrayList;
public class V3Radiator extends V2Radiator {

    V3Radiator (ArrayList lglist){
        //super(lglist);

        for ( int g=0; g<10; g++ ) {

            lglist.add(new SimUnit("V3Radiator"));
            //System.out.println("V3Radiator");
        }
    }
}
/**
 * Created by AlexeyChizhov on 16.12.13.
 */
public class EchoTestDrive {
    public static void main (String [] args)
    {
        Echo e1 = new Echo();
        Echo e2 = new Echo(); /** -VAR- */
        int x = 0;

        while ( x < 4 ) /** -VAR- */
        {
            e1.hello();
            e1.count = e1.count + 1;  /** e2.hello(); */      /** -VAR- */

            if( x == 3 )       /** -VAR- */

                    {
                        e2.count = e2.count + 1;
                    }
            if ( x > 0 )   /** -VAR- */
                    {
                        e2.count = e2.count + e1.count;
                    }
            x = x + 1;
        }
    System.out.println(e2.count);
    }

}


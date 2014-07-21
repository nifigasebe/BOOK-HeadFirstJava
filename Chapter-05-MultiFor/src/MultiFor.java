/**
 * Created by adminlocal on 20.05.2014.
 */
public class MultiFor {

    public static void main (String [] args ) {

        for (int x = 0; x < 4 ; x++) {

            System.out.println("FOR-X ||| x = " + x);

            for (int y = 4; y > 2 ; y--) {

                System.out.println("FOR-Y ||| x = " + x);
                System.out.println( x + " " + y);

            }

            if (x == 1) {

                System.out.println("IF ==1 ||| x = " + x);
                x++ ;
            }

        }

    }

}

/*

0 4
0 3
1 4
1 3
3 4
3 3

*/
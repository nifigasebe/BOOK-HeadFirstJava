S/**
 * Created by adminlocal on 05.05.2014.
 */
public class Puzzle4 {

    public static void main ( String [] args ) {

        Puzzle4b [] obs = new Puzzle4b[6];                                                                              //1

        int y = 1;
        int x = 0;
        int result = 0;

        while ( x < 6 ) {

            obs [x] = new Puzzle4b();                                                                                   //2
            obs[x].ivar = y;                                                                                            //3
            y = y * 10;
            x = x + 1;                                                                                                  //4

        }

        x = 6;

        while ( x > 0 ) {

            x = x - 1;                                                                                                  //5
            result = result + obs[x].doStuff(x);                                                                        //6

        }

        System.out.println("Результат " + result);

    }
}

class Puzzle4b {                                                                                                        //7

    int ivar;

    public int doStuff(int factor) {                                                                                    //8 //9 //10

        if (ivar > 100) {

            return ivar * factor;                                                                                       //11
        }

        else {

            return ivar * (5 - factor);                                                                                 //12

        }

    }
}

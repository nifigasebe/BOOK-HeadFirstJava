package MainPKG;

/**
 * Created with IntelliJ IDEA.
 * User: AlexeyChizhov
 * Date: 03.08.13
 * Time: 13:12
 * To change this template use File | Settings | File Templates.
 */
public class Loopy

{

    public static void main (String[] args)

    {
        int x = 1;

        while (x < 3)

        {
           System.out.print("Doo");
           System.out.print("Bee");
           x = x + 1;
        }
        if (x == 3)
        {
            System.out.print("Do");
        }
    }

}
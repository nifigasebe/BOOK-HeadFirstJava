/**
 * Created by adminlocal on 23.04.2014.
 */

public class TestArrays
{
    public static void main (String [] args)

    {

        //Объявили ссылочную переменную, создали массив,присвоили одно
        String [] islands = new String[4];

        islands[0] = "Бермуды";
        islands[1] = "Фиджи";
        islands[2] = "Азорские острова";
        islands[3] = "Косумель";

        int [] index = new int[4];

        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int ref;
        int y = 0;

        while ( y < 4 )

        {

            ref = index[y];
            System.out.println(islands[ref]);
            y = y + 1;

        }




    }

}

package PKGBeerSong;

/**
 * Created with IntelliJ IDEA.
 * User: AlexeyChizhov
 * Date: 03.08.13
 * Time: 20:16
 * To change this template use File | Settings | File Templates.
 */
public class BeerSong
{
    public static void main (String[] args)
        {
            int BeerNum = 99;
            String Word = " Бутылок (Бутылки)";

            while (BeerNum > 0)
                {

                if (BeerNum == 1)
                    {
                    Word = "Бутылка";
                    }

            System.out.println(BeerNum + " " + Word + "" + " пива на стене !");
            System.out.println(BeerNum + " " + Word + "" + " пива !");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");

            BeerNum = BeerNum - 1;

                if (BeerNum == 0)
                    {
                    System.out.println("Нет бутылок пива на стене.");
                    }

                //else
                  //  {
                    //System.out.println("Нет бутылок пива на стене.");
                   // }
                }
        }
}
/**
 * Created by adminlocal on 12.05.2014.
 */
public class SimpleDotCom {

    int [] locationCells;
    int numOfHits = 0;

    public void setLocationCells (int [] locs) {

        locationCells = locs;

    }

    public String checkYourself (String stringGuess) {

        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";

        for (int cell : locationCells) {

            if (guess == cell) {

                result = "Попал";
                numOfHits ++;
                break;

            }

        } // Выход из for

        if (numOfHits == locationCells.length) {

            result = "Потопил";

        }

        System.out.println(result);
        return result;

    }


}

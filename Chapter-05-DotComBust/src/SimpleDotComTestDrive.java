/**
 * Created by adminlocal on 12.05.2014.
 */
public class SimpleDotComTestDrive {

    public static void main (String [] args) {

        int[] locations = {2,3,4};
        String  userGuess = "4";

        SimpleDotCom dot = new SimpleDotCom();
        dot.setLocationCells(locations);
        String result = dot.checkYourself(userGuess);

    }

}

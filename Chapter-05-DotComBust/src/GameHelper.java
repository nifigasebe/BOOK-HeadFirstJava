/**
 * Created by adminlocal on 15.05.2014.
 */
import java.io.*;
import java.nio.Buffer;

public class GameHelper {

    public String getUserInput (String prompt) {

        String imputLine = null;
        System.out.println(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            imputLine = is.readLine();
            if (imputLine.length() == 0) return null;
        }

        catch (IOException e){

            System.out.println("IOException: " +e);

        }

        return imputLine;

    }

}

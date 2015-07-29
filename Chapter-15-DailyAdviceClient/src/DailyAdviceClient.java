/**
 * Created by alexeychizhov on 08.11.2014.
 */
import java.io.*;
import java.net.*;

public class DailyAdviceClient {
    public void go() {
        try {

            Socket s = new Socket("127.0.0.1", 4242);
            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);

            String advice = reader.readLine();
            reader.close();

            System.out.print("Анекдот: " + advice);

            //1MYCode
            try {
                PrintWriter pw = new PrintWriter(new File("C:/temp/advice.txt"));
                pw.println("+++");
                pw.println(advice);
                pw.println("+++");
                pw.close();
            }
            catch (FileNotFoundException fnfex){
                fnfex.printStackTrace();
            }
            //1MYCode
        }
        catch (IOException ioex){
            ioex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }
}

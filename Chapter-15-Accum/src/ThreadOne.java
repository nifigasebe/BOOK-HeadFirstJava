/**
 * Created by Alexey on 19.11.2014.
 */
public class ThreadOne  implements Runnable{
    Accum a = Accum.getAccum();

    public void run(){

        for (int x=0; x<98; x++){
            a.updateCounter(1000);

            try {
                Thread.sleep(50);
            }
            catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
        System.out.println("один "+ a.getCount());
    }
}
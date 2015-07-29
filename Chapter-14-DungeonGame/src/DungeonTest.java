/**
 * Created by alexeychizhov on 04.11.2014.
 */
import java.io.*;

class DungeonTest {

    public static void main(String[] args) {

        DungeonGame d = new DungeonGame();

        try {

            FileOutputStream fos = new FileOutputStream("dg.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(d);
            oos.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(d.getX()+d.getY()+d.getZ());

        try {
            FileInputStream fis = new FileInputStream("dg.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            d = (DungeonGame) ois.readObject();
            ois.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(d.getX()+d.getY()+d.getZ());
    }
}

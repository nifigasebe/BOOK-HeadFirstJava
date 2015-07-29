/**
 * Created by alexeychizhov on 28.10.2014.
 */
import java.io.*;
public class WriteAFile {
    public static void main (String[] args){
        try {
            FileWriter writer = new FileWriter("999test01.txt");
            writer.write("Алоха друзья мои !");
            writer.write("Добавляем еще !" );
            writer.append("Вторая строка!") ;

            writer.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

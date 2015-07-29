/**
 * Created by Alexey on 14.11.2014.
 */
import java.io.*;
import java.net.*;

public class DailyAdviceServer {

    String[] adviceList = {"Почему вы так редко обновляете сайт? - А почему вы так часто заходите? ","Существуют ли таблетки от голода? - Да, называются котлеты!",
    "На последнем концерте Петросян, отчаявшись, бросился щекотать зрителей.", "Я сегодня защитил докторскую! Хулиганы хотели отнять пакет с колбасой, но я отбился!",
    "Китайские выпускники, выйдя на набережную встречать рассвет, перевернули материк.","Призывник так часто писал письма своей девушке, что она не дождалась его с почтальоном."};

    public void go() {
        try {
            ServerSocket serverSocket = new ServerSocket(4242);

            while (true){
                Socket sock = serverSocket.accept();
                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }

    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }
}
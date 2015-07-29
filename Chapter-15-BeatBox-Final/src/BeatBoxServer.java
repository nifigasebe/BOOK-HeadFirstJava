/**
 * Created by Alexey on 18.11.2014.
 */

import java.io.*;
import java.net.*;
import java.util.*;

public class BeatBoxServer {

    ArrayList<ObjectOutputStream> clientOutputStream;

    public static void main(String[] args) {
        new BeatBoxServer().go();
    }

    public class ClientHandler implements Runnable {

        ObjectInputStream in;
        Socket clientSocket;

        public ClientHandler(Socket socket) {
            try {
                clientSocket = socket;
                in = new ObjectInputStream(clientSocket.getInputStream());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        public void run() {
            Object o2 = null;
            Object o1 = null;
            try {

                while ((o1 = in.readObject()) != null) {
                    o2 = in.readObject();
                    System.out.println("read two objects");
                }
                tellEveryone(o1, 02);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void go(){
        clientOutputStream = new ArrayList<ObjectOutputStream>();

        try {
            ServerSocket serverSocket = new ServerSocket(4242);

            while (true){
                Socket clientSocket = serverSocket.accept();
                ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
                clientOutputStream.add(out);

                Thread t = new Thread(new ClientHandler(clientSocket));
                t.start();
                System.out.print("Got a connection");
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void tellEveryone(Object one, Object two){
        Iterator it = clientOutputStream.iterator();
        while (it.hasNext()){
            try {
                ObjectOutputStream out = (ObjectOutputStream) it.next();
                out.writeObject(one);
                out.writeObject(two);
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}

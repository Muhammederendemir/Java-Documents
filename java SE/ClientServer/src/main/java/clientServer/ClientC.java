package clientServer;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientC {
    public static void main(String[] args) {
        Socket socket ;
        final BufferedReader in;
        final PrintStream out;
        final Scanner scanner=new Scanner(System.in);

        try{
            socket=new Socket("localhost",5000);//127.0.0.1 //portuna mesaj yollayıp alıcaz
            out= new PrintStream(socket.getOutputStream());//gönderme
            in=new BufferedReader(new InputStreamReader(socket.getInputStream()));//gelen veriyi alma

            Thread thread=new Thread(new MessageThread("server",in,out,"send"));
            Thread thread1=new Thread(new MessageThread("server",in,out,"get"));
            thread.start();
            thread1.start();

        }catch (IOException e){
            e.printStackTrace();
        }


    }
}

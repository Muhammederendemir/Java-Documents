package clientServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerC {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket;
        Socket socket ;
        final BufferedReader in;
        final PrintStream out;
        final Scanner scanner=new Scanner(System.in);

        try{
            serverSocket=new ServerSocket(5000);//5000 port nunaralı socket oluşturdum
            socket=serverSocket.accept();//baglantı kuruldu
            out= new PrintStream(socket.getOutputStream());//gönderme
            in=new BufferedReader(new InputStreamReader(socket.getInputStream()));//gelen veriyi alma

            Thread thread=new Thread(new MessageThread("client",in,out,"send"));
            Thread thread1=new Thread(new MessageThread("client",in,out,"get"));
            thread.start();
            thread1.start();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}


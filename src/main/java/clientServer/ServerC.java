package clientServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerC {
    public static void main(String[] args) {
        ServerSocket serverSocket;
        Socket socket;
        final BufferedReader in;
        final PrintStream out;
        final Scanner scanner=new Scanner(System.in);

        try{
            serverSocket=new ServerSocket(5000);//5000 port nunaralı socket oluşturdum
            socket=serverSocket.accept();//baglantı kuruldu
            out= new PrintStream(socket.getOutputStream());//gönderme
            in=new BufferedReader(new InputStreamReader(socket.getInputStream()));//gelen veriyi alma

            Thread serverSubmitThread=new Thread(new Runnable() {//serverden veri yollama
                String sentmsg;
                public void run() {
                    while (true){
                         sentmsg=scanner.nextLine();
                        if (sentmsg!=null)//null mesaj göndermez
                            out.println(sentmsg);
                        out.flush();
                    }
                }
            });

            Thread serverGetThread=new Thread(new Runnable() {//servere gelen veriyi yazdırma
                String msg;
                public void run() {
                    while (true){
                        try {
                            msg=in.readLine();//porttan gelen veriyi okuma
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        if(msg!=null)//null mesaj almaz
                            System.out.println("Client :"+msg);

                    }
                }
            });

            serverSubmitThread.start();//göderme threadi start ediliyor
            serverGetThread.start();//veri alma threadi start ediliyor

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

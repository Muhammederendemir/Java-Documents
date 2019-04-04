package clientServer;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientC {
    public static void main(String[] args) {
        Socket serverSocket ;
        final BufferedReader in;
        final PrintStream out;
        final Scanner scanner=new Scanner(System.in);

        try{
            serverSocket=new Socket("localhost",5000);//127.0.0.1 //portuna mesaj yollayıp alıcaz
            out= new PrintStream(serverSocket.getOutputStream());//gönderme
            in=new BufferedReader(new InputStreamReader(serverSocket.getInputStream()));//gelen veriyi alma

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
                            System.out.println("Server :"+msg);

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

package com.multiclient;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

    public class Client {

        private Socket socket;
        private BufferedReader bufferedReader ;
        private  BufferedReader bufferedReader1 ;
        private PrintWriter printWriter ;
        private String message = null;
        private String userName = null;

        public  Client (String userName)
        {
            this.userName=userName;
            start();
        }

        public void start()
        {
            try { //gerekli nesneleri oluşturuyoruz.
                socket = new Socket("127.0.0.1",5000);//5000 porttan iletişim kuruyorum
                bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
                printWriter = new PrintWriter(socket.getOutputStream());

                printWriter.println(userName);//kullanıcı ismi severe göderildi
                printWriter.flush();//aradaki boşluklar silindi
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            write();
        }
        public void write()//mesaj gönderme ve alma
        {
            System.out.println("   --- TALİMATLAR ---   ");
            System.out.println("- #OUT  mesajı göndererek odadan çıkış yapılabilir");
            System.out.println("- #LIST mesajı göndererek odadaki kullanıcılar gösterilir");
            System.out.println("                         ");
            try{
               Thread thread=new Thread(new ClientThread(bufferedReader,userName));//veri varmı diye bakıyor varsa alıyor
               thread.start();

               while (true)//veriyi okuyup gönderiyoruz.
               {
                   message = bufferedReader1.readLine();
                   System.out.print(">> ");
                   printWriter.println(userName +"  : "+message);
                   printWriter.flush();
               }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            //kapatma işlemleri için
            try{
                socket.close();
                printWriter.close();
                bufferedReader.close();
                bufferedReader1.close();
                System.out.println(userName + "  Oturumu Kapattı ");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        public static void main (String [] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Kullanıcı isminizi giriniz ");
            String name =scanner.nextLine();
            Client client = new  Client(name);//tetikleme icin
        }
    }

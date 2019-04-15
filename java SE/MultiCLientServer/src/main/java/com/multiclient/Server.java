package com.multiclient;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    //gerekli nesneleri tanımlayıp ilklendiriyoruz.
    protected ArrayList<ServerThread> threadsArray = new ArrayList<ServerThread>();
    private ServerSocket serverSocket = null;
    private Socket socket = null;
    private int port=5000;
    public Server() {

        try {
            serverSocket = new ServerSocket(port);
            System.out.println("server "+port+" portu dinliyor");
            while (true)
            {
                socket = serverSocket.accept();//socket ile bağlentı sağlandı
                ServerThread serverThread = new ServerThread(socket,this);//MserverThread nesnesi oluşturuyorum ve this ile bu sınıfı referans ediyorum.
                threadsArray.add(serverThread);//arrayliste ekleme yapıyorum.
                serverThread.start();//Thread 'i başlattım
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        try{
            serverSocket.close();//serverSocketi kapatmak için

        }
        catch (Exception e)
        { e.printStackTrace();
        }

    }
    public static void main(String []args)
    {
        Server mserver = new Server();//yapıcı methodun tetiklenmesi için

    }
}
package com.multiclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;

public class ServerThread extends Thread {
    private BufferedReader bufferedReader = null;
    private Server server = null;
    private BufferedReader bufferedReader1 = null;
    private PrintWriter printWriter = null;
    private Socket socket = null;
    private String input = null;
    private int count=0;
    private String userName;


    public PrintWriter getPrintWriter() {
        return printWriter;
    }

    public String getUserName() {
        return userName;
    }

    public ServerThread(Socket socket, Server server){
        this.server=server;
        this.socket=socket;
        this.count++;
    }

    @Override
    public void run() {
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));//gelen veriyi okumak için
        } catch (IOException e) {
            e.printStackTrace();
        }
        bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));//klavyeden veri girmek için
        try {
            printWriter = new PrintWriter(socket.getOutputStream());//veri göndermek için
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            userName= bufferedReader.readLine();
            System.out.println(userName +"  isimli kullancı odaya katıldı   "+new Date());//odaya katılan kullanıcılar yazılıyor.
        } catch (IOException e) {
            e.printStackTrace();
        }
        Message message=new MessageImpl();
message.sendMessageClient(socket,bufferedReader,bufferedReader1,printWriter,server,count,userName);
    }
}

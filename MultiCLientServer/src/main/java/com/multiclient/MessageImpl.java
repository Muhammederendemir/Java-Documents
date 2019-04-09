package com.multiclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class MessageImpl implements Message {
    private String input = null;
    private boolean command=true;
    private String userName;

    public void getMessage(BufferedReader in) throws IOException {
        while (true) {
            try {
                String s = in.readLine();
                System.out.println(s);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void sendMessageClient(Socket socket,BufferedReader bufferedReader,BufferedReader bufferedReader1,PrintWriter printWriter, Server server,int count,String userName) {
        try {

            try {
                userName =userName ;//bufferedReader.readLine();
                //System.out.println(userName +"  isimli kullancı odaya katıldı   "+new Date());//odaya katılan kullanıcılar yazılıyor.

                while (true) {
                    try {
                        input = bufferedReader.readLine();//veriyi okumak için
                        }
                    catch (Exception e)
                    {
                        System.out.println(userName +"   isimli kullancı odadan ayrıldı  " +new Date());//odaya katılan kullanıcıtı yazdırmak için
                        break;
                    }

                    System.out.println( input); //mesajı sever ekranına basmak için
                    for(int i = 0; i < server.threadsArray.size(); i++)
                    {
                        ServerThread serverThread = server.threadsArray.get(i);

                        //System.out.println(serverThread.getUserName());
                        if(input.contains("#LIST")){//altif kullanıcıları listeler

                            if(userName==serverThread.getUserName()){
                                send("AKTİF KULLANICILAR :",serverThread.getPrintWriter());
                                for (int j=0;j<server.threadsArray.size();j++){
                                    ServerThread serverThread1=server.threadsArray.get(j);
                                    send(j+"-"+serverThread1.getUserName(),serverThread.getPrintWriter());
                                }
                            }
                            command=false;
                        }
                        if(input.contains("#OUT")){//altif kullanıcıları listeler

                            if(userName==serverThread.getUserName()){
                                server.threadsArray.remove(count-1);
                                socket.close();
                                printWriter.close();
                                bufferedReader.close();
                                bufferedReader1.close();
                            }
                            command=false;
                        }

                        if(command) {
                            send(input, serverThread.getPrintWriter());
                        }

                    }
                }
            }
            catch (NullPointerException e1)
            { //kapatmalar
                e1.printStackTrace();
                server.threadsArray.remove(count-1);
                socket.close();
                printWriter.close();
                bufferedReader.close();
                bufferedReader1.close();
            } catch (Exception e)
            {
                e.printStackTrace();

            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        try { // kapatma işlemleri için
            socket.close();
            printWriter.close();
            bufferedReader.close();
            bufferedReader1.close();
            server.threadsArray.remove(count-1);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void send(String message, PrintWriter printWriter) {//mesaj gönderme
           printWriter.println(message);
           printWriter.flush();
    }
}

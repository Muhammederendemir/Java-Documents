package com.multiclient;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public interface Message  {
    public void getMessage(BufferedReader in) throws IOException;// client mesaj alma
    public void sendMessageClient(Socket socket,BufferedReader bufferedReader,BufferedReader bufferedReader1,PrintWriter printWriter, Server server,int count,String userName);
    //server herkese mesaj gönderme
    public void send(String message,PrintWriter printWriter);//server mesaj gönderme
}

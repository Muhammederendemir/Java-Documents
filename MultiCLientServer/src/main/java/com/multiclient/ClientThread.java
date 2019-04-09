package com.multiclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ClientThread implements Runnable {
    private BufferedReader in;
    private String userName;

    public ClientThread(BufferedReader in,String userName){
        this.in=in;
        this.userName=userName;
    }

    public void run() {
        Message message=new MessageImpl();
                try {
                    message.getMessage(in);
                } catch (IOException e) {
                    e.printStackTrace();
                }
    }
}

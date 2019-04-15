package clientServer;

import java.io.BufferedReader;
import java.io.PrintStream;

public class MessageThread implements Runnable {
    String name,type;
    BufferedReader in;
    PrintStream out;
    public MessageThread(String name, BufferedReader in, PrintStream out, String type){
        this.name=name;
        this.out=out;
        this.in=in;
        this.type=type;
    }

    @Override
    public void run() {

        //System.out.println("thread calısıyor");
        Message operation=new MessageImpl();
        while (true) {
            if(type=="send")
                operation.sendMessage(out);
            else
                operation.getMessage(name, in);
        }
    }
}

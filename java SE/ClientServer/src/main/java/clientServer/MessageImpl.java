package clientServer;

import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;
import java.util.Scanner;

public class MessageImpl implements Message {

    @Override
    public void getMessage(String name, BufferedReader in) {
        String msg = "";
        Date date=new Date();
        try {
            msg = in.readLine();//porttan gelen veriyi okuma
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (msg != null)//null mesaj almaz
            System.out.println(name + " :" + msg+"      ***"+date+"***");
    }

    @Override
    public void sendMessage(PrintStream out) {
        System.out.print(">>");
        String sentmsg;
        Scanner scanner = new Scanner(System.in);
        sentmsg = scanner.nextLine();
        if (sentmsg != null) {//null mesaj göndermez
            out.println(sentmsg);
            out.flush();
        }
    }
}

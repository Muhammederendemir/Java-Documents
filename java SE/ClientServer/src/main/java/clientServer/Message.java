package clientServer;

import java.io.BufferedReader;
import java.io.PrintStream;

public interface Message {
    public void getMessage(String name,BufferedReader in);
    public void sendMessage(PrintStream out);
}

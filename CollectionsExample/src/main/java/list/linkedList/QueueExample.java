package list.linkedList;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> names=new LinkedList<String>();

        names.add("Muhammed");
        names.add("Eren");
        names.add("Demir");
        names.add("Kübra");
        names.add("Ela");

        System.out.println("names :"+names);

        String name=names.remove();

        System.out.println("Remove : "+name);
        System.out.println("new names :"+names);

        name=names.poll();
        System.out.println("poll :"+name);
        System.out.println("new names :"+names);


    }
}

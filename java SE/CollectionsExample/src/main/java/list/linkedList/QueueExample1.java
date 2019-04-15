package list.linkedList;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample1 {
    public static void main(String[] args) {
    Queue<String> names=new LinkedList<String>();

    names.add("Muhammed");
    names.add("Eren");
    names.add("Demir");
    names.add("Kübra");
    names.add("Ela");

    System.out.println("names :"+names);

        System.out.println("Boş mu ? "+names.isEmpty());

        System.out.println("Kuyruk boyutu :"+names.size());
        String name="Eren";
        if(names.contains(name))
            System.out.println("Eren ismi kuyruk icerisnde var");
        else
            System.out.println("Eren ismi kuyruk icerisinde bulunmamaktadır.");

        String personName=names.element();
        System.out.println("names element() :"+personName);

        personName=names.peek();
        System.out.println("names peek() :"+personName);
    }
}

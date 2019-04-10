package list.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueInteratingExample {
    public static void main(String[] args) {
        Queue<String> names=new LinkedList<String>();
        names.add("Muhammed");
        names.add("Eren");
        names.add("Demir");
        names.add("Kübra");
        names.add("Ela");

        System.out.println("=== Foreach metod ===");
        names.forEach(name->{
            System.out.println(name);
        });

        System.out.println("\n=== interator method ===");
        Iterator<String> waitingQueueIterator =names.iterator();
        while (waitingQueueIterator.hasNext()) {
            String name = waitingQueueIterator.next();
            System.out.println(name);
        }
        System.out.println("\n=== interator ve foreach ===");
        waitingQueueIterator=names.iterator();
        waitingQueueIterator.forEachRemaining(name->{
            System.out.println(name);
        });

        System.out.println("\n === For loop ile ===");
        for(String name :names)
            System.out.println(name);

    }
}

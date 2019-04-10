package list.linkedList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackIteratingExample {
    public static void main(String[] args) {
        Stack<String> names=new Stack<String>();
        names.push("Muhammed");
        names.push("Eren");
        names.push("Demir");
        names.push("Erkan");
        names.push("Ali");

        System.out.println("\n === names forech ile yazdırma ===");
        names.forEach(name->{
            System.out.println(name);
        });

        System.out.println("\n=== names  interator metod ile yazdırma === ");

        Iterator<String> interatorMetod = names.iterator();
        while (interatorMetod.hasNext()) {
            String name = interatorMetod.next();
            System.out.println(name);
        }

        System.out.println("\n===  iterator() ve Java 8 forEachRemaining() method ===");
        interatorMetod = names.iterator();
        while (interatorMetod.hasNext()) {
            String plate = interatorMetod.next();
            System.out.println(plate);
        }


        System.out.println("\n=== yinemleme ile  sıralamanın tersi ===");
        // ListIterator allows you to traverse in both forward and backward directions.
        // We'll start from the top of the stack and traverse backwards.
        ListIterator<String> platesListIterator = names.listIterator(names.size());
        while (platesListIterator.hasPrevious()) {
            String plate = platesListIterator.previous();
            System.out.println(plate);
        }
    }
}

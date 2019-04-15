package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> numbers=new HashSet<Integer>();

        boolean isEmpty=numbers.isEmpty();
        int size=numbers.size();

        System.out.println("isEmoty :"+isEmpty);
        System.out.println("size :"+size);

        numbers.add(5);
        numbers.add(5);

        numbers.add(10);
        numbers.add(25);
        numbers.add(100);
        numbers.add(500);
        numbers.add(1000);

        isEmpty=numbers.isEmpty();
        size=numbers.size();
        boolean contains=numbers.contains(5);
        boolean remove=numbers.remove(25);

        System.out.println("isEmpty :"+isEmpty);
        System.out.println("size :"+size);
        System.out.println("contains :"+contains);
        System.out.println("remove :"+remove);

        for (Integer number :numbers){
            System.out.println(number);
        }

        Set<String>names=new HashSet<String>();
        names.add("Muhammed ");
        names.add("Eren");
        names.add("Kübra");
        names.add("Demir");
        names.add("Erkan");

        for(String name:names)
            System.out.println(name);
    }
}

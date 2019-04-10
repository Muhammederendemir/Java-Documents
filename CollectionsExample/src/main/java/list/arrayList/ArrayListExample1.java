package list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(40);
        numbers.add(39);
        System.out.println("first");
        System.out.println(numbers.size());
        for(int i:numbers) {
            System.out.println(i);
        }
        numbers.remove(3);
        System.out.println(numbers.size());
        numbers.clear();
        System.out.println(numbers.size());

    }
}

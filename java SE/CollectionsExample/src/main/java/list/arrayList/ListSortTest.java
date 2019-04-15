package list.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortTest {
    public static void main(String[] args) {
        List<Integer>numbers=new ArrayList<Integer>();
         numbers.add(10);
         numbers.add(20);
         numbers.add(23);
         numbers.add(100);
         numbers.add(45);

         for (int i:numbers)
             System.out.println(i+" ");

        System.out.println();

        Collections.sort(numbers);
        System.out.println("Sorting numbers");
        for (int i: numbers)
            System.out.println(i+" ");
        System.out.println();
    }
}

package list.arrayList;

import java.util.Arrays;

public class ArraySortTest {
    public static void main(String[] args) {

        Integer[] numbers={10,20,30,40,-20,-10,0,5};

        for (int n: numbers)
            System.out.println(n+" ");

        System.out.println();
        System.out.println("Sorting numbers");

        Arrays.sort(numbers);

        for(int n:numbers)
            System.out.println(n+" ");

        System.out.println();
        String[] strings={"de","b","B","A","ce","ok"};

        for (String str :strings)
            System.out.println(str+" ");

        Arrays.sort(strings);

        System.out.println();
        System.out.println("sorting strings ");

        for (String str:strings){
            System.out.println(str +" ");
        }
    }
}

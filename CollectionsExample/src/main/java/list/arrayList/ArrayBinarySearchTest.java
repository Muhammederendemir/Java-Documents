package list.arrayList;

import java.util.Arrays;

public class ArrayBinarySearchTest {
    public static void main(String[] args) {
        String[] names={"Muhammed","Eren","Kübra","Ela","Bekir","Erkan"};
        Arrays.sort(names);

        for(String s:names)
            System.out.println(s);

        int index=Arrays.binarySearch(names,"Eren");
        System.out.println("Eren index : "+index);
    }
}

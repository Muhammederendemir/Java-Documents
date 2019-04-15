package javaExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ColectionsBinarySearchTest {
    public static void main(String[] args) {
        List names=new ArrayList();
        names.add("Eren");
        names.add("Muhammed");
        names.add("Esra");
        names.add("Erkan");
        names.add("Kübra");

        Collections.sort(names);

        for (Object s :names)
            System.out.println(s);

        int index=Collections.binarySearch(names,"Eren");
        System.out.println("index Eren :"+index);

    }
}

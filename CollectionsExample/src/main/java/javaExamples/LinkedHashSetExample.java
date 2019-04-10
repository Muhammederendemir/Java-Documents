package javaExamples;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> names=new LinkedHashSet<String>();//verileri ekleme sırasına göre sıralar
        names.add("Muhammed");
        names.add("Eren");
        names.add("Demir");

        System.out.println("eklenme sırasına göre İsimler :");
        for(String s:names)
            System.out.println(s);
    }
}

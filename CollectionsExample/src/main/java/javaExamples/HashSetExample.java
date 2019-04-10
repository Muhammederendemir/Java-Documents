package javaExamples;

import java.util.HashSet;

public class HashSetExample {//HashSetler sırasız olarak tutar ve veri tekrarına izin vermezler.
    public static void main(String[] args) {
        HashSet<String> kume=new HashSet<String>();
        kume.add("Eren");
        kume.add("Kübra");
        kume.add("Muhammed");

        System.out.println("Küme elemalari : ");

        for (String str: kume){
            System.out.println(str);
        }
    }
}

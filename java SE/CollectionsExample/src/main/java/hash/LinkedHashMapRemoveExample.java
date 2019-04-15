package hash;

import java.util.LinkedHashMap;

public class LinkedHashMapRemoveExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> names=new LinkedHashMap<>();
        names.put(1001,"Eren");
        names.put(200,"Muhammed");
        names.put(2,"Demir");
        names.put(58,"Bekir");

        System.out.println("names :"+names);

        String wife=names.remove("Eren");
        System.out.println("remove wife ");
    }
}

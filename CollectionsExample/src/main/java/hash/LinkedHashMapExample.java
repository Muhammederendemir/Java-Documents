package hash;

import java.util.LinkedHashMap;


public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> numberMapping=new LinkedHashMap<>();

        numberMapping.put("bir",1);
        numberMapping.put("iki",2);
        numberMapping.put("üç",3);
        numberMapping.put("dört",4);
        numberMapping.put("beş",5);

        numberMapping.putIfAbsent("altı",6);
        System.out.println(numberMapping);
    }
}

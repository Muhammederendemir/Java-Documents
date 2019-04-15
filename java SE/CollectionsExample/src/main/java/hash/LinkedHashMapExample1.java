package hash;

import java.util.LinkedHashMap;

public class LinkedHashMapExample1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> names=new LinkedHashMap<>();
        names.put(1,"Muhammed");
        names.put(2,"Eren");
        names.put(3,"Demir");
        names.put(4,"Erkan");

        System.out.println("names :"+names);

        System.out.println("Boş mu ?"+names.isEmpty());

        if(names.containsValue("Eren"))
            System.out.println("Eren ismi bulunmaktadır");
        else
            System.out.println("Eren ismi bulunmamaktadır");
        if(names.containsKey(5))
            System.out.println("'5' anahtarlı kullanıcı bulunmaktadır");
        else
            System.out.println("'5' anahtarlı kullanıcı bulunmamaktadır");

        int id=55;
        names.put(id,"Esra");
        System.out.println("eklenen id :"+id+" yeni list :"+names);
    }
}

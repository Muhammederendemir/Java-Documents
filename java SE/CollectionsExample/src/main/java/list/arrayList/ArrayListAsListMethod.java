package list.arrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListAsListMethod {
    public static void main(String[] args) {
        String[] namesArray={"Muhammed","Eren","Ali","Erkan"};
        List namesList= (List) Arrays.asList(namesArray);
        int size=namesList.size();
        System.out.println("size : "+size);

        for(String string:namesArray){
            System.out.println(string);
        }
        namesList.set(0,"set new names1");

        for (Object string:namesList){
            System.out.println(string);
        }
     }
}

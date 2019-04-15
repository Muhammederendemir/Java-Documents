package list.arrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList mArrayList=new ArrayList();
        mArrayList.add(10);
        mArrayList.add(20);
        mArrayList.add("test");
        mArrayList.set(2,"new set text");

        mArrayList.add(true);
        mArrayList.add(1,"#");

        for(int i=0; i<mArrayList.size();i++){
            System.out.println(mArrayList.get(i));
        }
    }
}

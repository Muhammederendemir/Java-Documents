package list.linkedList;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> names=new Stack<String>();

        names.push("Muhammed");
        names.push("Eren");
        names.push("Demir");
        names.push("Kübra");
        names.push("Erkan");

        System.out.println("Stack :"+names);
        System.out.println();

        String remove= names.pop();//sonuncu giren veriyi sstackten cıkartıyor ve alıyor
        System.out.println("alınan :"+remove);
        System.out.println("Stack :"+names);
        System.out.println();

        String allRemove=names.peek();//sonuncu giren veriyi sadece alıyor
        System.out.println("alınan1 :"+allRemove);
        System.out.println("Stack :"+names);
        System.out.println();
    }
}

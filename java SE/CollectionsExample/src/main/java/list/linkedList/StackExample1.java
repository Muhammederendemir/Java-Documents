package list.linkedList;

import java.util.Stack;

public class StackExample1 {
    public static void main(String[] args) {
        Stack<String> names=new Stack<String>();

        names.push("Muhammed");
        names.push("Eren");
        names.push("Demir");
        names.push("Kübra");
        names.push("Erkan");

        System.out.println("Stack :"+names);
        System.out.println();

        System.out.println("Boş mu? :"+names.isEmpty());
        System.out.println("Stack boyutu :"+names.size());

        int position=names.search("Eren");
        System.out.println("'Eren' indexi :"+position);

        position=names.search("Erkan");
        System.out.println("'Erkan' indexi :"+position);
    }
}

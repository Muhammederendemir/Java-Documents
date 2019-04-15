package list.linkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Double>prices=new LinkedList<>();

        prices.add(45.00);
        prices.add(32.43);
        prices.add(21.32);
        prices.add(23.22);
        prices.add(11.11);

        Double firsElement=prices.getFirst();
        System.out.println("first prices (ilk fiyat) :"+firsElement);

        Double lastElement=prices.getLast();
        System.out.println("first prices (son fiyat)  :"+lastElement);

        System.out.println("random selected prices (rastgele secilen fiyat)  :"+prices.get(2));
    }
}

package Varargs;

public class VarargsExample {
    public static void printNumber(int... number) {
        System.out.println("girinlen parametre sayisi:" + number.length);
        for (int i = 0; i < number.length; i++)
            System.out.println(number[i]);
    }

    public static void main(String[] args) {
        printNumber(1, 23, 4, 5, 6);
    }
}

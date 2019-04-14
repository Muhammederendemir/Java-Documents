package Varargs;

public class VarargsExample1 {

    static void sumNumber(int... number) {
        System.out.println("girilen paremetre sayisi :" + number.length);
        int total = 0;
        for (int i = 0; i < number.length; i++)
            total += number[i];
        System.out.println("TOPLAM :" + total);
    }

    static void avgNumber(String msg, int... number) {
        System.out.println("girilen paremetre sayisi :" + number.length);
        int total = 0;
        for (int i = 0; i < number.length; i++)
            total += number[i];
        total = total / number.length;
        System.out.println("Avg :" + total);
        System.out.println(msg);
    }

    public static void main(String[] args) {
        sumNumber(2, 3, 2, 5, 6, 7, 43, 2, 1);
        avgNumber("ortalama bulma", 4, 3, 2, 6, 7, 5, 2, 3, 5, 7, 9, 6, 32, 2, 34, 5);
    }
}

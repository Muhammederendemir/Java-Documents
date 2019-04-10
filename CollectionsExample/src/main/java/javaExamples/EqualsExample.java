package javaExamples;

public class EqualsExample {
    public static void main(String[] args) {
        Integer number=new Integer(10);
        Integer number1=new Integer(10);
        System.out.println(number == number1);
        System.out.println(number.equals(number1));
    }
}

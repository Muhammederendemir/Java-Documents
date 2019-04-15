package javaExamples;

public class EqualsAndHasCodeExample {
    public static void main(String[] args) {
        Integer number=new Integer(10);
        Integer number1=new Integer(10);

        System.out.println(number==number1);

        System.out.println(number.equals(number1));

        System.out.println(number.hashCode());
        System.out.println(number1.hashCode());

        System.out.println(number.hashCode()==number1.hashCode());
    }
}

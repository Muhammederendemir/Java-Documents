package javaExamples;

public class EqualsExample1 {
    public static void main(String[] args) {
        EqualsExample1 equalsExample1=new EqualsExample1();
        EqualsExample1 equalsExample2=new EqualsExample1();
        EqualsExample1 equalsExample3=equalsExample1;
        System.out.println(equalsExample1==equalsExample2);
        System.out.println(equalsExample1==equalsExample3);
        System.out.println(equalsExample1.equals(equalsExample2));
        System.out.println(equalsExample1.equals(equalsExample3));
    }
}

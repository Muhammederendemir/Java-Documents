package javaExamples;

public class HasCodeExample {
    public static void main(String[] args) {
        HasCodeExample hasCodeExample=new HasCodeExample();
        HasCodeExample hasCodeExample1=new HasCodeExample();

        System.out.println(hasCodeExample.hashCode());
        System.out.println(hasCodeExample1.hashCode());

        System.out.println(hasCodeExample);
        System.out.println(hasCodeExample1);
    }
}

package javaExamples;

public class EqualsExample2 {
    int number;
    int number1;
    public EqualsExample2(int number,int number1){
        this.number=number;
        this.number1=number1;
    }
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if (obj==null)
            return false;
        if(getClass() !=obj.getClass())
            return false;
        EqualsExample2 other= (EqualsExample2) obj;
        if(number !=other.number)
            return false;
        if(number1!=other.number1)
            return false;
        return true;
    }

    public static void main(String[] args) {
        EqualsExample2 equalsExample2=new EqualsExample2(10,20);
        EqualsExample2 equalsExample21=new EqualsExample2(10,20);

        System.out.println(equalsExample2==equalsExample21);
        System.out.println(equalsExample2.equals(equalsExample21));

        EqualsExample2 equalsExample22=new EqualsExample2(20,40);
        EqualsExample2 equalsExample23=new EqualsExample2(40,70);

        System.out.println(equalsExample22==equalsExample23);
        System.out.println(equalsExample22.equals(equalsExample23));

    }
}

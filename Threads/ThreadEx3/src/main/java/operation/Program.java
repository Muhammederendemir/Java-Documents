package operation;

public class Program {
    public static void main(String[] args) {
        Operation operation=new OperationImpl();
        ((OperationImpl) operation).array= new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9,10};


    }
}

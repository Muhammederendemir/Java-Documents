package operation;

public class OperationImpl implements Operation {
    public int[] array=new int[10];

    public void add() {
        int total = 0;
        int j;
        for (int i=0;i<(array.length)/2;i++){
            total+=array[i];
            System.out.println("toplam :"+total);
        }
    }
}

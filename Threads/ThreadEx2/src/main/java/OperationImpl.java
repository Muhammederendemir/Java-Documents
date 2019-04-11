public class OperationImpl implements Operation {
   private int[] array={1,2,3,4,5,6,7,8,9,10};
    public void NumberAdd() {
        int total = 0;
        for (int i = 0; i < array.length / 2; i++) {
            total += array[i];
            System.out.println("TOTAL : " + total);
        }

    }
    public void NumberAdd1() {
        int total = 0;
        for (int i = 5; i < array.length; i++) {
            total += array[i];
            System.out.println("TOTAL1 : " + total);
        }

    }

    public void NumberAdd(int s, int f) {
        int total=0;
        for(int i=s;i<f;i++){
            total+=array[i];
        }
        System.out.println("Total :"+total);
    }

    public void NumberSub() {

    }

    public void sumNumber() {

    }

    public void subNumber() {

    }
}

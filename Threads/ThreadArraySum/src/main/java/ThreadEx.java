public class ThreadEx implements Runnable {
    private int firstNumber;
    private int finishNumber;
    private int array[];
    private int part;
    private int total=0;
    public ThreadEx(int[] array,int part) {//yapıcı nesne threadtan önce çalışacağı icin oluşturdum
        this.array=array;
        this.part=part;
    }
    public void run() {

    }
}

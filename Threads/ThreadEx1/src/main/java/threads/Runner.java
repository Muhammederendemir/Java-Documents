package threads;
public class Runner extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Merhaba" + i);
            // Thread çalıştığında yapılması istenen işlemler buraya yazılır
        }
    }
    public void run1(){
        for (int j=0;j<4;j++)
            System.out.println("run1");
    }
}

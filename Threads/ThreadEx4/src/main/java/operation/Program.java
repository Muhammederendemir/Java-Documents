package operation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Program {
    public static void main(String[] args) {

        int sayi1=10,sayi2=5;
        ExecutorService executorService = Executors.newFixedThreadPool(2);// 2 Threadli bir Thread havuzu oluşturdum
        Runnable sumThread = new processing(sayi1,sayi2,"+");//belirlenin değeri 1 olduğunda toplama() methodu çalışacak
        Runnable subtractionThread = new OperationThread(sayi1,sayi2,2);//belirlenin değeri 2 olduğunda cikarma() methodu çalışacak
        executorService.submit(sumThread);//sumThread 'i Thread havuzuna ekledik
        executorService.submit(subtractionThread);//subtractionThread '1 Thread havuzuna ekledik

        executorService.shutdown();//Havuzun yeni bir Thread kabul etmemesini
        //ve havuzdaki Threadlerin işlerini bitirdikleri zaman onların sonlandırılmasını sağlar.

    }


}

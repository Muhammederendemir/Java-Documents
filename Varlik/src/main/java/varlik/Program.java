package varlik;

import varlik.model.Insanlar;
import varlik.model.Varlik;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Varlik varlik = new Varlik();
        Insanlar insan = new Insanlar();
        InsanlarImpl insanlar=new InsanlarImpl();
        System.out.println("Tc Numarası giriniz :");
        int tc=scanner.nextInt();
        insan.setTcNumarasi(tc);

        System.out.println(insan);
        insanlar.bedenKitleIndexi(insan);

    }
}

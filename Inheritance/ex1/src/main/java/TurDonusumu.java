public class TurDonusumu {
    public static void main(String[] args) {
        byte sayi1;
        int sayi2=1453;
        float sayi3=15.17f;
        double sayi4=192.3;

        sayi1=(byte)sayi3;
        System.out.println("int - byte :"+sayi1);

        sayi1=(byte)sayi3;
        System.out.println("float - byte :"+sayi1);

        sayi1=(byte)sayi4;
        System.out.println("double - byte :"+sayi1);
    }
}

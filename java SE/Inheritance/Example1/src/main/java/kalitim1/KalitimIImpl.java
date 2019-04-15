package kalitim1;

public class KalitimIImpl implements KalitimI {
    AnaSinif anaSinif=new AnaSinif();
    AltSinif altSinif=new AltSinif();

    int anaSinifSayac=anaSinif.sayac;
    int altSinifSayac=altSinif.sayac;
    public void toplam() {
        int toplam=anaSinifSayac+altSinifSayac;
        System.out.println("Toplam calişma sayısı :"+toplam);
    }

    public void cok() {
        if (altSinifSayac != anaSinifSayac) {
            if (altSinifSayac > anaSinifSayac) {
                System.out.println("altmetod fazla calışmış");
            } else {
                System.out.println("anametod fazla calışmış");
            }
        } else
            System.out.println("anametod ve altmetod calışma sayısı eşit");
    }
    public void az() {
        if (altSinifSayac != anaSinifSayac) {
            if (altSinifSayac < anaSinifSayac) {
                System.out.println("altmetod az calışmış");
            } else {
                System.out.println("anametod az calışmış");
            }
        } else
            System.out.println("anametod ve altmetod calışma sayısı eşit");
    }
}

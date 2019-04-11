package varlik;

import varlik.model.Insanlar;

public class InsanlarImpl implements Insan {

    public void boyOrtalama() {

    }

    public void kiloOrtamala() {

    }

    public void yasOrtalama() {

    }

    public void bedenKitleIndexi(Insanlar insanlar) {
        System.out.println("İSİM :"+insanlar.getIsim());
        System.out.println("TC NUMARASI :"+insanlar.getTcNumarasi());
        float bedenKitleIndex;
        bedenKitleIndex=(float)(insanlar.getTcNumarasi()/(insanlar.getBoy()*insanlar.getBoy()));
        System.out.println("Beden Kitle İndexi :"+bedenKitleIndex);
    }
}

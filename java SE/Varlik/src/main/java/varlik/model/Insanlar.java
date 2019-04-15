package varlik.model;

public class Insanlar extends Varlik {
    private float boy;
    private float kilo;
    private int yas;
    private String isim;
    private int tcNumarasi;



    public float getBoy() {
        return boy;
    }

    public void setBoy(float boy) {
        this.boy = boy;
    }

    public float getKilo() {
        return kilo;
    }

    public void setKilo(float kilo) {
        this.kilo = kilo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String getIsim() {
        return isim;
    }

    @Override
    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getTcNumarasi() {
        return tcNumarasi;
    }

    public void setTcNumarasi(int tcNumarasi) {
        this.tcNumarasi = tcNumarasi;
    }

    @Override
    public String toString() {
        return "Insanlar{" +
                "boy=" + boy +
                ", kilo=" + kilo +
                ", yas=" + yas +
                ", isim='" + isim + '\'' +
                ", tcNumarasi=" + tcNumarasi +
                '}';
    }
}

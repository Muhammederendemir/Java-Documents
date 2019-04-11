package Kalitim;
public class AltSinif extends Kalitim.AnaSinif {
    public void metot(){ //Override
        System.out.println("Override edilmiş metot");
    }

    public static void main(String[] args){
        Kalitim.AltSinif alt = new Kalitim.AltSinif();
        alt.metot();
    }
}

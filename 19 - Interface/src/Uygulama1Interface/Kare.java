package Uygulama1Interface;

public class Kare implements Sekil {

    private double kenar;

    public Kare(){

    }

    public Kare(double kenar){
        this.kenar = kenar;
    }

    @Override
    public double alanHesapla() {
        return kenar * kenar;
    }

    @Override
    public double cevreHesapla() {
        return 4 * kenar;
    }

    @Override
    public String toString() {
        return "Kare{" +
                "kenar=" + kenar +
                '}';
    }
}

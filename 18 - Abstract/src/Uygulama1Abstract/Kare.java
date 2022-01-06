package Uygulama1Abstract;

public class Kare extends Sekil{

    private double kenar;

    public Kare(double kenar){
        this.kenar = kenar;
    }

    public double getKenar() {
        return kenar;
    }

    public void setKenar(double kenar) {
        this.kenar = kenar;
    }

    @Override
    public double getAlan() {
        return kenar * kenar;
    }

    @Override
    public double getCevre() {
        return 4 * kenar;
    }

}


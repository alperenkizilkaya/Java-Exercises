package Uygulama1Interface;

public class Daire implements Sekil{

    private double yariCap;

    public Daire(){

    }

    public Daire(double yariCap){
        this.yariCap = yariCap;
    }

    public double getYariCap() {
        return yariCap;
    }

    public void setYariCap(double yariCap) {
        this.yariCap = yariCap;
    }

    @Override
    public double alanHesapla() {
        return Math.PI * yariCap * yariCap ;
    }

    @Override
    public double cevreHesapla() {
        return 2 * Math.PI * yariCap;
    }

    @Override
    public String toString() {
        return "Daire{" +
                "yariCap=" + yariCap +
                '}';
    }
}

package Uygulama4GenericMethod;

public class Daire {

    private final double PI = 3.14;

    private double yariCap;

    public Daire() {
    }

    public Daire(double yariCap) {
        this.yariCap = yariCap;
    }

    public double getYariCap() {
        return yariCap;
    }

    public void setYariCap(double yariCap) {
        this.yariCap = yariCap;
    }

    public double getPI(){
        return PI;
    }

    @Override
    public String toString() {
        return "Daire{" +
                "PI=" + PI +
                ", yariCap=" + yariCap +
                '}';
    }


}

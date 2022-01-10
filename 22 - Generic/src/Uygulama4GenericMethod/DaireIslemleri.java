package Uygulama4GenericMethod;

public class DaireIslemleri implements Islemler<Daire>{

    private Daire daire;

    public DaireIslemleri() {
    }

    public DaireIslemleri(Daire daire) {
        this.daire = daire;
    }

    public double alanHesapla(){

        return daire.getPI() * daire.getYariCap() * daire.getYariCap();
    }

    public double cevreHesapla(){
        return 2 * daire.getPI() * daire.getYariCap();
    }

    @Override
    public double alanHesapla(Daire t) {

        return t.getPI() * t.getYariCap() * t.getYariCap();
    }

    @Override
    public double cevreHesapla(Daire t) {

        return 2 * t.getPI() * t.getYariCap();
    }
}

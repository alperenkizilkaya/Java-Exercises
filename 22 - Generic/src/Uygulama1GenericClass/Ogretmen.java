package Uygulama1GenericClass;

public class Ogretmen extends Kisi{

    private String brans;

    public Ogretmen() {
    }

    public Ogretmen(String adi, String soyadi, int dogumYili, String brans) {
        super(adi, soyadi, dogumYili);
        this.brans = brans;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "adi='" + getAdi() + '\'' +
                ", soyadi='" + getSoyadi() + '\'' +
                ", brans='" + brans + '\'' +
                '}';
    }
}

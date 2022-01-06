package Uygulama2;

public class Ogretmen extends Kisi{

    private String brans;

    public Ogretmen(){

    }

    public Ogretmen(String isim, String soyisim, int dogumYili, Adres adres) {
        super(isim, soyisim, dogumYili, adres);
    }

    public Ogretmen(String isim, String soyisim, int dogumYili, Adres adres, String brans) {
        super(isim, soyisim, dogumYili, adres);
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
                "isim='" + getIsim() + '\'' +
                ", soyisim='" + getSoyisim() + '\'' +
                ", dogumYili=" + getDogumYili() +
                ", adres=" + getAdres() +
                ", brans='" + brans + '\'' +
                '}';
    }
}

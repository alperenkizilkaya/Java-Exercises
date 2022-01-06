package Uygulama1polymorphism;

public class Kisi {

    private String isim;

    private String soyisim;

    private int dogumYili;

    public Kisi() {
    }

    public Kisi(String isim, String soyisim, int dogumYili) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumYili = dogumYili;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getDogumYili() {
        return dogumYili;
    }

    public void setDogumYili(int dogumYili) {
        this.dogumYili = dogumYili;
    }

    @Override
    public String toString() {
        return  "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", dogumYili=" + dogumYili ;
    }
}


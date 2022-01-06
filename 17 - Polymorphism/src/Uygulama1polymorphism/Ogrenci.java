package Uygulama1polymorphism;

import java.util.ArrayList;

public class Ogrenci extends Kisi{

        private String okulNumarasi;

        private ArrayList<String> dersler;

    public Ogrenci(String isim, String soyisim, int dogumYili, String okulNumarasi, ArrayList<String> dersler) {
        super(isim, soyisim, dogumYili);
        this.okulNumarasi = okulNumarasi;
        this.dersler = dersler;
    }

    public String getOkulNumarasi() {
        return okulNumarasi;
    }

    public void setOkulNumarasi(String okulNumarasi) {
        this.okulNumarasi = okulNumarasi;
    }

    public ArrayList<String> getDersler() {
        return dersler;
    }

    public void setDersler(ArrayList<String> dersler) {
        this.dersler = dersler;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "isim='" + getIsim() + '\'' +
                ", soyisim='" + getSoyisim() + '\'' +
                ", dogumYili='" + getDogumYili() + '\'' +
                ", okulNumarasi='" + okulNumarasi + '\'' +
                ", dersler=" + dersler +
                "} ";
    }
}

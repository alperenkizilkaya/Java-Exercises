package Uygulama1;

import java.util.ArrayList;

public class Ogrenci extends Kisi{

    private String okulNumarasi;

    private ArrayList<String> dersler;

    public Ogrenci(String adi, String soyadi, int dogumYili, String okulNumarasi, ArrayList<String> dersler) {
        super(adi, soyadi, dogumYili);
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
        return "Ogrenci { adi:\'" + getAdi() + '\'' +
                ", soyadi:\'" + getSoyadi() + '\'' +
                ", doğum yılı:\'" + getDogumYili() + '\'' +
                ", okul numarası:\'" + okulNumarasi + '\'' +
                ", dersler:\'" + dersler  + "\' }" ;
    }

    /*
    @Override
    public String toString() {
        return "Ogrenci{" + super.toString() + '\'' +
                ", okulNumarasi='" + okulNumarasi + '\'' +
                ", dersler=" + dersler +
                "} ";
    }
     */
}

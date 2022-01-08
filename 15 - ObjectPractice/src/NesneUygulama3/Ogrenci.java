package NesneUygulama3;

import java.util.ArrayList;

public class Ogrenci {

    private String adi;

    private String soyadi;

    private int dogumYili;

    private String okulNumarasi;

    private ArrayList<String> dersler;

    private Adres adres;

    private ArrayList<Araba> arabalar;

    public Ogrenci(){
        System.out.println("yeni öğrenci oluşturuldu..");
    }

    public Ogrenci(String adi, String soyadi, int dogumYili, String okulNumarasi, ArrayList<String> dersler, Adres adres, ArrayList<Araba> arabalar) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.dogumYili = dogumYili;
        this.okulNumarasi = okulNumarasi;
        this.dersler = dersler;
        this.adres = adres;
        this.arabalar = arabalar;
        System.out.println("yeni öğrenci oluşturuldu..");
    }


    public String getAdi(){
        return adi;
    }

    public void setAdi(String adi){
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public int getDogumYili() {
        return dogumYili;
    }

    public void setDogumYili(int dogumYili) {
        this.dogumYili = dogumYili;
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

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public ArrayList<Araba> getArabalar() {
        return arabalar;
    }

    public void setArabalar(ArrayList<Araba> arabalar) {
        this.arabalar = arabalar;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "adi='" + adi + "\n" +
                "       soyadi='" + soyadi + "\n" +
                "       dogumYili=" + dogumYili + "\n" +
                "       okulNumarasi='" + okulNumarasi + "\n" +
                "       dersler=" + dersler + "\n" +
                "       adres=" + adres + "\n" +
                "       araba=" + arabalar  +
                '}';
    }
}

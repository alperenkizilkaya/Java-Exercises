package NesneUygulama1;

import java.util.ArrayList;

public class OgrenciTest {

    public static void main(String[] args) {

        Ogrenci ogrenci1 = new Ogrenci();

        ogrenci1.setAdi("Alperen");
        ogrenci1.setSoyadi("Kizilkaya");
        ogrenci1.setDogumYili(1996);
        ogrenci1.setOkulNumarasi("123456");

        Ogrenci ogrenci2 = new Ogrenci("furkan","coşkun",1997,"333222",null);

        ArrayList<String> dersler1 = new ArrayList<>();
        ArrayList<String> dersler2 = new ArrayList<>();

        dersler1.add("matematik");
        dersler1.add("kimya");
        dersler1.add("fizik");

        dersler2.add("İngilizce");
        dersler2.add("İspanyolca");
        dersler2.add("Fransızca");

        ogrenci1.setDersler(dersler1);
        ogrenci2.setDersler(dersler2);

        /*
        System.out.println(ogrenci1);
        System.out.println(ogrenci2);*/

        OgrenciIslemleri ogrenciIslemleri = new OgrenciIslemleri();

        ogrenciIslemleri.ogrenciEkle(ogrenci1);
        ogrenciIslemleri.ogrenciEkle(ogrenci2);

        ogrenciIslemleri.getOgrenciler();

        //ogrenciIslemleri.ogrenciSil(ogrenci2);

        //ogrenciIslemleri.getOgrenciler();

        ogrenciIslemleri.ogrenciListele();


    }
}

package NesneUygulama2;

import NesneUygulama1.OgrenciIslemleri;

import java.util.ArrayList;

public class OgrenciTest {

    public static void main(String[] args) {

        Adres adres1 = new Adres("8","gökalp sokak","bayramoğlu mahallesi","darıca","kocaeli");

        Adres adres2 = new Adres("10","yıldırım sokak","yayla mahallesi","tuzla","istanbul");

        Ogrenci ogrenci1 = new Ogrenci("Alperen","Kizilkaya",1996,"123456",null,adres1);

        Ogrenci ogrenci2 = new Ogrenci("furkan","coşkun",1997,"333222",null,null);

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

        ogrenci2.setAdres(adres2);

        System.out.println(ogrenci1);


    }
}

package Uygulama2;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        Ogrenci ogrenci1 = new Ogrenci("alp","kizilkaya",1996,null);

        Adres adres1 = new Adres("gökalp sokak", "bayramoğlu mahallesi" ,"kocaeli");

        ogrenci1.setAdres(adres1);

        ArrayList<String> dersler1 = new ArrayList<>();

        dersler1.add("matematik");
        dersler1.add("fizik");
        dersler1.add("kimya");

        ogrenci1.setDersler(dersler1);

        Ogretmen ogretmen1 = new Ogretmen("furkan","coşkun",1980,null);

        ogretmen1.setBrans("Java");
        ogretmen1.setAdres(adres1);

        KisiIslemleriImpl kisiIslemleriImpl = new KisiIslemleriImpl();

        OgrenciIslemleriImpl ogrenciIslemleriImpl = new OgrenciIslemleriImpl();

        OgretmenIslemleriImpl ogretmenIslemleriImpl = new OgretmenIslemleriImpl();

        kisiIslemleriImpl.kisiKaydet(ogrenci1);
        kisiIslemleriImpl.kisiKaydet(ogretmen1);
        kisiIslemleriImpl.kisileriListele();

        System.out.println("___________________");

        ogrenciIslemleriImpl.ogrenciKaydet(ogrenci1);
        ogrenciIslemleriImpl.ogrenciBilgileriGoster(ogrenci1);
        System.out.println("............");
        ogrenciIslemleriImpl.ogrenciListele();

        System.out.println("___________________");

        ogretmenIslemleriImpl.ogretmenKaydet(ogretmen1);
        ogretmenIslemleriImpl.ogretmenBilgileriGoster(ogretmen1);



    }
}

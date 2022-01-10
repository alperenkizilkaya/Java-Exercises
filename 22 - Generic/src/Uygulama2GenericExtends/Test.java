package Uygulama2GenericExtends;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        Ogretmen ogretmen1 = new Ogretmen("furkan","coskun", 1980,"java");
        Ogretmen ogretmen2 = new Ogretmen("timuçin","yildirim", 1970,"python");
        Ogretmen ogretmen3 = new Ogretmen("can","çelik", 1991,"c++");

        Ogrenci ogrenci1 = new Ogrenci("alp","kizilkaya",1996,"112233");
        Ogrenci ogrenci2 = new Ogrenci("ahmet","yilmaz",1995,"442211");

        Islemler<Ogretmen> ogretmenIslemler = new Islemler<Ogretmen>();

        ogretmenIslemler.kaydet(ogretmen1);
        ogretmenIslemler.kaydet(ogretmen2);
        ogretmenIslemler.kaydet(ogretmen3);

        ogretmenIslemler.sil(ogretmen2);

        ArrayList<Ogretmen> ogretmenler = ogretmenIslemler.getListe();

        for(Ogretmen ogretmen : ogretmenler){
            System.out.println(ogretmen);
        }

        Islemler<Ogrenci> ogrenciIslemler = new Islemler<>();

        ogrenciIslemler.kaydet(ogrenci1);
        ogrenciIslemler.kaydet(ogrenci2);

        ArrayList<Ogrenci> ogrenciler = ogrenciIslemler.getListe();

        for(Ogrenci ogrenci : ogrenciler){
            System.out.println(ogrenci);
        }

        //ogretmenIslemler.listele();

        //ogrenciIslemler.listele();
    }


}

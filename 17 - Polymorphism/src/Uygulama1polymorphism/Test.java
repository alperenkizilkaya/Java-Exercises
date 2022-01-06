package Uygulama1polymorphism;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        Ogrenci ogrenci1 = new Ogrenci("furkan","coşkun",1997,"221144",null);

        Ogretmen ogretmen1 = new Ogretmen("timuçin","yıldırım",1980,"matematik");

        /*
        ArrayList<Kisi> kisiler = new ArrayList<>();

        kisiler.add(ogrenci1);
        kisiler.add(ogretmen1);

        kisiListele(kisiler);
        */

        kisiBilgileriGoster(ogrenci1);
        System.out.println();
        kisiBilgileriGoster(ogretmen1);

    }

    public static void kisiBilgileriGoster(Kisi kisi){

        System.out.println("İsim : " + kisi.getIsim());
        System.out.println("Soysim : " + kisi.getSoyisim());
        System.out.println("İsim : " + kisi.getDogumYili());

    }

    /*
    public static void kisiListele(ArrayList<Kisi> kisiler){
        for (Kisi kisi : kisiler ) {
            System.out.println(kisi);
        }
    }*/
}

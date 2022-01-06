package Uygulama2;

import java.util.ArrayList;

public class KisiIslemleriImpl implements KisiIslemleri{

    private static ArrayList<Kisi> kisiler = new ArrayList<>();

    public static ArrayList<Kisi> getKisiler() {
        return kisiler;
    }

    @Override
    public boolean kisiKaydet(Kisi kisi) {

        boolean durum = kisiler.add(kisi);

        return  durum;
    }

    @Override
    public boolean kisiSil(Kisi kisi) {

        boolean durum = kisiler.remove(kisi);

        return durum;
    }

    @Override
    public void kisiBilgileriGoster(Kisi kisi) {

        System.out.println("adi : " + kisi.getIsim());
        System.out.println("soyadi : " + kisi.getSoyisim());
        System.out.println("dogumyili : " + kisi.getDogumYili());

        Adres adres = kisi.getAdres();

        System.out.println("adres " );
        System.out.println("sokak : " + adres.getSokak());
        System.out.println("mahalle : " + kisi.getAdres().getMahalle()); //it can be typed like this
        System.out.println("sehir : " + adres.getSehir());

    }

    @Override
    public void kisiAdresBilgileriGoster(Kisi kisi) {

        Adres adres = kisi.getAdres();

        System.out.println(kisi.getIsim() + " adlı kisinin adresi ->" );
        System.out.println("sokak : " + adres.getSokak());
        System.out.println("mahalle : " + kisi.getAdres().getMahalle()); //it can be typed like this
        System.out.println("sehir : " + adres.getSehir());

    }

    @Override
    public void kisileriListele() {

        for(Kisi kisi : kisiler){

            System.out.println("*************");

            if      (kisi instanceof Ogrenci) System.out.println("öğrenci");
            else if (kisi instanceof Ogretmen) System.out.println("öğretmen");

            System.out.println("adi : " + kisi.getIsim());
            System.out.println("soyadi : " + kisi.getSoyisim());
            System.out.println("dogumyili : " + kisi.getDogumYili());

            Adres adres = kisi.getAdres();

            System.out.println("sokak : " + adres.getSokak());
            System.out.println("mahalle : " + adres.getMahalle());
            System.out.println("sehir : " + adres.getSehir());
            System.out.println("*************");

        }
    }
}

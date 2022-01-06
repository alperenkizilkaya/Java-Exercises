package Uygulama2;

import java.util.ArrayList;

public class OgrenciIslemleriImpl implements OgrenciIslemleri {

    private static ArrayList<Ogrenci> ogrenciler = new ArrayList<>();

    public static ArrayList<Ogrenci> getOgrenci() {
        return ogrenciler;
    }

    @Override
    public boolean ogrenciKaydet(Ogrenci ogrenci) {
        return ogrenciler.add(ogrenci);
    }

    @Override
    public boolean ogrenciSil(Ogrenci ogrenci) {
        return ogrenciler.remove(ogrenci);
    }

    @Override
    public void ogrenciBilgileriGoster(Ogrenci ogrenci) {
        System.out.println(ogrenci);
    }

    @Override
    public void ogrenciListele() {
        for (Ogrenci ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}

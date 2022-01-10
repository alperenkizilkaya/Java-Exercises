package Uygulama3GenericInterface;

import java.util.ArrayList;

public class OgrenciIslemleri implements Islemler<Ogrenci> {

    private ArrayList<Ogrenci> ogrenciler = new ArrayList<>();

    @Override
    public boolean kaydet(Ogrenci ogrenci) {

        return ogrenciler.add(ogrenci);
    }

    @Override
    public boolean sil(Ogrenci ogrenci) {

        return ogrenciler.remove(ogrenci);
    }

    @Override
    public void listele() {

    }
}

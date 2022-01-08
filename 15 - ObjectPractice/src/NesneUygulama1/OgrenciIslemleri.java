package NesneUygulama1;

import java.util.ArrayList;

public class OgrenciIslemleri {

    private static ArrayList<Ogrenci> ogrenciler = new ArrayList<>();

    public void ogrenciEkle(Ogrenci ogrenci){

        boolean durum = ogrenciler.add(ogrenci);

        if(durum){
            System.out.println(ogrenci.getAdi() + " isimli öğrenci listeye eklendi.");
        }else{
            System.out.println(ogrenci.getAdi() + " isimli öğrenci listeye eklenirken bir hata oluştu!!!");
        }
    }

    public void ogrenciSil(Ogrenci ogrenci){

        boolean durum = ogrenciler.remove(ogrenci);

        if(durum){
            System.out.println(ogrenci.getAdi() + " isimli öğrenci listeden silindi.");
        }else{
            System.out.println(ogrenci.getAdi() + " isimli öğrenci listeden silinirken bir hata oluştu!!!");
        }
    }

    public void ogrenciListele(){

        for(Ogrenci ogrenci : ogrenciler){
            System.out.println(ogrenci);
        }

    }

    public ArrayList<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

}

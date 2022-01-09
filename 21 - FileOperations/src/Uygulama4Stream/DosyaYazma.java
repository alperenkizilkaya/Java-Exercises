package Uygulama4Stream;

import java.io.*;

public class DosyaYazma {

    private ObjectOutputStream objectOutputStream;

    public boolean dosyaOlustur(String dosyaAdi){

        String path = "C:/Users/alper/OneDrive/Masaüstü/";

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path + dosyaAdi + ".abc");

            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            return true;

        } catch (Exception e) {
            System.err.println("hata : " + e);
            return false;
        }

    }

    public void dosyaOgrenciKaydet(Ogrenci ogrenci){

        try {
            objectOutputStream.writeObject(ogrenci);
        } catch (Exception e) {
            System.err.println("hata : " + e);
        }
    }

    public void dosyaKapat(){

        if(objectOutputStream != null) {
            try {

                objectOutputStream.close();

            } catch (Exception e) {

                System.err.println("objectOutputStream kapanırken hata oluştu..");

                System.err.println("hata : " + e);

            }

        } else
            System.err.println("objectOutputStream zaten kapalı..");

    }
}

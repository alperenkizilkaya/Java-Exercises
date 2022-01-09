package Uygulama4Stream;

import java.io.*;

public class DosyaOkuma {

    private ObjectInputStream objectInputStream;

    public boolean dosyaBul(String dosyaAdi){

        String path = "C:/Users/alper/OneDrive/Masaüstü/";

        try {

            FileInputStream fileInputStream = new FileInputStream(path + dosyaAdi + ".abc");

            objectInputStream = new ObjectInputStream(fileInputStream);

            return true;

        } catch (Exception e) {

            System.err.println("hata : " + e);

            return false;
        }

    }

    public void dosyaOku(){

        try {

            while (true){

                Ogrenci ogrenci = (Ogrenci) objectInputStream.readObject();

                System.out.println(ogrenci);
            }

        }catch (EOFException e) {

            System.err.println("dosya okuma işlemi bitti"); //döngüde obje kalmayınca false dönüp hata verecek
                                                            //bu şekilde yazılacak obje kalmadığını kullanıcıya söyleyecek..

        }catch (ClassNotFoundException e) {

            System.err.println("öğrenci class'ı bulunamadı... hata : " + e);

        }catch (IOException e) {

            System.err.println("ogrenci nesnesi okunurken hata : " + e);

        }

    }

    public boolean dosyaOkumaKapat(){

        if(objectInputStream != null) {

            try {

                objectInputStream.close();

            } catch (Exception e) {

                System.err.println("hata : " + e);

                return false;

            }
        }

        return true;

    }
}

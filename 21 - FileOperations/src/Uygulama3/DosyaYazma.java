package Uygulama3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DosyaYazma {

    private PrintWriter printWriter;

    public boolean dosyaOlustur(String fileName){

        String path = "C:/Users/alper/OneDrive/Masaüstü/";

        try {

            printWriter = new PrintWriter(path + fileName + ".txt");

            return true;

        } catch (FileNotFoundException e) {

            System.err.println("hata : " + e);

            return false;
        }

    }

    public void ogrenciKaydet(Ogrenci ogrenci){

        printWriter.println(ogrenci);

    }

    public boolean printWriterClose(){

        try {
            printWriter.close();
            return true;

        }catch (Exception e){
            System.out.println("hata : " + e);
            return false;
        }


    }
}

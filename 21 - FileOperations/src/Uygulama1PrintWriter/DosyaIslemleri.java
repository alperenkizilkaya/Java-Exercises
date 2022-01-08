package Uygulama1PrintWriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DosyaIslemleri {

    public static void main(String[] args) {

        PrintWriter yazici;

        try {

            yazici = new PrintWriter("C:/Users/alper/OneDrive/Masaüstü/test.txt");

            yazici.println("alperen");
            yazici.println("kızılkaya");

            yazici.close();


        } catch (Exception e) {
            System.err.println("hata : " + e);
        }



    }
}

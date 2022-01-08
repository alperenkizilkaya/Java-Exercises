package Uygulama2Scanner;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class DosyaOkuma {

    public static void main(String[] args) {

        File file = new File("C:/Users/alper/OneDrive/Masaüstü/test.txt");
        try {

            Scanner sc = new Scanner(file);

//            String ilkKelime = sc.next();
//
//            System.out.println(ilkKelime);

            String metinBelgesi = "";

            while(sc.hasNextLine()){

                metinBelgesi += " " + sc.nextLine();

            }

            System.out.println(metinBelgesi);

            sc.close();

        } catch (Exception e) {
            System.err.println("hata : " + e);
        }
    }

}

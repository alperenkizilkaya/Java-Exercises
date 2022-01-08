package Uygulama3;

import java.io.File;
import java.util.Scanner;

public class DosyaOkuma {

    private String path = "C:/Users/alper/OneDrive/Masaüstü/";  //path of my desktop

    private String fileName;

    public boolean dosyaOku(){

        Scanner sc = new Scanner(System.in);

        System.out.println("okumak istediğiniz dosyanın adını yazın..."); // asking user-> which file wants to read

        fileName = sc.nextLine();

        sc.close();

        try {

            File file = new File(path + fileName + ".txt");

            Scanner scFile = new Scanner(file); //define file to scFile, then we'll read it with scanner methods

            while(scFile.hasNextLine()){                //while file has nextLine..

                System.out.println(scFile.nextLine()); //print the line that is checked.. and check the nextLine
            }

            scFile.close();

            return true;

        }catch (Exception e){

            System.err.println("hata : " + e);

            return false;

        }

    }
}

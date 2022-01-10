package Uygulama5Reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {

            fileReader = new FileReader("C:/Users/alper/OneDrive/Masaüstü/ogrenciler.txt");

            bufferedReader = new BufferedReader(fileReader);

            String satir;

            while ( (satir = bufferedReader.readLine()) != null){

                System.out.println(satir);

            }

            /*while (true){

                satir = bufferedReader.readLine();

                if (satir == null)
                    break;

                System.out.println(satir);

            }*/

        } catch (IOException e) {

            e.printStackTrace();

        }finally {

            try {

                if(bufferedReader != null)
                    bufferedReader.close();

            } catch (IOException e) {

                e.printStackTrace();

            }

        }

    }

}

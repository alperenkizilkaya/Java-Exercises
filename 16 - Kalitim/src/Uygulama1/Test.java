package Uygulama1;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        ArrayList<String> dersler = new ArrayList<>();

        dersler.add("matematik");
        dersler.add("fizik");

        Ogrenci ogrenci1 = new Ogrenci("alp","kizilkaya",1996,"222111",dersler);

        System.out.println(ogrenci1);
    }
}

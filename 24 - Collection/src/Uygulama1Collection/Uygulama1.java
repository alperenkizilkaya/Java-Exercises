package Uygulama1Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Uygulama1 {

    public static void main(String[] args) {

        Collection<String> isimler = new ArrayList<String>();

        isimler.add("alperen");
        isimler.add("furkan");

        for( String s : isimler){
            System.out.println(s);
        }
    }
}

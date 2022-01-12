package Uygulama3Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {

    public static void main(String[] args) {

        /*
            Set -> içine aynı türden veri almaz
                    içine eklenen verileri sıralı şekilde tutmaz

         */

        Set<String> isimler = new HashSet<>();

        String isim1 = "alp";
        String isim2 = "furkan";
        String isim3 = "timuçin";

        isimler.add(isim1);
        isimler.add(isim2);
        isimler.add(isim3);
        isimler.add(isim1);
        isimler.add(isim2);

        Iterator<String> iterator = isimler.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}

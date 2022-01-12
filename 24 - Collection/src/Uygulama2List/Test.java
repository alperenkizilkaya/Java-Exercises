package Uygulama2List;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        String isim1 = "alp";

        String isim2 = "furkan";

        String isim3 = "timuçin";

        List<String> isimler = new ArrayList<String>();

        isimler.add(isim1);
        isimler.add(isim2);
        isimler.add(isim3);
        isimler.add(isim1);

        for(String s : isimler){
            System.out.println(s);
        }

        System.out.println("_______________________");

        Iterator<String> iterator = isimler.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("_________________");

        System.out.println("isim3 içeriyor mu ? : " + isimler.contains(isim3));
    }
}

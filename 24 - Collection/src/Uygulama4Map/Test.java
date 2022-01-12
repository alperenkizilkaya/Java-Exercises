package Uygulama4Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

    public static void main(String[] args) {

        /*
        Map -> her bir değeri key-value ilişkisi ile tutuyor
                "userName" - "alperen"
                "password" - "alperen123"
        */

        Map<String, String> map1 = new HashMap<>();

        map1.put("username","alperen");
        map1.put("password","psw123");

        System.out.println(map1.get("password"));

        Map<String, Ogrenci> map2 = new HashMap<>();

        Ogrenci ogrenci1 = new Ogrenci("furkan","coskun");
        Ogrenci ogrenci2 = new Ogrenci("can","celik");

        map2.put("mimar",ogrenci1);
        map2.put("grafik tasarım",ogrenci2);

        System.out.println(map2.get("mimar"));

        System.out.println("************");

        Set<String> keys = map2.keySet();

        System.out.println(keys);

        System.out.println(map2.values());

        System.out.println(map2);
    }
}



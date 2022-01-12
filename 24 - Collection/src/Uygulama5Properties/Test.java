package Uygulama5Properties;

import java.util.Properties;

public class Test {
    public static void main(String[] args) {

        Properties properties = new Properties();

        properties.setProperty("adi","alp");
        properties.setProperty("soyadi","kizilkaya");

        String soyisim = (String) properties.get("soyadi");

        System.out.println(soyisim);
        System.out.println(properties.get("soyadi"));

        System.out.println(properties);
    }
}

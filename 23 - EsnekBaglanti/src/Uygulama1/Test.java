package Uygulama1;

public class Test {

    public static void main(String[] args) {

        Araba araba1 = new Araba("mercedes","cla180",2015,"siyah");
        Araba araba2 = new Araba("fiat","doblo",2005,"sarı");
        Araba araba3 = new Araba("sahin","tofas",1988,"kırmızı");

        /*ArabaIslemleriImpl arabaIslemleriImpl = new ArabaIslemleriImpl();

        arabaIslemleriImpl.arabaKaydet(araba1);
        arabaIslemleriImpl.arabaKaydet(araba2);
        arabaIslemleriImpl.arabaKaydet(araba3);

        arabaIslemleriImpl.arabaListele();

        ArabaIslemleriImpl2 arabaIslemleriImpl2 = new ArabaIslemleriImpl2();*/

        //  program güncellemek için kolaylık sağladı..
        // ArabaIslemleri arabaIslemleri = new ArabaIslemleriImpl();

        //            interface       = new implemented class
        ArabaIslemleri arabaIslemleri = new ArabaIslemleriImpl2();

        arabaIslemleri.arabaKaydet(araba1);
        arabaIslemleri.arabaKaydet(araba2);
        arabaIslemleri.arabaKaydet(araba3);

        arabaIslemleri.arabaListele();

    }
}

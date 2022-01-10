package Uygulama4GenericMethod;

public class Test {

    public static void main(String[] args) {

        Daire daire1 = new Daire(4.15);
        Daire daire2 = new Daire(15);

        DaireIslemleri daireIslemleri = new DaireIslemleri(daire2);

        /*System.out.println("daire1 alanı " + daireIslemleri.alanHesapla(daire1));
        System.out.println("daire2 alanı " + daireIslemleri.alanHesapla());*/

        Kare kare1 = new Kare(10);

        /*KareIslemleri kareIslemleri = new KareIslemleri();

        System.out.println("kare1 alanı : " + kareIslemleri.cevreHesapla(kare1));*/

        bilgiYazdir(daire2);
        bilgiYazdir(kare1);
    }

    public static <T> void bilgiYazdir(T t){
        System.out.println(t);
    }
}

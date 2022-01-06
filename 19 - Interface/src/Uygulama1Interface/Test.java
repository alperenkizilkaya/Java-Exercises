package Uygulama1Interface;

public class Test {

    public static void main(String[] args) {

        Kare kare1 = new Kare(4);

        Daire daire1 = new Daire(5.5);

        alanVeCevreYazdir(kare1);

        System.out.println("************");

        alanVeCevreYazdir(daire1);

        System.out.println("___________");

        daireBilgileriYazdir(daire1);

    }

    public static void alanVeCevreYazdir(Sekil sekil){

        System.out.println("alan : " + sekil.alanHesapla());

        System.out.println("çevre : " + sekil.cevreHesapla());
    }

    public static void daireBilgileriYazdir(Daire daire){

        System.out.println("daire bilgileri : ");
        System.out.println("yaricap : " + daire.getYariCap());
        System.out.println("alan : " + daire.alanHesapla());
        System.out.println("çevre : " + daire.cevreHesapla());
    }
}

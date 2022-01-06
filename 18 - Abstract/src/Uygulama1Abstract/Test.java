package Uygulama1Abstract;

public class Test {

    public static void main(String[] args) {

        Kare kare1 = new Kare(4);
        Sekil kare2 = new Kare(3);

        System.out.println("alan : " + kare1.getAlan());
        System.out.println("cevre : " + kare2.getCevre());

        System.out.println("_________");

        alanCevreHesapla(kare1);

    }

    public static void alanCevreHesapla(Sekil sekil){

        System.out.println("alan : " + sekil.getAlan());

        System.out.println("çevre : " + sekil.getCevre());

    }
}

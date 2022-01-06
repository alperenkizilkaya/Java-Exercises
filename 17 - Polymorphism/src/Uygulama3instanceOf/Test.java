package Uygulama3instanceOf;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        Daire daire1 = new Daire(3.20);
        Daire daire2 = new Daire(4.2);

        Kare kare1 = new Kare(5);
        Kare kare2 = new Kare(6);

        hesapla(kare1);

        hesapla(daire1);



    }

    public static void hesapla(Sekil sekil){

        if(sekil instanceof Kare)
            System.out.println(sekil + " alanı : " + sekil.getAlan());
        else if(sekil instanceof Daire)
            System.out.println(sekil + " çevresi : " + sekil.getCevre());

        System.out.println();
    }
}

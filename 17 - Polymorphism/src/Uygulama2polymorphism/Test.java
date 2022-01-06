package Uygulama2polymorphism;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        Daire daire1 = new Daire(3.20);
        Daire daire2 = new Daire(4.2);

        Kare kare1 = new Kare(5);
        Kare kare2 = new Kare(6);

        /*alanVeCevreYazdir(kare1);

        System.out.println();

        alanVeCevreYazdir(daire1);*/

        ArrayList<Sekil> sekiller = new ArrayList<>();

        sekiller.add(kare1);
        sekiller.add(kare2);
        sekiller.add(daire1);
        sekiller.add(daire2);

        sekilBilgileriYazdir(sekiller);

    }

    public static void alanVeCevreYazdir(Sekil sekil){
        System.out.println(sekil + "nin alanı : " + sekil.getAlan());
        System.out.println(sekil + "nin çevresi : " + sekil.getCevre());
    }

    public static void sekilBilgileriYazdir(ArrayList<Sekil> sekiller){

        System.out.println("elimizdeki şekiller ; ");

        for (Sekil sekil: sekiller) {

            System.out.println(sekil + "nin alanı : " + sekil.getAlan());
            System.out.println(sekil + "nin çevresi : " + sekil.getCevre());
            System.out.println();

        }
    }
}

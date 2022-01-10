package Uygulama1;

public class ArabaIslemleriImpl2 implements ArabaIslemleri{

    @Override
    public void arabaBilgiYazdir(Araba araba) {
        System.out.println("marka : " + araba.getMarka());
        System.out.println("model : " + araba.getModel());
        System.out.println("uretimYili : " + araba.getUretimYili());
        System.out.println("renk : " + araba.getRenk());
    }

    @Override
    public boolean arabaKaydet(Araba araba) {

        System.out.println("kaydedilen araba : ");
        arabaBilgiYazdir(araba);
        System.out.println("_____________________");

        return arabalar.add(araba);
    }

    @Override
    public boolean arabaSil(Araba araba) {

        System.out.println("silinen araba : ");
        arabaBilgiYazdir(araba);
        return arabalar.remove(araba);
    }

    @Override
    public void arabaListele() {

        for (Araba araba:
             arabalar) {
            System.out.println("_____________");
            arabaBilgiYazdir(araba);
        }
    }
}

package Uygulama1;

public class ArabaIslemleriImpl implements ArabaIslemleri {

    @Override
    public void arabaBilgiYazdir(Araba araba) {
        System.out.println(araba);
    }

    @Override
    public boolean arabaKaydet(Araba araba) {
        return arabalar.add(araba);
    }

    @Override
    public boolean arabaSil(Araba araba) {
        return arabalar.remove(araba);
    }

    @Override
    public void arabaListele() {

        for (Araba araba:
             arabalar) {
            System.out.println(araba);
        }
    }
}

package Uygulama1;

import java.util.ArrayList;

public interface ArabaIslemleri {

    public ArrayList<Araba> arabalar = new ArrayList<>();

    public void arabaBilgiYazdir(Araba araba);

    public boolean arabaKaydet(Araba araba);

    public boolean arabaSil(Araba araba);

    public void arabaListele();
}

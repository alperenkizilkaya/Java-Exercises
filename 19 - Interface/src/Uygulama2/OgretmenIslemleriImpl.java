package Uygulama2;

import java.util.ArrayList;

public class OgretmenIslemleriImpl implements OgretmenIslemleri {

    private static ArrayList<Ogretmen> ogretmenler = new ArrayList<>();

    public static ArrayList<Ogretmen> getOgretmenler() {
        return ogretmenler;
    }

    @Override
    public boolean ogretmenKaydet(Ogretmen ogretmen) {
        return ogretmenler.add(ogretmen);
    }

    @Override
    public boolean ogretmenSil(Ogretmen ogretmen) {
        return ogretmenler.remove(ogretmen);
    }

    @Override
    public void ogretmenBilgileriGoster(Ogretmen ogretmen) {
        System.out.println(ogretmen);
    }


}

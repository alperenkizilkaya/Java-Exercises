package Uygulama3GenericInterface;

import java.util.ArrayList;

public class OgretmenIslemleri implements Islemler<Ogretmen> {

    private ArrayList<Ogretmen> ogretmenler = new ArrayList<>();

    @Override
    public boolean kaydet(Ogretmen ogretmen) {
        return ogretmenler.add(ogretmen);
    }

    @Override
    public boolean sil(Ogretmen ogretmen) {
        return ogretmenler.remove(ogretmen);
    }

    @Override
    public void listele() {

    }
}

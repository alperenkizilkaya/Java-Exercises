package Uygulama1polymorphism;

public class Ogretmen extends Kisi{

    private String brans;

    public Ogretmen(String isim, String soyisim, int dogumYili, String brans) {
        super(isim, soyisim, dogumYili);
        this.brans = brans;
    }

    public String getBrans(){
        return brans;
    }

    public void setBrans(String brans){
        this.brans = brans;
    }

    @Override
    public String toString() {
        return "Ogretmen{"  + super.toString() +
                ", brans='" + brans + '\'' +
                "} ";
    }
}

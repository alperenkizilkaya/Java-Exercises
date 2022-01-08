package NesneUygulama3;

public class Araba {

    private String marka;

    private String model;

    private int uretimYili;

    public Araba(){

    }

    public Araba(String marka, String model, int uretimYili) {
        this.marka = marka;
        this.model = model;
        this.uretimYili = uretimYili;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\''  +
                '}';
    }
}

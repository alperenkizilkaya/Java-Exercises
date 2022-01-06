package NesneUygulama2;

public class Adres {

    private String binaNumarasi;

    private String sokak;

    private String mahalle;

    private String ilce;

    private String il;

    public Adres(String binaNumarasi, String sokak, String mahalle, String ilce, String il) {
        this.binaNumarasi = binaNumarasi;
        this.sokak = sokak;
        this.mahalle = mahalle;
        this.ilce = ilce;
        this.il = il;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "binaNumarasi='" + binaNumarasi + '\'' +
                ", sokak='" + sokak + '\'' +
                ", mahalle='" + mahalle + '\'' +
                ", ilce='" + ilce + '\'' +
                ", il='" + il + '\'' +
                '}';
    }
}

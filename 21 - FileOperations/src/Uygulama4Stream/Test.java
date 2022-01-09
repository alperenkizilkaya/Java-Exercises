package Uygulama4Stream;

public class Test {

    public static void main(String[] args) {

        Ogrenci ogrenci1 = new Ogrenci("alp","kizilkaya",1996,"112233");

        Ogrenci ogrenci2 = new Ogrenci("furkan","coşkun",1998,"445566");

        DosyaYazma dosyaYazma = new DosyaYazma();

        dosyaYazma.dosyaOlustur("ogrenciler2");

        dosyaYazma.dosyaOgrenciKaydet(ogrenci1);
        dosyaYazma.dosyaOgrenciKaydet(ogrenci2);

        dosyaYazma.dosyaKapat();

        DosyaOkuma dosyaOkuma = new DosyaOkuma();

        dosyaOkuma.dosyaBul("ogrenciler2");
        dosyaOkuma.dosyaOku();
        dosyaOkuma.dosyaOkumaKapat();


    }
}

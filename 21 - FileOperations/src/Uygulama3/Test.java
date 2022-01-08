package Uygulama3;

public class Test {

    public static void main(String[] args) {

        Ogrenci ogrenci1 = new Ogrenci("alp","kizilkaya",1996,"112233");

        Ogrenci ogrenci2 = new Ogrenci("furkan","coşkun",1998,"445566");

        // write

        DosyaYazma dosyaYazma = new DosyaYazma();

        dosyaYazma.dosyaOlustur("ogrenciler");

        dosyaYazma.ogrenciKaydet(ogrenci1); //save info of student

        dosyaYazma.ogrenciKaydet(ogrenci2); //save info of student

        dosyaYazma.printWriterClose();

        // read

        DosyaOkuma dosyaOkuma = new DosyaOkuma();

        dosyaOkuma.dosyaOku();
    }
}

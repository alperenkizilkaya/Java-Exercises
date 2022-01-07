package TryCatch1Uygulama;

public class Test {

    public static void main(String[] args) {

        //Adres adres = new Adres("gökalp sokak","bayramoğlu mahallesi","kocaeli");

        Ogrenci ogrenci1 = new Ogrenci("alp","kizilkaya","112233",null);

        ogrenciBilgiYazdir(ogrenci1);

        System.out.println("deneme");
    }

    public static void ogrenciBilgiYazdir(Ogrenci ogrenci){

        try {

            System.out.println("isim :" + ogrenci.getIsim());
            System.out.println("soyisim :" + ogrenci.getSoyisim());

            Adres adres = ogrenci.getAdres();

            System.out.println("sokak :" + adres.getSokak());
            System.out.println("sehir :" + adres.getSehir());

        }catch (Exception e){

            System.out.println("hata : " + e);
        }



    }
}

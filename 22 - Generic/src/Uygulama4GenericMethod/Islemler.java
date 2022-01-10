package Uygulama4GenericMethod;

public interface Islemler<T> {

    public double alanHesapla();

    public double cevreHesapla();

    public double alanHesapla(T t);

    public double cevreHesapla(T t);
}

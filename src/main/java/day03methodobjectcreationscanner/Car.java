package day03methodobjectcreationscanner;

public class Car {

    //Variable lar olusturalim

    public String model = "Tesla";
    public int fiyat = 20000;

    //Methodlari olusturalim
    //Note: return type void oldugunda method icinde return keyword kullanilmaz

    public void hareket(){
        System.out.println("Tesla cok hizli hareket eder..");

    }
    public void dur(){
        System.out.println("Cok guvenli bir sekilde durur..");
    }
    public void calis(){
        System.out.println("araba hizli calisir..");
    }



}

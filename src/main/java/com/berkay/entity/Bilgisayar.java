package com.berkay.entity;

/**
 * 2-Bir bilgisayar sınıfımız olacak bilgisayar olusturmak için gerekli olan özelliklerin her biri ayrı bir sınıf olsun
 * örneğin ram, ekran kartı işlemci, Mouse, klavye, monitör, anakart gibi
 * Daha sonra bilgisayar sınıfından 2 alt sınıf özelleştirelim bu sınıflarda kendilerine has 1 2 özellik ekleyebilirisiniz
 * Bu uygulamada sınıflar arası ilişkileri kurarak bir yapı ortaya çıkarmanızı istiyorum
 * Daha sonra test sınıfından az 2 bilgisayar oluşturmanızı istiyorum
 */
public class Bilgisayar {
    public String marka;
    public AnaKart anaKart;

    public Mause mause;
    public Klavye klavye;

    public Bilgisayar(String marka, AnaKart anaKart, Mause mause, Klavye klavye) {
        this.marka = marka;
        this.anaKart = anaKart;
        this.mause = mause;
        this.klavye = klavye;
    }

    public Bilgisayar(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "Bilgisayar{" +
                "marka='" + marka + '\'' +
                ", anaKart=" + anaKart +
                ", mause=" + mause +
                ", klavye=" + klavye +
                '}';
    }
}

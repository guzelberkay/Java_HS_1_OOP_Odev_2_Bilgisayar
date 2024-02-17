package com.berkay.entity;

public class Klavye {
    //Klavyenin Özellikleri

    String tur;

    public Klavye(String tur) {
        this.tur = tur;
    }

    @Override
    public String toString() {
        return "Klavye{" +
                "tur='" + tur + '\'' +
                '}';
    }
}

package com.berkay.entity;

public class Mause {
    //Maus Özellikleri
    int gecikmeSuresi;

    public Mause(int gecikmeSuresi) {
        this.gecikmeSuresi = gecikmeSuresi;
    }

    @Override
    public String toString() {
        return "Mause{" +
                "gecikmeSuresi=" + gecikmeSuresi +
                '}';
    }
}

package com.berkay.entity;

public class EkranKarti {
   int boyut;

    public EkranKarti(int boyut) {
        this.boyut = boyut;
    }

    @Override
    public String toString() {
        return "EkranKarti{" +
                "boyut=" + boyut +
                '}';
    }
}

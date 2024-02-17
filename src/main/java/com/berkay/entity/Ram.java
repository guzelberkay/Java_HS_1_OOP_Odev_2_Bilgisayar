package com.berkay.entity;

public class Ram {
    // RAM ozellikleri
   int boyut;

    public Ram(int boyut) {
        this.boyut = boyut;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "boyut=" + boyut +
                '}';
    }
}

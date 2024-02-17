package com.berkay.entity;


public class Islemci {
    int cekirdekSayisi;

    public Islemci(int cekirdekSayisi) {
        this.cekirdekSayisi = cekirdekSayisi;
    }

    @Override
    public String toString() {
        return "Islemci{" +
                "cekirdekSayisi=" + cekirdekSayisi +
                '}';
    }
}

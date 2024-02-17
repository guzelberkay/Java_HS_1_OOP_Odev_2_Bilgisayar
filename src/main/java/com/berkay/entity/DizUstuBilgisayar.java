package com.berkay.entity;

public class DizUstuBilgisayar extends Bilgisayar{

    double sarjYuzdesi;
    String ekran;

    public DizUstuBilgisayar(String marka, AnaKart anaKart, Mause mause, Klavye klavye) {
        super(marka, anaKart, mause, klavye);
    }

    public DizUstuBilgisayar(String marka, AnaKart anaKart, Mause mause, Klavye klavye, double sarjYuzdesi, String ekran) {
        super(marka, anaKart, mause, klavye);
        this.sarjYuzdesi = sarjYuzdesi;
        this.ekran = ekran;
    }

    @Override
    public String toString() {
        return super.toString()+"DizUstuBilgisayar{" +
                "sarjYuzdesi=" + sarjYuzdesi +
                ", ekran='" + ekran + '\'' +
                '}';
    }
}

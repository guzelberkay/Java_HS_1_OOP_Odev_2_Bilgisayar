package com.berkay.entity;

public class MasaUstuBilgisayar extends Bilgisayar{
    public Monitor monitor;
    public int kasaBoyutu;

    public MasaUstuBilgisayar(String marka, AnaKart anaKart, Mause mause, Klavye klavye) {
        super(marka, anaKart, mause, klavye);
    }

    public MasaUstuBilgisayar(String marka, AnaKart anaKart, Mause mause, Klavye klavye, Monitor monitor, int kasaBoyutu) {
        super(marka, anaKart, mause, klavye);
        this.monitor = monitor;
        this.kasaBoyutu = kasaBoyutu;
    }

    @Override
    public String toString() {
        return "MasaUstuBilgisayar{" +
                "monitor=" + monitor +
                ", kasaBoyutu=" + kasaBoyutu +
                ", marka='" + marka + '\'' +
                ", anaKart=" + anaKart +
                ", mause=" + mause +
                ", klavye=" + klavye +
                '}';
    }
}

package com.berkay;

import com.berkay.entity.*;

public class Runner {
    public static void main(String[] args) {
        Ram ram = new Ram(32);
        Islemci islemci = new Islemci(8);
        EkranKarti ekranKarti = new EkranKarti(64);

        AnaKart anaKart = new AnaKart(ram,ekranKarti,islemci);
        Mause mause = new Mause(1);
        Klavye klavye = new Klavye("mekanik");


        Bilgisayar bilgisayar = new Bilgisayar("Lenova",anaKart,mause,klavye);

        System.out.println(bilgisayar);
        System.out.println("------------------------------------------------------------------------------------------------------");
        DizUstuBilgisayar dizUstuBilgisayar = new DizUstuBilgisayar("Monster",anaKart,mause,klavye,90,"27'");

        System.out.println(dizUstuBilgisayar);
    }
}

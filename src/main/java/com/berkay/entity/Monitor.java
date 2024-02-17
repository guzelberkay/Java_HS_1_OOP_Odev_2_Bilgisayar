package com.berkay.entity;

public class Monitor {
    //Monitor özellikleri...

   int boyut;
   int kareHizi;

    public Monitor(int boyut, int kareHizi) {
        this.boyut = boyut;
        this.kareHizi = kareHizi;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "boyut=" + boyut +
                ", kareHizi=" + kareHizi +
                '}';
    }
}

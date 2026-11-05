package org.alo.greenride;

public class Kasse {

    public int kassieren(Tarifmodell tarif, int tage) {
        return tarif.berechneMietpreis(tage);
    }

    public int berechneStartgebuehr(boolean lastenrad, boolean mitHelm) {
        int preis = 2;
        if (lastenrad) {
            preis = preis * 2;
        }
        if (mitHelm) {
            preis = preis + 1;
        }
        return preis;
    }
}

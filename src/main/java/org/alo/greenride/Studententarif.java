package org.alo.greenride;

public class Studententarif implements Tarifmodell {

    @Override
    public int berechneMietpreis(int tage) {
        if (tage < 1 || tage > 7) {
            throw new IllegalArgumentException("Ungültige Anzahl Tage: " + tage);
        }
        return tage * 8;
    }
}

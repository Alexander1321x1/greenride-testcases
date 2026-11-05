package org.alo.greenride;

public class Wochenendtarif implements Tarifmodell {

    @Override
    public int berechneMietpreis(int tage) {
        if (tage < 1 || tage > 2) {
            throw new IllegalArgumentException("Ungültige Anzahl Tage: " + tage);
        }
        return tage * 9;
    }
}

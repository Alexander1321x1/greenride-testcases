package org.alo.greenride;

public class Standardtarif implements Tarifmodell {

    @Override
    public int berechneMietpreis(int tage) {
        if (tage < 1 || tage > 7) {
            throw new IllegalArgumentException("Ungültige Anzahl Tage: " + tage);
        }

        if (tage >= 3) {
            return tage * 9;
        }
        return tage * 10;
    }
}

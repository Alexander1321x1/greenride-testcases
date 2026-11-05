package org.alo.greenride;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WochenendtarifTest {
    Wochenendtarif tarif = new Wochenendtarif();

    @Test
    void einTag() {
        int preis = tarif.berechneMietpreis(1);
        assertEquals(9, preis);
    }

    @Test
    void zweiTage() {
        int preis = tarif.berechneMietpreis(2);
        assertEquals(18, preis);
    }

    @Test
    void nullTageWirdAbgelehnt() {
        assertThrows(IllegalArgumentException.class,
                () -> tarif.berechneMietpreis(0));
    }

    @Test
    void dreiTageWirdAbgelehnt() {
        assertThrows(IllegalArgumentException.class,
                () -> tarif.berechneMietpreis(3));
    }
}

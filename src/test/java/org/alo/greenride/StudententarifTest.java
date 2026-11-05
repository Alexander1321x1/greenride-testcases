package org.alo.greenride;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudententarifTest {
    Studententarif tarif = new Studententarif();

    @Test
    void einTag() {
        int preis = tarif.berechneMietpreis(1);
        assertEquals(8, preis);
    }

    @Test
    void dreiTage() {
        int preis = tarif.berechneMietpreis(3);
        assertEquals(24, preis);
    }

    @Test
    void siebenTage() {
        int preis = tarif.berechneMietpreis(7);
        assertEquals(56, preis);
    }

    @Test
    void nullTageWirdAbgelehnt() {
        assertThrows(IllegalArgumentException.class,
                () -> tarif.berechneMietpreis(0));
    }

    @Test
    void achtTageWirdAbgelehnt() {
        assertThrows(IllegalArgumentException.class,
                () -> tarif.berechneMietpreis(8));
    }
}

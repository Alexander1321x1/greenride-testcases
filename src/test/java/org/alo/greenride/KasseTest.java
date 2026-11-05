package org.alo.greenride;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KasseTest {
    Kasse kasse = new Kasse();

    @Test
    void kassiertMitStandardtarif() {
        int preis = kasse.kassieren(new Standardtarif(), 3);
        assertEquals(27, preis);
    }

    @Test
    void kassiertMitStudententarif() {
        int preis = kasse.kassieren(new Studententarif(), 3);
        assertEquals(24, preis);
    }
}

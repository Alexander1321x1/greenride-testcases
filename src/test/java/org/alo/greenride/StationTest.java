package org.alo.greenride;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class StationTest {

    @Test
    void leereKennungWirdAbgelehnt() {
        Station station = new Station(
                "Warschauer Strasse",
                "Warschauer Str. 12"
        );
        station.fahrradAufnehmen(new Fahrrad("GR-001", "City 3", 12.00));
        station.fahrradAufnehmen(new Fahrrad("GR-002", "City 3", 12.00));
        station.fahrradAufnehmen(new Fahrrad("GR-014", "Lastenrad", 24.00));

        assertThrows(IllegalArgumentException.class,
                () -> station.findeFahrrad(""));
    }

    @Test
    void nullKennungWirdAbgelehnt() {
        Station station = new Station(
                "Warschauer Strasse",
                "Warschauer Str. 12"
        );
        station.fahrradAufnehmen(new Fahrrad("GR-001", "City 3", 12.00));
        station.fahrradAufnehmen(new Fahrrad("GR-002", "City 3", 12.00));
        station.fahrradAufnehmen(new Fahrrad("GR-014", "Lastenrad", 24.00));

        assertThrows(IllegalArgumentException.class,
                () -> station.findeFahrrad(null));
    }




}
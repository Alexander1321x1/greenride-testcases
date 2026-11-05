package org.alo.greenride;

import java.util.Optional;

/**
 * Nachgestellt: Rueckgaben an der Kasse der Station Warschauer Strasse
 * am Nachmittag des 01.10. Die Mitarbeiterin tippt die Kennung vom
 * Rahmen ab. Bei der zweiten Rueckgabe hat sie sich vertippt.
 */
public class KassenApp {

    public static void main(String[] args) {


        Station warschauer = new Station("Warschauer Strasse", "Warschauer Str. 12");
        warschauer.fahrradAufnehmen(new Fahrrad("GR-001", "City 3", 12.00));
        warschauer.fahrradAufnehmen(new Fahrrad("GR-002", "City 3", 12.00));
        warschauer.fahrradAufnehmen(new Fahrrad("GR-014", "Lastenrad", 24.00));

        warschauer.fahrradAufnehmen(new Fahrrad("GR-014", "tuff", 100.00));
        rueckgabeBuchen(warschauer, "GR-014");
        rueckgabeBuchen(warschauer, "GR-041");   // vertippt: 41 statt 14
        rueckgabeBuchen(warschauer, "GR-002");

        Kasse kasse = new Kasse();
        Tarifmodell standard = new Standardtarif();
        Tarifmodell student = new Studententarif();
        Tarifmodell wochenende = new Wochenendtarif();

        System.out.println("Ausleihe 1 (Standard, 2 Tage): " + kasse.kassieren(standard, 2) + " Euro");
        System.out.println("Ausleihe 2 (Standard, 5 Tage): " + kasse.kassieren(standard, 5) + " Euro");
        System.out.println("Ausleihe 3 (Student, 5 Tage):  " + kasse.kassieren(student, 5) + " Euro");
        System.out.println("Ausleihe 4 (Wochenende, 2 Tage): " + kasse.kassieren(wochenende, 2) + " Euro");
    }

    static void rueckgabeBuchen(Station station, String kennung) {
        Optional<Fahrrad> treffer = station.findeFahrrad(kennung);
        if (treffer.isPresent()) {
            Fahrrad rad = treffer.get();
            System.out.println("Rueckgabe gebucht: " + rad.getKennung()
                    + " (" + rad.getModell() + ")");
        } else {
            System.out.println("Nicht gefunden: " + kennung
                    + " steht nicht an " + station.getName()
                    + ". Kennung pruefen.");
        }
    }
}

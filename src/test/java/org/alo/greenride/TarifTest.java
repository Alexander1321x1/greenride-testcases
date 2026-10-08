package org.alo.greenride;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TarifTest {
    Tarif tarif = new Tarif();
    @Test
    void ErsteTagTarif(){
        int Preis = tarif.berechneMietpreis(1);
        assertEquals(10,Preis);
    }
    @Test
    void ZweiteTagTarif(){
        int Preis = tarif.berechneMietpreis(2);
        assertEquals(20,Preis);
    }
    @Test
    void DritteTagTarif(){
        int Preis = tarif.berechneMietpreis(3);
        assertEquals(27,Preis);
    }
    @Test
    void VierteTagTarif(){
        int Preis = tarif.berechneMietpreis(4);
        assertEquals(36,Preis);
    }
    @Test
    void FunfteTagTarif(){
        int Preis = tarif.berechneMietpreis(5);
        assertEquals(45,Preis);
    }



}

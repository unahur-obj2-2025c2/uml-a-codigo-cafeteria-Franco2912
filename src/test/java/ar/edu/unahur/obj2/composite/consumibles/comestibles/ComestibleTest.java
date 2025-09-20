package ar.edu.unahur.obj2.composite.consumibles.comestibles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ComestibleTest {
    @Test
    void testCosto() {
        Comestible medialuna = new Medialuna("Medialuna de manteca", 150.0, 200, TipoMedialuna.DE_MANTECA);
        assertEquals(500.0, medialuna.costo());
    }

    @Test
    void testDoCosto() {

    }
}

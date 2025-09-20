package ar.edu.unahur.obj2.composite.consumibles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.composite.consumibles.bebibles.Cafe;
import ar.edu.unahur.obj2.composite.consumibles.comestibles.Medialuna;
import ar.edu.unahur.obj2.composite.consumibles.comestibles.TipoMedialuna;


class ComboTest {

    @Test
    void testCosto() {
        Consumible cafe = new Cafe("Cafe", 150.0, 200, Boolean.FALSE); //150.0
        Consumible medialuna = new Medialuna("Medialuna de manteca", 150.0, 200, TipoMedialuna.DE_MANTECA);//500.0

        Combo combo = new Combo("Combo desayuno", 1000.0);
        combo.agregarConsumible(cafe);
        combo.agregarConsumible(medialuna);

        assertEquals(650.0, combo.costo());
    }
}

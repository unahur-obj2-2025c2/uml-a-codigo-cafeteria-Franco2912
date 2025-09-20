package ar.edu.unahur.obj2.composite.consumibles.bebibles;

public class JugoDeNaranja extends Bebible {

    public JugoDeNaranja(String nombre, Double precioBase, Integer capacidadMl) {
        super(nombre, precioBase, capacidadMl);
    }

    @Override
    public Double costo() {
        return capacidadMl * doCosto();
    }

    @Override
    public Double doCosto() {
        return precioBase;
    }
}

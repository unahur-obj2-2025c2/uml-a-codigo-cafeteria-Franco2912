package ar.edu.unahur.obj2.composite.consumibles.bebibles;

import ar.edu.unahur.obj2.composite.consumibles.Producto;

public abstract class Bebible extends Producto {
    protected Integer capacidadMl;

    protected Bebible(String nombre, Double precioBase, Integer capacidadMl) {
        super(nombre, precioBase);
        this.capacidadMl = capacidadMl;
    }

    @Override
    public Double costo() {
        return capacidadMl * doCosto();
    }

    @Override
    public abstract Double doCosto();
}

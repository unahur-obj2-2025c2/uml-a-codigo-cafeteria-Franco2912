package ar.edu.unahur.obj2.composite.consumibles.comestibles;

import ar.edu.unahur.obj2.composite.consumibles.Producto;

public abstract class Comestible extends Producto{
    protected Integer pesoGr;

    protected Comestible(String nombre, Double precioBase, Integer pesoGr) {
        super(nombre, precioBase);
        this.pesoGr = pesoGr;
    }

    @Override
    public Double costo() {
        return pesoGr * doCosto();
    }

    @Override
    public abstract Double doCosto();

}

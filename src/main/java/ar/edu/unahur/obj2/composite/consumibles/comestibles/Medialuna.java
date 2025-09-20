
package ar.edu.unahur.obj2.composite.consumibles.comestibles;

public class Medialuna extends Comestible{
    private final TipoMedialuna tipo;

    public Medialuna(String nombre, Double precioBase, Integer pesoGr, TipoMedialuna tipo) {
        super(nombre, precioBase, pesoGr);
        this.tipo = tipo;
    }

    @Override
    public Double doCosto() {
        if (this.tipo.equals(TipoMedialuna.DE_MANTECA)) {
            return 500.0;
        } else if (this.tipo.equals(TipoMedialuna.DE_GRASA)) {
            return 250.0;
        } else if (this.tipo.equals(TipoMedialuna.CON_DULCE_DE_LECHE)) {
            return 550.0;
        } else {
            return 0.0;
        }
    }

    @Override
    public Double costo() {
        return switch(tipo){
            case TipoMedialuna.DE_MANTECA -> 500.0;
            case TipoMedialuna.DE_GRASA -> 250.0;
            case TipoMedialuna.CON_DULCE_DE_LECHE -> 550.0;
            default -> 0.0;
        };
    }
}

package ar.edu.unahur.obj2.composite.consumibles.comestibles;

public class Tostado extends Comestible {
    private final TipoTostado tipo;
    
    public Tostado(String nombre, Double precioBase, Integer pesoGr, TipoTostado tipo) {
        super(nombre, precioBase, pesoGr);
        this.tipo = tipo;
    }

    @Override
    public Double doCosto() {
        if (this.tipo.equals(TipoTostado.JAMON_Y_QUESO)) {
            return 500.0;
        } else if (this.tipo.equals(TipoTostado.SALAME_Y_QUESO)) {
            return 250.0;
        } else {
            return 0.0;
        }
    }



    @Override
    public Double costo() {
        return switch(tipo){
            case TipoTostado.JAMON_Y_QUESO -> 500.0;
            case TipoTostado.SALAME_Y_QUESO -> 250.0;
            default -> 0.0;
        };
    }
}

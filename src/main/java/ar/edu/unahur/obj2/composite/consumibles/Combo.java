package ar.edu.unahur.obj2.composite.consumibles;

import java.util.ArrayList;
import java.util.List;


public class Combo implements Consumible {
    private final String nombre;
    private Double precio;
    List<Consumible> consumibles;
    
    public Combo(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.consumibles = new ArrayList<>();
    }


    public void agregarConsumible(Consumible consumible) {
        consumibles.add(consumible);
    }

    public void eliminarConsumible(Consumible consumible) {
        consumibles.remove(consumible);
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public List<Consumible> getConsumibles() {
        return consumibles;
    }

    @Override
    public Double costo() {
        return Double.min(precio, this.costoConsumibles());
    }

    private Double costoConsumibles() {
        return consumibles.stream().mapToDouble(Consumible::costo).sum();
    }

}

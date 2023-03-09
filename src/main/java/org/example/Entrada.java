package org.example;

public class Entrada {

    private String nombre;
    private String descripcion; //opcional
    private Integer costo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public Entrada() {
    }

    public Entrada(String nombre, Integer costo) {
        this.nombre = nombre;
        this.costo = costo;
    }
}

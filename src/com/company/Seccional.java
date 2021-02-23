package com.company;

public class Seccional extends Automotor{
    protected String nombre;

    public Seccional(String nombre) {
        super(nombre);
        this.nombre= nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

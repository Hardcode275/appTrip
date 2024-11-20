package com.sv.appTrip.models;

public class Categoria {

    public Categoria() {
    }

    private int id;
    private String nombreCategoria;
    private String descripcion;
    private boolean activo;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCategoria() {
        return this.nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isActivo() {
        return this.activo;
    }

    public boolean getActivo() {
        return this.activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombreCategoria='" + getNombreCategoria() + "'" +
            ", descripcion='" + getDescripcion() + "'" +
            ", activo='" + isActivo() + "'" +
            "}";
    }

}

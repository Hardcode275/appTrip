package com.sv.appTrip.models;

public class Perfil {

   

    private int id;
    private String  nomPerfil;
    private String descripcion;
    private boolean activo;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomPerfil() {
        return this.nomPerfil;
    }

    public void setNomPerfil(String nomPerfil) {
        this.nomPerfil = nomPerfil;
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
            ", nomPerfil='" + getNomPerfil() + "'" +
            ", descripcion='" + getDescripcion() + "'" +
            ", activo='" + isActivo() + "'" +
            "}";
    }

}

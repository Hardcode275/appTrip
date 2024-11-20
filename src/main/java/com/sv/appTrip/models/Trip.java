package com.sv.appTrip.models;

// import java.text.ParseException;
// import java.text.SimpleDateFormat;

import java.util.Date;

public class Trip {

    public Trip() {
    }

    private Integer id;
    

    private String nomTrip;
    private String descripcion;
    private double costo;
    private int calificacion;
    private String img;
    private String detalles;
    private Date date;
    private Integer destacado;
    private String imagen="no-image.png";


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Integer getDestacado() {
        return this.destacado;
    }

    public void setDestacado(Integer destacado) {
        this.destacado = destacado;
    }

    

    public String getNomTrip() {
        return this.nomTrip;
    }

    public void setNomTrip(String nomTrip) {
        this.nomTrip = nomTrip;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return this.costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCalificacion() {
        return this.calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getImg() {
        return this.img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDetalles() {
        return this.detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Trip [id=" + id + ", nomTrip=" + nomTrip + ", descripcion=" + descripcion + ", costo=" + costo
                + ", calificacion=" + calificacion + ", img=" + img + ", detalles=" + detalles + ", date=" + date
                + ", destacado=" + destacado + ", imagen=" + imagen + ", getId()=" + getId() + ", getImagen()="
                + getImagen() + ", getDestacado()=" + getDestacado() + ", getNomTrip()=" + getNomTrip()
                + ", getDescripcion()=" + getDescripcion() + ", getCosto()=" + getCosto() + ", getCalificacion()="
                + getCalificacion() + ", getImg()=" + getImg() + ", getDetalles()=" + getDetalles() + ", getDate()="
                + getDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }
 
    
}
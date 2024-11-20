package com.sv.appTrip.models;

public class Usuario {

    public Usuario() {
    }

    private int id;
    private String nomUsuario;
    private String email;
    private String username;
    private String password;
    private boolean activo;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomUsuario() {
        return this.nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
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
            ", nomUsuario='" + getNomUsuario() + "'" +
            ", email='" + getEmail() + "'" +
            ", username='" + getUsername() + "'" +
            ", password='" + getPassword() + "'" +
            ", activo='" + isActivo() + "'" +
            "}";
    }

}
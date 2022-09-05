
package com.porfolio.mpt.Dto;

import javax.validation.constraints.NotBlank;


public class dtoInfo {
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotBlank
    private String imagen;
    @NotBlank
    private String titulo;
    @NotBlank
    private String datos;

    public dtoInfo() {
    }

    public dtoInfo(String nombre, String apellido, String imagen, String titulo, String datos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.imagen = imagen;
        this.titulo = titulo;
        this.datos = datos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }
    
    
}

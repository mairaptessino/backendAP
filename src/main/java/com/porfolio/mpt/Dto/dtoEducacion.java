
package com.porfolio.mpt.Dto;

import javax.validation.constraints.NotBlank;


public class dtoEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String imagenE;
    @NotBlank
    private String fechadesdeE;
    @NotBlank
    private String fechahastaE;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String descripcionE, String imagenE, String fechadesdeE, String fechahastaE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.imagenE = imagenE;
        this.fechadesdeE = fechadesdeE;
        this.fechahastaE = fechahastaE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getImagenE() {
        return imagenE;
    }

    public void setImagenE(String imagenE) {
        this.imagenE = imagenE;
    }

    public String getFechadesdeE() {
        return fechadesdeE;
    }

    public void setFechadesdeE(String fechadesdeE) {
        this.fechadesdeE = fechadesdeE;
    }

    public String getFechahastaE() {
        return fechahastaE;
    }

    public void setFechahastaE(String fechahastaE) {
        this.fechahastaE = fechahastaE;
    }
    

   }

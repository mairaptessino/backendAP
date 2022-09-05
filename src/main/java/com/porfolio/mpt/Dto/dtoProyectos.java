
package com.porfolio.mpt.Dto;

import javax.validation.constraints.NotBlank;


public class dtoProyectos {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String imagenE;
    @NotBlank
    private String linkE;

    public String getLinkE() {
        return linkE;
    }

    public void setLinkE(String linkE) {
        this.linkE = linkE;
    }

    public dtoProyectos() {
    }

    public dtoProyectos(String nombreE, String descripcionE, String imagenE, String linkE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.imagenE = imagenE;
        this.linkE = linkE;
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
    
    
}

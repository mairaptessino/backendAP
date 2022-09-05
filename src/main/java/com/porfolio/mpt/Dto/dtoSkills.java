
package com.porfolio.mpt.Dto;

import javax.validation.constraints.NotBlank;

public class dtoSkills {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String imagenE;
    @NotBlank
    private int porcentajeE;

    public dtoSkills() {
    }

    public dtoSkills(String nombreE, String imagenE, int porcentajeE) {
        this.nombreE = nombreE;
        this.imagenE = imagenE;
        this.porcentajeE = porcentajeE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getImagenE() {
        return imagenE;
    }

    public void setImagenE(String imagenE) {
        this.imagenE = imagenE;
    }

    public int getPorcentajeE() {
        return porcentajeE;
    }

    public void setPorcentajeE(int porcentajeE) {
        this.porcentajeE = porcentajeE;
    }
    

    
}

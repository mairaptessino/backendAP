
package com.porfolio.mpt.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    private String nombreE;
    private String descripcionE;
    private String imagenE;
    private String fechadesdeE;
    private String fechahastaE;

    public Educacion() {
    }

    public Educacion(String nombreE, String descripcionE, String imagenE, String fechadesdeE, String fechahastaE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.imagenE = imagenE;
        this.fechadesdeE = fechadesdeE;
        this.fechahastaE = fechahastaE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

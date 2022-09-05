
package com.porfolio.mpt.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="skill")
public class Skills implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)
    private int id;
    @Column(name = "nombreE",nullable = false)
    private String nombreE;
    @Column(name = "imagenE")
    private String imagenE;
    @Column(name = "porcentajeE",nullable = false)
    private int porcentajeE;

    public Skills() {
    }

    public Skills(String nombreE, String imagenE, int porcentajeE) {
        this.nombreE = nombreE;
        this.imagenE = imagenE;
        this.porcentajeE = porcentajeE;
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


package com.porfolio.mpt.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Info {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Size(min=1, max=100, message="No cumple con la longitud")
    private String nombre;
    @NotNull
    @Size(min=1, max=100, message="No cumple con la longitud")
    private String apellido;
    @NotNull
    @Size(min=1, max=100, message="No cumple con la longitud")
    private String imagen;
    @NotNull
    @Size(min=1, max=100, message="No cumple con la longitud")
    private String titulo;
    @NotNull
    @Size(min=1, max=1000, message="No cumple con la longitud")
    private String datos;

    public Info() {
    }

    public Info(String nombre, String apellido, String imagen, String titulo, String datos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.imagen = imagen;
        this.titulo = titulo;
        this.datos = datos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

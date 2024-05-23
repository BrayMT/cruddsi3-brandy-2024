package com.tec.cruddsi3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "platillo")
public class cPlatillo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_platillo")
    private int id;

    @Column(name = "nombre_platillo", length = 100)
    private String nombre_platillo;

    @Column(name = "descripcion", length = 1000)
    private String descripcion;

    @Column(name = "categoria", length = 1000)
    private String categoria;
   
    @Column(name = "precio", length = 1000)
    private String precio;

    public cPlatillo() {
    }

    public cPlatillo(int id, String nombre_platillo, String descripcion, String categoria, String precio) {
        this.id = id;
        this.nombre_platillo = nombre_platillo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
    }

    public cPlatillo(String nombre_platillo, String descripcion, String categoria, String precio) {
        this.nombre_platillo = nombre_platillo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_platillo() {
        return nombre_platillo;
    }

    public void setNombre_platillo(String nombre_platillo) {
        this.nombre_platillo = nombre_platillo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

  
  

}
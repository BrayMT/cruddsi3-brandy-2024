package com.tec.cruddsi3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class cCliente {
    
    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "id_cliente")
    private int id;
    
    @Column(name = "Nombres", length = 50)
    private String nombres;

    @Column(name = "Dni", length = 100)
    private String dni;

    @Column(name = "Apellidos", length = 100)
    private String apellidos;

    @Column(name = "Direccion", length = 200)
    private String direccion;

    @Column(name = "Ciudad", length = 100)
    private String ciudad;
    
    
    //constructores
    public cCliente() {
    }


    public cCliente(int id, String nombres, String dni, String apellidos, String direccion, String ciudad) {
        this.id = id;
        this.nombres = nombres;
        this.dni = dni;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }


    public cCliente(String nombres, String dni, String apellidos, String direccion, String ciudad) {
        this.nombres = nombres;
        this.dni = dni;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNombres() {
        return nombres;
    }


    public void setNombres(String nombres) {
        this.nombres = nombres;
    }


    public String getDni() {
        return dni;
    }


    public void setDni(String dni) {
        this.dni = dni;
    }


    public String getApellidos() {
        return apellidos;
    }


    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getCiudad() {
        return ciudad;
    }


    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


}

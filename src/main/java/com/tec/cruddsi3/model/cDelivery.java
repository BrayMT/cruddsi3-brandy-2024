package com.tec.cruddsi3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "delivery")
public class cDelivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_delivery")
    private int id;

    @Column(name = "Dni")
    private int dni;

    @Column(name = "hora", length = 100)
    private String hora;

    @Column(name = "direccion", length = 100)
    private String direccion;

    @Column(name = "estado_pedido", length = 200)
    private String estado_pedido;

    @Column(name = "tiempo_entrega", length = 200)
    private String tiempo_entrega;

    public cDelivery() {
    }

    public cDelivery(int id, int dni, String hora, String direccion, String estado_pedido, String tiempo_entrega) {
        this.id = id;
        this.dni = dni;
        this.hora = hora;
        this.direccion = direccion;
        this.estado_pedido = estado_pedido;
        this.tiempo_entrega = tiempo_entrega;
    }

    public cDelivery(int dni, String hora, String direccion, String estado_pedido, String tiempo_entrega) {
        this.dni = dni;
        this.hora = hora;
        this.direccion = direccion;
        this.estado_pedido = estado_pedido;
        this.tiempo_entrega = tiempo_entrega;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado_pedido() {
        return estado_pedido;
    }

    public void setEstado_pedido(String estado_pedido) {
        this.estado_pedido = estado_pedido;
    }

    public String getTiempo_entrega() {
        return tiempo_entrega;
    }

    public void setTiempo_entrega(String tiempo_entrega) {
        this.tiempo_entrega = tiempo_entrega;
    }





    

   


}
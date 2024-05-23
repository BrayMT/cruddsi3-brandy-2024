package com.tec.cruddsi3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos")
public class cPedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "id")
    private int id;

    @Column(name = "nombre_pedido", length = 200)
    private String nombre_pedido;

    @Column(name = "cantidad", length = 50)
    private String cantidad;

    @Column(name = "fecha_pedido", length = 300)
    private String fecha_pedido;


    public cPedidos() {
    }
    public cPedidos(int id, String nombre_pedido, String cantidad, String fecha_pedido) {
        this.id = id;
        this.nombre_pedido = nombre_pedido;
        this.cantidad = cantidad;
        this.fecha_pedido = fecha_pedido;
    }




    public cPedidos(String nombre_pedido, String cantidad, String fecha_pedido) {
        this.nombre_pedido = nombre_pedido;
        this.cantidad = cantidad;
        this.fecha_pedido = fecha_pedido;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_pedido() {
        return nombre_pedido;
    }

    public void setNombre_pedido(String nombre_pedido) {
        this.nombre_pedido = nombre_pedido;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(String fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }
}

package com.peluqueria.lourdes.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long codigo;
    private String nombre;
    private String descripcion;
    private double price;
    private int stock;

    @ManyToOne(fetch = FetchType.EAGER)
    private Sucursal sucursal;


    public Producto() {
    }

    public Producto(String nombre, String descripcion, double price, int stock, Sucursal sucursal) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.price = price;
        this.stock = stock;
        this.sucursal = sucursal;
    }


    public long getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
}

package com.peluqueria.lourdes.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private LocalDateTime fechaYhora;
    private double monto;

    @ManyToOne(fetch = FetchType.EAGER)
    private Producto producto;

    @ManyToOne(fetch = FetchType.EAGER)
    private Cliente cliente;


    public Ticket() {
    }

    public Ticket(LocalDateTime fechaYhora, double monto, Producto producto, Cliente cliente) {
        this.fechaYhora = fechaYhora;
        this.monto = monto;
        this.producto = producto;
        this.cliente = cliente;
    }

    public long getId() {
        return id;
    }

    public LocalDateTime getFechaYhora() {
        return fechaYhora;
    }

    public void setFechaYhora(LocalDateTime fechaYhora) {
        this.fechaYhora = fechaYhora;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Producto getProductos() {
        return producto;
    }

    public void setProductos(Producto productos) {
        this.producto = productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

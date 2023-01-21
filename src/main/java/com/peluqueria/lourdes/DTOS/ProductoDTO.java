package com.peluqueria.lourdes.DTOS;

import com.peluqueria.lourdes.models.Producto;
import com.peluqueria.lourdes.models.Sucursal;

public class ProductoDTO {

    private long codigo;
    private String nombre;
    private String descripcion;
    private double price;
    private int stock;

    private long sucursal;

    public ProductoDTO() {
    }

    public ProductoDTO(Producto producto) {
        this.codigo = producto.getCodigo();
        this.nombre = producto.getNombre();
        this.descripcion = producto.getDescripcion();
        this.price = producto.getPrice();
        this.stock = producto.getStock();
        this.sucursal = producto.getSucursal().getId();
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public long getSucursal() {
        return sucursal;
    }
}

package com.peluqueria.lourdes.DTOS;

import com.peluqueria.lourdes.models.Producto;
import com.peluqueria.lourdes.models.Sucursal;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SucursalDTO {

    private long id;

    private String domicilio;

    private String ciudad;


    private Set<ProductoDTO> productos = new HashSet<>();


    public SucursalDTO() {
    }

    public SucursalDTO(Sucursal sucursal) {
        this.id = sucursal.getId();
        this.domicilio = sucursal.getDomicilio();
        this.ciudad = sucursal.getCiudad();
        this.productos = sucursal.getProductos().stream().map(producto -> new ProductoDTO(producto)).collect(Collectors.toSet());
    }

    public long getId() {
        return id;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public Set<ProductoDTO> getProductos() {
        return productos;
    }
}

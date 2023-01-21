package com.peluqueria.lourdes.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Sucursal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private String domicilio;

    private String ciudad;


    @OneToMany(mappedBy = "sucursal", fetch = FetchType.EAGER)
    private Set<Producto> productos = new HashSet<>();


    public Sucursal() {
    }

    public Sucursal(String domicilio, String ciudad) {
        this.domicilio = domicilio;
        this.ciudad = ciudad;
    }


    public long getId() {
        return id;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Set<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }
}

package com.peluqueria.lourdes.DTOS;

import com.peluqueria.lourdes.models.Cliente;

public class ClienteDTO {


    private long id;

    private int dni;

    private String nombre;

    private String apellido;

    private String email;
    private String password;

    private String telefono;


    public ClienteDTO() {
    }

    public ClienteDTO(Cliente cliente) {

        this.id = cliente.getId();
        this.dni = cliente.getDni();
        this.nombre = cliente.getNombre();
        this.apellido = cliente.getApellido();
        this.email = cliente.getEmail();
        this.password = cliente.getPassword();
        this.telefono = cliente.getTelefono();

    }


    public long getId() {
        return id;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getTelefono() {
        return telefono;
    }
}

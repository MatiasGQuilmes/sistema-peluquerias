package com.peluqueria.lourdes.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private int dni;

    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private String telefono;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
    private List<ClienteTurno> turnos = new ArrayList<>();

    @OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
    private Set<Ticket> tickets = new HashSet<>();

    public Cliente() {
    }

    public Cliente(int dni, String nombre, String apellido, String telefono, String email, String password ){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.password = password;
    }


    public long getId() {
        return id;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public List<ClienteTurno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<ClienteTurno> turnos) {
        this.turnos = turnos;
    }

    public Set<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Set<Ticket> tickets) {
        this.tickets = tickets;
    }


}



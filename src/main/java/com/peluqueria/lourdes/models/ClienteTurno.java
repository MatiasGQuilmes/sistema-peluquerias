package com.peluqueria.lourdes.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
public class ClienteTurno {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.EAGER)
    private Turno turno;

    public ClienteTurno() {
    }

    public ClienteTurno(Cliente cliente, Turno turno) {
        this.cliente = cliente;
        this.turno = turno;
    }

    public long getId() {
        return id;
    }




    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
}

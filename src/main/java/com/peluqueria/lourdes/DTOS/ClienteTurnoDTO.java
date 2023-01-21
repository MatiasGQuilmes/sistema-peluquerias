package com.peluqueria.lourdes.DTOS;

import com.peluqueria.lourdes.models.Cliente;
import com.peluqueria.lourdes.models.ClienteTurno;
import com.peluqueria.lourdes.models.Turno;

import java.sql.Date;
import java.sql.Time;

public class ClienteTurnoDTO {

    private long id;

    private Date date;
    private Time time;

    private long cliente;
    private long turno;

    public ClienteTurnoDTO(ClienteTurno clienteTurno) {
        this.id = clienteTurno.getId();
        this.date = clienteTurno.getTurno().getFecha();
        this.time = clienteTurno.getTurno().getHorario();
        this.cliente = clienteTurno.getCliente().getId();
        this.turno = clienteTurno.getTurno().getId();
    }

    public long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }

    public long getCliente() {
        return cliente;
    }

    public long getTurno() {
        return turno;
    }
}

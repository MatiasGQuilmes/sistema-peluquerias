package com.peluqueria.lourdes.DTOS;

import com.peluqueria.lourdes.models.Turno;

import java.sql.Date;
import java.sql.Time;
import java.util.Set;

public class TurnoDTO {

    private long id;
    private Date fecha;
    private Time horario;


    public TurnoDTO() {
    }

    public TurnoDTO(Turno turno) {
        this.id = turno.getId();
        this.fecha = turno.getFecha();
        this.horario = turno.getHorario();
    }


    public long getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public Time getHorario() {
        return horario;
    }
}

package com.peluqueria.lourdes.DTOS;

import com.peluqueria.lourdes.models.Cliente;
import com.peluqueria.lourdes.models.Producto;
import com.peluqueria.lourdes.models.Ticket;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.List;

public class TicketDTO {

    private long id;

    private LocalDateTime fechaYhora;
    private double monto;

    private long producto;

    private long cliente;



    public TicketDTO() {
    }

    public TicketDTO(Ticket ticket) {
        this.id = ticket.getId();
        this.fechaYhora = ticket.getFechaYhora();
        this.monto = ticket.getMonto();
        this.producto = ticket.getProductos().getCodigo();
        this.cliente = ticket.getCliente().getId();
    }

    public long getId() {
        return id;
    }

    public LocalDateTime getFechaYhora() {
        return fechaYhora;
    }

    public double getMonto() {
        return monto;
    }

    public long getProducto() {
        return producto;
    }

    public long getCliente() {
        return cliente;
    }
}

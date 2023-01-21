package com.peluqueria.lourdes.service;

import com.peluqueria.lourdes.DTOS.TicketDTO;

import java.util.List;

public interface TicketService {

    List<TicketDTO> getListTicket();

    TicketDTO getTicket(Long id);

}

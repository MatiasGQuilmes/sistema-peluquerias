package com.peluqueria.lourdes.service.implement;

import com.peluqueria.lourdes.DTOS.TicketDTO;
import com.peluqueria.lourdes.repositories.TicketRepository;
import com.peluqueria.lourdes.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TicketServiceImplement implements TicketService {

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public List<TicketDTO> getListTicket() {
        return ticketRepository.findAll().stream().map(ticket -> new TicketDTO(ticket)).collect(Collectors.toList());
    }

    @Override
    public TicketDTO getTicket(Long id) {
        return ticketRepository.findById(id).map(ticket -> new TicketDTO(ticket)).orElse(null);
    }
}

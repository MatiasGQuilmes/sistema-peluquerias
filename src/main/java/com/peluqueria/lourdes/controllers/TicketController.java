package com.peluqueria.lourdes.controllers;

import com.peluqueria.lourdes.DTOS.TicketDTO;
import com.peluqueria.lourdes.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TicketController {

    @Autowired
    TicketService ticketService;


    @GetMapping("/tickets")
    public List<TicketDTO> getTickets(){
        return ticketService.getListTicket();
    }

    @GetMapping("/tickets/{id}")
    public TicketDTO getTicket(@PathVariable Long id){
        return ticketService.getTicket(id);
    }


}

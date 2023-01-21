package com.peluqueria.lourdes.controllers;

import com.peluqueria.lourdes.DTOS.ClienteTurnoDTO;
import com.peluqueria.lourdes.service.ClienteTurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteTurnoController {

    @Autowired
    ClienteTurnoService clienteTurnoService;


    @GetMapping("/clienteTurno")
    public List<ClienteTurnoDTO> getClienteTurnos(){
        return clienteTurnoService.getListClientTurnoDTO();
    }

    @GetMapping("/clienteTurno/{id}")
    public ClienteTurnoDTO getClienteTurno(@PathVariable Long id){
        return clienteTurnoService.getClienteTurno(id);
    }


}

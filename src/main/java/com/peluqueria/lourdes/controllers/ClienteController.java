package com.peluqueria.lourdes.controllers;

import com.peluqueria.lourdes.DTOS.ClienteDTO;
import com.peluqueria.lourdes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

//    @Autowired
//    PasswordEncoder passwordEncoder;


    @GetMapping("/clients")
    public List<ClienteDTO> getListOfClientsDTO(){
        return clienteService.getClientsDTO();
    }


    @RequestMapping("/clients/{id}")
    public ClienteDTO getClient(@PathVariable Long id) {
        return clienteService.getClientDTO(id);
    }




}

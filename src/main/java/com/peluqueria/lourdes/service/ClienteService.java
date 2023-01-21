package com.peluqueria.lourdes.service;

import com.peluqueria.lourdes.DTOS.ClienteDTO;
import com.peluqueria.lourdes.models.Cliente;

import java.util.List;

public interface ClienteService {


    List<ClienteDTO> getClientsDTO();

    ClienteDTO getClientDTO(Long id);

    Cliente getClientByEmail(String email);

}

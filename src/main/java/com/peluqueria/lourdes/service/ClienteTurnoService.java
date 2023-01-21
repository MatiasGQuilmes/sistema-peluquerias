package com.peluqueria.lourdes.service;

import com.peluqueria.lourdes.DTOS.ClienteTurnoDTO;
import com.peluqueria.lourdes.models.ClienteTurno;

import java.util.List;

public interface ClienteTurnoService {

    List<ClienteTurnoDTO> getListClientTurnoDTO();

    ClienteTurnoDTO getClienteTurno(Long id);


}

package com.peluqueria.lourdes.service;

import com.peluqueria.lourdes.DTOS.TurnoDTO;

import java.util.List;

public interface TurnoService {


    List<TurnoDTO> getTurnos();

    TurnoDTO getTurno(Long id);


}

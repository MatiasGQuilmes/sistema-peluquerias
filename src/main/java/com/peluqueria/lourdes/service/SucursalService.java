package com.peluqueria.lourdes.service;

import com.peluqueria.lourdes.DTOS.SucursalDTO;

import java.util.List;

public interface SucursalService {

    List<SucursalDTO> getSucursales();

    SucursalDTO getSucursal(Long id);



}

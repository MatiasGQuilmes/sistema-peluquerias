package com.peluqueria.lourdes.service.implement;

import com.peluqueria.lourdes.DTOS.SucursalDTO;
import com.peluqueria.lourdes.repositories.SucursalRepository;
import com.peluqueria.lourdes.service.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SucursalServiceImplement implements SucursalService {

    @Autowired
    SucursalRepository sucursalRepository;


    @Override
    public List<SucursalDTO> getSucursales() {
        return sucursalRepository.findAll().stream().map(sucursal -> new SucursalDTO(sucursal)).collect(Collectors.toList());
    }

    @Override
    public SucursalDTO getSucursal(Long id) {
        return sucursalRepository.findById(id).map(sucursal -> new SucursalDTO(sucursal)).orElse(null);
    }
}

package com.peluqueria.lourdes.service.implement;

import com.peluqueria.lourdes.DTOS.ProductoDTO;
import com.peluqueria.lourdes.repositories.ProductoRepository;
import com.peluqueria.lourdes.service.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductoServicioImplement implements ProductoServicio {


    @Autowired
    ProductoRepository productoRepository;

    @Override
    public List<ProductoDTO> listProductsDTO() {
        return productoRepository.findAll().stream().map(ProductoDTO::new).collect(Collectors.toList());
    }

    @Override
    public ProductoDTO productoDTO(Long id) {
        return productoRepository.findById(id).map(producto -> new ProductoDTO(producto)).orElse(null);
    }
}

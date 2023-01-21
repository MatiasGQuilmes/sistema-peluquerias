package com.peluqueria.lourdes.repositories;

import com.peluqueria.lourdes.models.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SucursalRepository extends JpaRepository<Sucursal, Long> {
}

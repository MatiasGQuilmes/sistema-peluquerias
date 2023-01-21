package com.peluqueria.lourdes.repositories;

import com.peluqueria.lourdes.models.ClienteTurno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClienteTurnoRepository extends JpaRepository<ClienteTurno, Long> {
}

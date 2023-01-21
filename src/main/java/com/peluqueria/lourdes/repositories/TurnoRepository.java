package com.peluqueria.lourdes.repositories;

import com.peluqueria.lourdes.models.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RepositoryRestResource
public interface TurnoRepository extends JpaRepository<Turno, Long> {

}

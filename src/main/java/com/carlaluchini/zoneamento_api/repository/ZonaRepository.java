package com.carlaluchini.zoneamento_api.repository;

import com.carlaluchini.zoneamento_api.model.Zona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ZonaRepository extends JpaRepository <Zona, Long> {

    Optional<Zona> findByCodigo(String codigo);
}

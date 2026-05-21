package com.carlaluchini.zoneamento_api.repository;

import com.carlaluchini.zoneamento_api.model.UsoPermitido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsoPermitidoRepository extends JpaRepository <UsoPermitido, Long> {

}

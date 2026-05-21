package com.carlaluchini.zoneamento_api.service;

import com.carlaluchini.zoneamento_api.model.Zona;
import com.carlaluchini.zoneamento_api.repository.ZonaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ZonaService {

    private ZonaRepository zonaRepository;

    public ZonaService(ZonaRepository zonaRepository) {
        this.zonaRepository = zonaRepository;
    }

    public List<Zona> listarTodas() {
        return zonaRepository.findAll();
    }

    public Optional<Zona> buscarPorCodigo(String codigo) {
        return zonaRepository.findByCodigo(codigo);
    }

    public Zona salvar(Zona zona) {
        return zonaRepository.save(zona);
    }

    public void deletar(Long id) {
        zonaRepository.deleteById(id);
    }

}

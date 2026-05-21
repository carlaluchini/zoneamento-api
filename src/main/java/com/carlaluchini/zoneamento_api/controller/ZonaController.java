package com.carlaluchini.zoneamento_api.controller;

import com.carlaluchini.zoneamento_api.dto.ZonaDTO;
import com.carlaluchini.zoneamento_api.model.Zona;
import com.carlaluchini.zoneamento_api.service.ZonaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/zonas")
public class ZonaController {

    private final ZonaService zonaService;

    public ZonaController(ZonaService zonaService) {
        this.zonaService = zonaService;
    }

    @GetMapping
    public List<ZonaDTO> listarTodas() {
        return zonaService.listarTodas()
                .stream()
                .map(ZonaDTO::fromEntity)
                .toList();
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<ZonaDTO> buscarPorCodigo(@PathVariable String codigo) {
        return zonaService.buscarPorCodigo(codigo)
                .map(ZonaDTO::fromEntity)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ZonaDTO> salvar(@RequestBody Zona zona) {
        Zona salva = zonaService.salvar(zona);
        return ResponseEntity.ok(ZonaDTO.fromEntity(salva));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        zonaService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
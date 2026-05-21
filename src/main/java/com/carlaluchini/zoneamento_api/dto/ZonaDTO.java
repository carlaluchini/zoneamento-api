package com.carlaluchini.zoneamento_api.dto;

import com.carlaluchini.zoneamento_api.model.Zona;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;

@Getter
public class ZonaDTO {

    private String codigo;
    private String descricao;
    private BigDecimal coefAproveitamento;
    private BigDecimal taxaOcupacao;
    private BigDecimal taxaPermeabilidade;
    private BigDecimal gabarito;
    private BigDecimal recuoLateral;
    private BigDecimal recuoFrontal;
    private BigDecimal recuoFundo;
    private BigDecimal loteMinimo;
    private List<String> usosPermitidos;

    public static ZonaDTO fromEntity(Zona zona) {
        ZonaDTO dto = new ZonaDTO();
        dto.codigo = zona.getCodigo();
        dto.descricao = zona.getDescricao();
        dto.coefAproveitamento = zona.getCoefAproveitamento();
        dto.taxaOcupacao = zona.getTaxaOcupacao();
        dto.taxaPermeabilidade = zona.getTaxaPermeabilidade();
        dto.gabarito = zona.getGabarito();
        dto.recuoLateral = zona.getRecuoLateral();
        dto.recuoFrontal = zona.getRecuoFrontal();
        dto.recuoFundo = zona.getRecuoFundo();
        dto.loteMinimo = zona.getLoteMinimo();
        dto.usosPermitidos = zona.getUsosPermitidos() != null
                ? zona.getUsosPermitidos()
                .stream()
                .map(uso -> uso.getDescricao())
                .toList()
                : List.of();
        return dto;
    }


}
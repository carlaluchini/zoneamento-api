package com.carlaluchini.zoneamento_api.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "ZONA")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Zona {

    @Id
    @Column(name = "id")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_ZONA"
    )
    @SequenceGenerator(
            name = "SEQ_ZONA",
            sequenceName = "SEQ_ZONA",
            allocationSize = 1
    )
    private Long zonaId;
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

    @OneToMany(mappedBy = "zona", cascade = CascadeType.ALL)
    private List<UsoPermitido> usosPermitidos;



}

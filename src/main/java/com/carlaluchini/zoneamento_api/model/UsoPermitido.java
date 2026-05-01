package com.carlaluchini.zoneamento_api.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "USO_PERMITIDO")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class UsoPermitido {

    @Id
    @Column(name = "id")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_USO_PERMITIDO"
    )
    @SequenceGenerator(
            name = "SEQ_USO_PERMITIDO",
            sequenceName = "SEQ_USO_PERMITIDO",
            allocationSize = 1
    )
    private Long usoId;
    private String descricao;
    private String nivelIncomodidade;

    @ManyToOne
    @JoinColumn(name = "zona_id")
    private Zona zona;
}

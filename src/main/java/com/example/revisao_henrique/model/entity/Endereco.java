package com.example.revisao_henrique.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Endereco {

    @Id
    @Column(name = "id_endereco")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rua", length = 100, nullable = false)
    private String rua;

    @Column(name = "numero", nullable = false)
    private Integer numero;

    @Column(name = "complemento", length = 100, nullable = false)
    private String cidade;

    @Column(name = "estado", length = 100, nullable = false)
    private String estado;

    @Column(name = "bairro", length = 100, nullable = false)
    private String bairro;

    @Column(name = "cep", nullable = false)
    private Long cep;
}

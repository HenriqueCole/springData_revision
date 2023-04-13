package com.example.revisao_henrique.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Aluno {
    @Id
    @Column(name = "id_aluno")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_aluno", length = 100, nullable = false)
    private String nome;

    @Column(name = "email_aluno", length = 100, nullable = false)
    private String email;

    @Column(name = "telefone_aluno", length = 100, nullable = false)
    private String telefone;

    @JoinColumn(name = "id_endereco", nullable = false)
    @OneToOne
    private Endereco endereco;
}

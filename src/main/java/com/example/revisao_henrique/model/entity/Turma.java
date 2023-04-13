package com.example.revisao_henrique.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Turma {

    @Id
    @Column(name = "id_turma")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_turma", length = 100, nullable = false)
    private String nome;

    @JoinColumn(name = "id_escola", nullable = false)
    @OneToOne
    private Escola escola;

    @JoinColumn(name = "lista_de_alunos", nullable = false)
    @OneToMany
    private List<Aluno> listaDeAlunos;

}

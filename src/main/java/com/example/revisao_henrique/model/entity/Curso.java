package com.example.revisao_henrique.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Curso {

    @Id
    @Column(name = "id_curso")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_curso", length = 100, nullable = false)
    private String nome;

    @JoinColumn(name = "id_curso")
    @OneToMany
    private List<Disciplina> listaDeDisciplinas;
}

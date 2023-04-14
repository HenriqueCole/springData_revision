package com.example.revisao_henrique.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Disciplina {

    @Id
    @Column(name = "id_disciplina")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_disciplina", length = 100)
    private String nome;

    @JoinColumn(name = "id_professor")
    @ManyToMany
    @JsonIgnore
    private List<Professor> listaDeProfessores;
}

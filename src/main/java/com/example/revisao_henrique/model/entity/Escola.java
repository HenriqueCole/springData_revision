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
public class Escola {
    @Id
    @Column(name = "id_escola")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_escola", length = 100, nullable = false)
    private String nome;

    @JoinColumn(name = "id_endereco", nullable = false)
    @OneToOne
    private Endereco endereco;

    @Column(name = "email_escola", length = 100, nullable = false)
    private String email;

    @JoinColumn(name = "lista_de_professores", nullable = false)
    @OneToMany
    private List<Professor> listaDeProfessores;

    @JoinColumn(name = "lista_de_cursos", nullable = false)
    @OneToMany
    private List<Curso> listaDeCursos;
}

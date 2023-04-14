package com.example.revisao_henrique.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Professor {

    @Id
    @Column(name = "id_professor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_professor", length = 100, nullable = false)
    private String nome;

    @Column(name = "email_professor", length = 100, nullable = false)
    private String email;

    @Column(name = "telefone_professor", length = 100, nullable = false)
    private String telefone;

    @JoinColumn(name = "id_escola", nullable = false)
    @ManyToOne
    private Escola escola;

    @Column(name = "lista_de_disciplinas")
    @ManyToMany(mappedBy = "listaDeProfessores")
    private List<Disciplina> listaDeDisciplinas;

    @JoinColumn(name = "id_endereco", nullable = false)
    @OneToOne
    private Endereco endereco;

}

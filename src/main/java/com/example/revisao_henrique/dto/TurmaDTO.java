package com.example.revisao_henrique.dto;

import com.example.revisao_henrique.model.entity.Aluno;
import com.example.revisao_henrique.model.entity.Escola;

import java.util.List;

public class TurmaDTO {
    private String nome;
    private Escola escola;
    private List<Aluno> listaDeAlunos;
}

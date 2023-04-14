package com.example.revisao_henrique.dto;

import com.example.revisao_henrique.model.entity.Aluno;
import com.example.revisao_henrique.model.entity.Escola;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Data
@Validated
public class TurmaDTO {
    private String nome;
    private Escola escola;
    private List<Aluno> listaDeAlunos;
}

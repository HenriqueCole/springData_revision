package com.example.revisao_henrique.dto;

import com.example.revisao_henrique.model.entity.Disciplina;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Data
@Validated
public class CursoDTO {
    private String nome;
    private List<Disciplina> listaDeDisciplinas;
}

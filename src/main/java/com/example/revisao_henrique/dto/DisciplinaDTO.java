package com.example.revisao_henrique.dto;

import com.example.revisao_henrique.model.entity.Professor;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Data
@Validated
public class DisciplinaDTO {
    private String nome;
    private List<Professor> listaDeProfessores;
}

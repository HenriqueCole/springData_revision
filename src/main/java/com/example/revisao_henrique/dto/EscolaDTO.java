package com.example.revisao_henrique.dto;

import com.example.revisao_henrique.model.entity.Curso;
import com.example.revisao_henrique.model.entity.Endereco;
import jakarta.validation.constraints.Email;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Data
@Validated
public class EscolaDTO {
    private String nome;
    private Endereco endereco;
    @Email
    private String email;
    private List<Curso> listaDeCursos;
}

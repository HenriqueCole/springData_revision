package com.example.revisao_henrique.dto;

import com.example.revisao_henrique.model.entity.Endereco;
import com.example.revisao_henrique.model.entity.Escola;
import jakarta.validation.constraints.Email;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
public class ProfessorDTO {
    private String nome;
    @Email
    private String email;
    private String telefone;
    private Escola escola;
    private Endereco endereco;
}

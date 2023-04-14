package com.example.revisao_henrique.dto;

import com.example.revisao_henrique.model.entity.Endereco;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
public class AlunoDTO {
    private String nome;
    @Email
    private String email;
    private String telefone;
    private Endereco endereco;
}

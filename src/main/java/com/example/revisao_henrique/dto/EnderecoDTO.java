package com.example.revisao_henrique.dto;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
public class EnderecoDTO {
    private String rua;
    private Integer numero;
    private String cidade;
    private String estado;
    private String bairro;
    private Long cep;
}

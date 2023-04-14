package com.example.revisao_henrique.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
public class EnderecoDTO {
    private String rua;
    @Positive
    private Integer numero;
    private String cidade;
    private String estado;
    private String bairro;
    @Min(value = 10000000L, message = "CEP inválido")
    @Max(value = 99999999L, message = "CEP inválido")
    private Long cep;
}

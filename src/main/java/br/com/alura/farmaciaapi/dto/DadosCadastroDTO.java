package br.com.alura.farmaciaapi.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record DadosCadastroDTO(
        @NotBlank
        String nomeFabricante,
        @NotBlank
        String nomeProduto,
        @NotBlank
        String descricaoProduto,
        @Positive
        double precoProduto) {
}

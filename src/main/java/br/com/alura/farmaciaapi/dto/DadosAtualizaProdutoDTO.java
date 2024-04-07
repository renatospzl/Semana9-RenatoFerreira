package br.com.alura.farmaciaapi.dto;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizaProdutoDTO(
        @NotNull
        int id,
        String descricaoProduto,
        double precoProduto) {
}

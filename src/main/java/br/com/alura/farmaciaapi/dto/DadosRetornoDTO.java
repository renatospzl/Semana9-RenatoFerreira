package br.com.alura.farmaciaapi.dto;

import br.com.alura.farmaciaapi.model.Produto;

public record DadosRetornoDTO (String nomeFabricante, String nomeProduto, String descricaoProduto, double precoProduto){

    public DadosRetornoDTO(Produto produto){
        this(produto.getFabricante().getNome(),
                produto.getNome(),
                produto.getDescricao(),
                produto.getPreco());
    }
}

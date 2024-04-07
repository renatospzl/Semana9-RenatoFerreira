package br.com.alura.farmaciaapi.model;


import br.com.alura.farmaciaapi.dto.DadosAtualizaProdutoDTO;
import br.com.alura.farmaciaapi.dto.DadosCadastroDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="produtos")
@Entity(name="Produto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    @ManyToOne
    private Fabricante fabricante;

    public Produto(DadosCadastroDTO dadosCadastro, Fabricante fabricante) {
        this.nome = dadosCadastro.nomeProduto();
        this.descricao = dadosCadastro.descricaoProduto();
        this.preco = dadosCadastro.precoProduto();
        this.fabricante = fabricante;

    }

    public void atualizar(DadosAtualizaProdutoDTO produtoDTO) {
        if (produtoDTO.descricaoProduto() != null) {
            this.descricao = produtoDTO.descricaoProduto();
        }
        if (produtoDTO.precoProduto() > 0) {
            this.preco = produtoDTO.precoProduto();
        }
    }

}

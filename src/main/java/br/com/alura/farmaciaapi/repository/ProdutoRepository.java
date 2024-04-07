package br.com.alura.farmaciaapi.repository;

import br.com.alura.farmaciaapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}

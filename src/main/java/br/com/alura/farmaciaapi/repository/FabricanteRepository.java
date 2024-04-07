package br.com.alura.farmaciaapi.repository;

import br.com.alura.farmaciaapi.model.Fabricante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FabricanteRepository extends JpaRepository<Fabricante, Integer> {
    Fabricante findByNome(String s);
}

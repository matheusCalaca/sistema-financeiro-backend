package br.com.matheuscalaca.sistema.financeiro.repository;

import br.com.matheuscalaca.sistema.financeiro.entity.Receita;
import org.springframework.data.repository.CrudRepository;

public interface ReceitaRepository extends CrudRepository<Receita, Long> {
}

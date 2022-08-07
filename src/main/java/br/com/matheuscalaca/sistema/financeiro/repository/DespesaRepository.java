package br.com.matheuscalaca.sistema.financeiro.repository;

import br.com.matheuscalaca.sistema.financeiro.entity.Despesa;
import org.springframework.data.repository.CrudRepository;

public interface DespesaRepository extends CrudRepository<Despesa, Long> {
}

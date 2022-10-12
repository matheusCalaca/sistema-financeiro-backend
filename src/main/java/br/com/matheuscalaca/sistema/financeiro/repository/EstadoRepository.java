package br.com.matheuscalaca.sistema.financeiro.repository;

import br.com.matheuscalaca.sistema.financeiro.entity.Endereco;
import br.com.matheuscalaca.sistema.financeiro.entity.Estado;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EstadoRepository extends CrudRepository<Estado, Long> {

    List<Estado> findAll();
}

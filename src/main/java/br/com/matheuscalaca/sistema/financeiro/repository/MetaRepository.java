package br.com.matheuscalaca.sistema.financeiro.repository;

import br.com.matheuscalaca.sistema.financeiro.entity.Meta;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface MetaRepository extends CrudRepository<Meta, Long> {

    List<Meta> findByCliente_Id(Long idClient);

    Optional<Meta> findById(Long idClient);

}

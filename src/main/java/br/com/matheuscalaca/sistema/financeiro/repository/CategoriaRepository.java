package br.com.matheuscalaca.sistema.financeiro.repository;

import br.com.matheuscalaca.sistema.financeiro.entity.Categoria;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoriaRepository extends CrudRepository<Categoria, Long> {

    Categoria findCategoriaByIdIs(Long id);
}

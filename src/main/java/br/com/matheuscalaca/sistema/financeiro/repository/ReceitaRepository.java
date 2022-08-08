package br.com.matheuscalaca.sistema.financeiro.repository;

import br.com.matheuscalaca.sistema.financeiro.entity.Despesa;
import br.com.matheuscalaca.sistema.financeiro.entity.Receita;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReceitaRepository extends CrudRepository<Receita, Long> {

    @Query("select r from Receita r where r.cliente.id = :idClient and month(r.data) = :month")
    List<Receita> findByClienteIdAndMonth(@Param("idClient") Long idClient, @Param("month") int month);

}

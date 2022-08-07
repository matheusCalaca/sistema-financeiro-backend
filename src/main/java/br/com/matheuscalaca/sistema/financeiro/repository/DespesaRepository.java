package br.com.matheuscalaca.sistema.financeiro.repository;

import br.com.matheuscalaca.sistema.financeiro.entity.Despesa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DespesaRepository extends CrudRepository<Despesa, Long> {

    @Query("select d from Despesa d where d.cliente.id = :idClient and month(d.data) = :month")
    List<Despesa> findByCliente_IdAndMonth(@Param("idClient") Long idClient, @Param("month") int month);

}

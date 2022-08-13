package br.com.matheuscalaca.sistema.financeiro.service;

import br.com.matheuscalaca.sistema.financeiro.entity.dto.ReceitaDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.ReceitaInsertDto;

import java.util.List;

public interface ReceitaServiceFacade {

    ReceitaInsertDto create(ReceitaInsertDto dto);

    List<ReceitaDto> findByClientIdAndMonth(Long idCliente, Integer month);

    ReceitaDto findById(Long id);

    boolean deleteById(Long id);

    void update(ReceitaDto dto);
}

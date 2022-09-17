package br.com.matheuscalaca.sistema.financeiro.service;

import br.com.matheuscalaca.sistema.financeiro.entity.dto.DespesaDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.DespesaInsertDto;

import java.util.List;

public interface DespesaServiceFacade {
    DespesaInsertDto create(DespesaInsertDto dto, String token);

    List<DespesaDto> findByClientTokenAndMonth(String token, Integer month);

    DespesaDto findById(Long id);

    boolean deleteById(Long id);
}

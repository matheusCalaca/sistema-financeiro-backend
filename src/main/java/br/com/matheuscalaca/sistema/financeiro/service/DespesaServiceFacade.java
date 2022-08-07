package br.com.matheuscalaca.sistema.financeiro.service;

import br.com.matheuscalaca.sistema.financeiro.entity.Despesa;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.DespesaDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.DespesaInsertDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.MetaDto;

import java.util.List;

public interface DespesaServiceFacade {
    DespesaInsertDto create(DespesaInsertDto dto);

    List<DespesaDto> findByClientId(Long idCliente, Integer month);
}

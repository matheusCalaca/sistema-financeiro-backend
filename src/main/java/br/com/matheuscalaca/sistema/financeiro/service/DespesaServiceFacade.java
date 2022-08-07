package br.com.matheuscalaca.sistema.financeiro.service;

import br.com.matheuscalaca.sistema.financeiro.entity.dto.DespesaInsertDto;

public interface DespesaServiceFacade {
    DespesaInsertDto create(DespesaInsertDto dto);
}

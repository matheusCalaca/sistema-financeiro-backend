package br.com.matheuscalaca.sistema.financeiro.service;

import br.com.matheuscalaca.sistema.financeiro.entity.dto.ClienteInsertDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.MetaInsertDto;

public interface MetaServiceFacade {

    public MetaInsertDto create(MetaInsertDto dto);
}

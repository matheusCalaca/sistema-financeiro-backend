package br.com.matheuscalaca.sistema.financeiro.service;

import br.com.matheuscalaca.sistema.financeiro.entity.dto.MetaDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.MetaInsertDto;

import java.util.List;

public interface MetaServiceFacade {

    public MetaInsertDto create(MetaInsertDto dto);

    public List<MetaDto> findByClientId(Long idClient);
}

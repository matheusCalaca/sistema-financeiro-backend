package br.com.matheuscalaca.sistema.financeiro.service;

import br.com.matheuscalaca.sistema.financeiro.entity.dto.MetaDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.MetaInsertDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.ReceitaDto;

import java.util.List;

public interface MetaServiceFacade {

    MetaInsertDto create(MetaInsertDto dto);

    List<MetaDto> findByClientId(Long idClient);

    MetaDto findById(Long id);

    boolean deleteById(Long id);
}

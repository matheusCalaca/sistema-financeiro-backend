package br.com.matheuscalaca.sistema.financeiro.service;

import br.com.matheuscalaca.sistema.financeiro.entity.dto.MetaDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.MetaInsertDto;

import java.util.List;

public interface MetaServiceFacade {

    MetaInsertDto create(MetaInsertDto dto, String token);

    List<MetaDto> findByToken(String token);

    MetaDto findById(Long id);

    boolean deleteById(Long id);

    MetaDto update(MetaDto dto);
}

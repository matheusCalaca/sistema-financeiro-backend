package br.com.matheuscalaca.sistema.financeiro.service;

import br.com.matheuscalaca.sistema.financeiro.entity.dto.ReceitaDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.ReceitaInsertDto;

import java.util.List;

public interface ReceitaServiceFacade {

    ReceitaInsertDto create(ReceitaInsertDto dto, String token);

    List<ReceitaDto> findByClientTokenAndMonth(String idCliente, Integer month);

    ReceitaDto findById(Long id);

    ReceitaDto findByToken(String token);

    boolean deleteById(Long id);

    void update(ReceitaDto dto);
}

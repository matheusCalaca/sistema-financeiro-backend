package br.com.matheuscalaca.sistema.financeiro.service;

import br.com.matheuscalaca.sistema.financeiro.entity.dto.EstadoDto;

import java.util.List;

public interface EstadosServiceFacade {

    List<EstadoDto> findAll();
}

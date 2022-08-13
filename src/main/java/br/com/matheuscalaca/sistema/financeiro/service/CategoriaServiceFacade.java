package br.com.matheuscalaca.sistema.financeiro.service;

import br.com.matheuscalaca.sistema.financeiro.entity.Categoria;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.CategoriaDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.CategoriaInsertDto;

import java.util.List;

public interface CategoriaServiceFacade {
    Categoria findById(Long idCategoria);

    CategoriaInsertDto create(CategoriaInsertDto dto);

    List<CategoriaDto> findAll();
}

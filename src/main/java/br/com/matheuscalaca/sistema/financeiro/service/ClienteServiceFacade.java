package br.com.matheuscalaca.sistema.financeiro.service;

import br.com.matheuscalaca.sistema.financeiro.entity.Cliente;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.ClienteInsertDto;

public interface ClienteServiceFacade {

    ClienteInsertDto create(ClienteInsertDto dto);

    Cliente findById(Long id);
}

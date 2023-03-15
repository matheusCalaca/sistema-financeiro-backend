package br.com.matheuscalaca.sistema.financeiro.service;

import br.com.matheuscalaca.sistema.financeiro.entity.Cliente;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.ClienteInsertDto;
import br.com.matheuscalaca.sistema.financeiro.excption.AlreadyExistsException;

public interface ClienteServiceFacade {

    Cliente create(ClienteInsertDto dto) throws AlreadyExistsException;

    Cliente findById(Long id);

    Cliente findClientByToken(String token);
}

package br.com.matheuscalaca.sistema.financeiro.service;

import br.com.matheuscalaca.sistema.financeiro.config.JwtTokenUtil;
import br.com.matheuscalaca.sistema.financeiro.entity.Cliente;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.ClienteInsertDto;
import br.com.matheuscalaca.sistema.financeiro.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClienteService implements ClienteServiceFacade {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private UserServiceFacade userServiceFacade;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Override
    public ClienteInsertDto create(ClienteInsertDto dto) {

        Cliente cliente = dto.toCliente();
        clienteRepository.save(cliente);

        userServiceFacade.create(dto.getPassword(), cliente);

        return null;
    }

    @Override
    public Cliente findById(Long id) {
        return clienteRepository.findClienteByIdIs(id);
    }

    public Cliente findByEmail(String email) {
        return clienteRepository.findClienteByEmail(email);
    }

    @Override
    public Cliente findClientByToken(String token) {
        String usernameFromToken = jwtTokenUtil.getUsernameFromToken(token);
        return findByEmail(usernameFromToken);
    }

}

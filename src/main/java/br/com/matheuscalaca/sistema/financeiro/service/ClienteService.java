package br.com.matheuscalaca.sistema.financeiro.service;

import br.com.matheuscalaca.sistema.financeiro.config.JwtTokenUtil;
import br.com.matheuscalaca.sistema.financeiro.entity.Cliente;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.ClienteInsertDto;
import br.com.matheuscalaca.sistema.financeiro.excption.AlreadyExistsException;
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
    public Cliente create(ClienteInsertDto dto) throws AlreadyExistsException {
        try {
            validClient(dto);
        }catch (AlreadyExistsException ex){
            throw ex;
        }

        Cliente cliente = dto.toCliente();
        clienteRepository.save(cliente);
        userServiceFacade.create(dto.getPassword(), cliente);

        return cliente;
    }

    private void validClient(ClienteInsertDto client) throws AlreadyExistsException {

        if(findByEmail(client.getEmail()) != null){
            throw new AlreadyExistsException("email já cadastrado");
        }

        if(findByCpf(client.getCpf()) != null){
            throw new AlreadyExistsException("CPF já cadastrado");
        }

    }

    private Cliente findByCpf(String cpf) {
        return clienteRepository.findByCpf(cpf);
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

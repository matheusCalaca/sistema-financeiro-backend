package br.com.matheuscalaca.sistema.financeiro.service;

import br.com.matheuscalaca.sistema.financeiro.entity.Cliente;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserServiceFacade {

    void create(String password, Cliente cliente);

    UserDetails loadByEmail(String email, String password);

    UserDetails loadByEmail(String email);
}

package br.com.matheuscalaca.sistema.financeiro.repository;

import br.com.matheuscalaca.sistema.financeiro.entity.UserDetail;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserDetail, Long> {

    public UserDetail findByCliente_Email(String email);

}

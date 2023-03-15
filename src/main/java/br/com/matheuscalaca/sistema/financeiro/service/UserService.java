package br.com.matheuscalaca.sistema.financeiro.service;

import br.com.matheuscalaca.sistema.financeiro.entity.Cliente;
import br.com.matheuscalaca.sistema.financeiro.entity.UserDetail;
import br.com.matheuscalaca.sistema.financeiro.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class UserService implements UserServiceFacade {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void create(String password, Cliente cliente) {
        UserDetail user = new UserDetail(passwordEncoder.encode(password), cliente);

        userRepository.save(user);
    }

//    @Override
//    public UserDetails loadByEmail(String email, String senha) {
//        return new User("techgeeknext", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",
//                new ArrayList<>());
//    }

    @Override
    public UserDetails loadByEmail(String email) {
        UserDetail userDetail = userRepository.findByCliente_Email(email);
        if (userDetail != null) {
            return new User(userDetail.getCliente().getEmail(), userDetail.getPassword(),
                    new ArrayList<>());
        }
        throw new UsernameNotFoundException("User not found with email: " + email);
    }
}

package br.com.matheuscalaca.sistema.financeiro.Controller;

import br.com.matheuscalaca.sistema.financeiro.entity.Cliente;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.ClienteInsertDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.ExceptionDto;
import br.com.matheuscalaca.sistema.financeiro.excption.AlreadyExistsException;
import br.com.matheuscalaca.sistema.financeiro.service.ClienteServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("client")
public class ClientController {

    @Autowired
    private ClienteServiceFacade clienteService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public ResponseEntity createUser(@RequestBody ClienteInsertDto cliente) {
        try {
            Cliente result = clienteService.create(cliente);
            return new ResponseEntity<>(result, HttpStatus.CREATED);
        } catch (AlreadyExistsException e) {
            return new ResponseEntity<>(new ExceptionDto(HttpStatus.UNPROCESSABLE_ENTITY.value(), e.getMessage()), HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }
}

package br.com.matheuscalaca.sistema.financeiro.Controller;

import br.com.matheuscalaca.sistema.financeiro.entity.dto.ClienteInsertDto;
import br.com.matheuscalaca.sistema.financeiro.service.ClienteService;
import br.com.matheuscalaca.sistema.financeiro.service.ClienteServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("client")
public class ClientController {

    @Autowired
    private ClienteServiceFacade clienteService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public void test(@RequestBody ClienteInsertDto cliente) {
        System.out.println(clienteService.create(cliente));
    }
}

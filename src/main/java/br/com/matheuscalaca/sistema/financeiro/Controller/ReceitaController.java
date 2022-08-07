package br.com.matheuscalaca.sistema.financeiro.Controller;

import br.com.matheuscalaca.sistema.financeiro.entity.dto.MetaInsertDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.ReceitaInsertDto;
import br.com.matheuscalaca.sistema.financeiro.service.MetaServiceFacade;
import br.com.matheuscalaca.sistema.financeiro.service.ReceitaServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("receita")
public class ReceitaController {

    @Autowired
    private ReceitaServiceFacade receitaService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void test(@RequestBody ReceitaInsertDto dto) {
        System.out.println(receitaService.create(dto));
    }
}

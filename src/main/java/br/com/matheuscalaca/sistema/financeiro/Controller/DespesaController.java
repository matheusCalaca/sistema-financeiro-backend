package br.com.matheuscalaca.sistema.financeiro.Controller;

import br.com.matheuscalaca.sistema.financeiro.entity.dto.DespesaInsertDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.ReceitaInsertDto;
import br.com.matheuscalaca.sistema.financeiro.service.DespesaServiceFacade;
import br.com.matheuscalaca.sistema.financeiro.service.ReceitaServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("despesa")
public class DespesaController {

    @Autowired
    private DespesaServiceFacade despesaService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void test(@RequestBody DespesaInsertDto dto) {
        System.out.println(despesaService.create(dto));
    }
}

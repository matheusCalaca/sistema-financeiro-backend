package br.com.matheuscalaca.sistema.financeiro.Controller;

import br.com.matheuscalaca.sistema.financeiro.entity.dto.MetaInsertDto;
import br.com.matheuscalaca.sistema.financeiro.service.MetaServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("meta")
public class MetaController {

    @Autowired
    private MetaServiceFacade metaService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void test(@RequestBody MetaInsertDto dto) {
        System.out.println(metaService.create(dto));
    }
}

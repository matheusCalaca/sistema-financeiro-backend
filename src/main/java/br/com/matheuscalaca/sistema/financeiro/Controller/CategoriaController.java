package br.com.matheuscalaca.sistema.financeiro.Controller;

import br.com.matheuscalaca.sistema.financeiro.entity.dto.CategoriaInsertDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.DespesaInsertDto;
import br.com.matheuscalaca.sistema.financeiro.service.CategoriaServiceFacade;
import br.com.matheuscalaca.sistema.financeiro.service.DespesaServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("categoria")
public class CategoriaController {

    @Autowired
    private CategoriaServiceFacade categoriaService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public void test(@RequestBody CategoriaInsertDto dto) {
        System.out.println(categoriaService.create(dto));
    }
}
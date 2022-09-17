package br.com.matheuscalaca.sistema.financeiro.Controller;

import br.com.matheuscalaca.sistema.financeiro.entity.dto.CategoriaDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.CategoriaInsertDto;
import br.com.matheuscalaca.sistema.financeiro.service.CategoriaServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("categoria")
public class CategoriaController {

    @Autowired
    private CategoriaServiceFacade categoriaService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public void create(@RequestBody CategoriaInsertDto dto) {
        categoriaService.create(dto);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public List<CategoriaDto> obterCategorias() {
        List<CategoriaDto> metas = categoriaService.findAll();
        return metas;
    }
}

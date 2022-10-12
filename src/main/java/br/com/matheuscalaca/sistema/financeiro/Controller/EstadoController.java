package br.com.matheuscalaca.sistema.financeiro.Controller;

import br.com.matheuscalaca.sistema.financeiro.entity.dto.CategoriaDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.CategoriaInsertDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.EstadoDto;
import br.com.matheuscalaca.sistema.financeiro.service.CategoriaServiceFacade;
import br.com.matheuscalaca.sistema.financeiro.service.EstadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("estado")
public class EstadoController {

    @Autowired
    private EstadosService estadosService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public List<EstadoDto> obterEstados() {
        return  estadosService.findAll();
    }
}

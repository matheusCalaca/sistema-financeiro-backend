package br.com.matheuscalaca.sistema.financeiro.Controller;

import br.com.matheuscalaca.sistema.financeiro.entity.dto.*;
import br.com.matheuscalaca.sistema.financeiro.service.MetaServiceFacade;
import br.com.matheuscalaca.sistema.financeiro.service.ReceitaServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("receita")
public class ReceitaController {

    @Autowired
    private ReceitaServiceFacade receitaService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public void test(@RequestBody ReceitaInsertDto dto) {
        System.out.println(receitaService.create(dto));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public List<ReceitaDto> getDespesas(@RequestParam("idCliente") Long idCliente, @RequestParam("month") Integer month) {
        return receitaService.findByClientIdAndMonth(idCliente, month);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public ReceitaDto getReceitaById(@PathVariable("id") Long id) {
        return receitaService.findById(id);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public boolean deleteById(@PathVariable("id") Long id) {
        return receitaService.deleteById(id);
    }

}

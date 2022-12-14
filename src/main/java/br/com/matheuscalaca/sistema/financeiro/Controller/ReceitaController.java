package br.com.matheuscalaca.sistema.financeiro.Controller;

import br.com.matheuscalaca.sistema.financeiro.entity.dto.ReceitaDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.ReceitaInsertDto;
import br.com.matheuscalaca.sistema.financeiro.service.ReceitaServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("receita")
@Validated
public class ReceitaController {

    @Autowired
    private ReceitaServiceFacade receitaService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public void create(@RequestHeader(HttpHeaders.AUTHORIZATION) String token, @Valid @RequestBody ReceitaInsertDto dto) {
        receitaService.create(dto, token);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public void update(@Valid @RequestBody ReceitaDto dto) {
        receitaService.update(dto);
    }


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public List<ReceitaDto> getDespesas( @RequestParam("month") Integer month, @RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        return receitaService.findByClientTokenAndMonth(token, month);
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

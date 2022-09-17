package br.com.matheuscalaca.sistema.financeiro.Controller;

import br.com.matheuscalaca.sistema.financeiro.entity.dto.DespesaDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.DespesaInsertDto;
import br.com.matheuscalaca.sistema.financeiro.service.DespesaServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;


@RestController
@RequestMapping("despesa")
public class DespesaController {

    @Autowired
    private DespesaServiceFacade despesaService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public void create(@RequestHeader(HttpHeaders.AUTHORIZATION) String token, @RequestBody DespesaInsertDto dto) {
        despesaService.create(dto, token);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public List<DespesaDto> getDespesas(@RequestParam("idCliente") Long idCliente, @RequestParam("month") Integer month) {
        return despesaService.findByClientIdAndMonth(idCliente, month);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public DespesaDto getDespesasById(@PathVariable("id") Long id) {
        return despesaService.findById(id);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public boolean deleteById(@PathVariable("id") Long id) {
        return despesaService.deleteById(id);
    }

}

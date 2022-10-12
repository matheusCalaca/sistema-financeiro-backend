package br.com.matheuscalaca.sistema.financeiro.Controller;

import br.com.matheuscalaca.sistema.financeiro.entity.dto.MetaDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.MetaInsertDto;
import br.com.matheuscalaca.sistema.financeiro.service.MetaServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("meta")
@Validated
public class MetaController {

    @Autowired
    private MetaServiceFacade metaService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public void create(@RequestHeader(HttpHeaders.AUTHORIZATION) String token, @Valid @RequestBody MetaInsertDto dto) {
        metaService.create(dto, token);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public void update(@Valid @RequestBody MetaDto dto) {
        metaService.update(dto);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public List<MetaDto> obterMetasPorIdCliente(@RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        List<MetaDto> metas = metaService.findByToken(token);
        System.out.println(metas);
        return metas;
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public MetaDto getMetaById(@PathVariable("id") Long id) {
        return metaService.findById(id);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public boolean deleteById(@PathVariable("id") Long id) {
        return metaService.deleteById(id);
    }

}

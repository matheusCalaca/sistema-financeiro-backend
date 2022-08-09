package br.com.matheuscalaca.sistema.financeiro.Controller;

import br.com.matheuscalaca.sistema.financeiro.entity.dto.DespesaDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.MetaDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.MetaInsertDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.ReceitaDto;
import br.com.matheuscalaca.sistema.financeiro.service.MetaServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("meta")
public class MetaController {

    @Autowired
    private MetaServiceFacade metaService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public void test(@RequestBody MetaInsertDto dto) {
        System.out.println(metaService.create(dto));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public List<MetaDto> test(@RequestParam("idCliente") Long idCliente) {
        List<MetaDto> metas = metaService.findByClientId(idCliente);
        System.out.println(metas);
        return metas;
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public MetaDto getMetaById(@PathVariable("id") Long id) {
        return metaService.findById(id);
    }
}

package br.com.matheuscalaca.sistema.financeiro.service;

import br.com.matheuscalaca.sistema.financeiro.entity.Meta;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.MetaInsertDto;
import br.com.matheuscalaca.sistema.financeiro.repository.ClienteRepository;
import br.com.matheuscalaca.sistema.financeiro.repository.MetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetaService implements MetaServiceFacade {

    @Autowired
    private MetaRepository metaRepository;

    @Autowired
    private ClienteServiceFacade clienteService;

    @Override
    public MetaInsertDto create(MetaInsertDto dto) {
        //todo: convert
        Meta meta = dto.toMeta();
        meta.setCliente(clienteService.findById(dto.getIdCliente()));
        //todo: insert

        metaRepository.save(meta);

        //todo: return
        return null;
    }
}

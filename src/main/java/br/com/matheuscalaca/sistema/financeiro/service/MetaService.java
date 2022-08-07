package br.com.matheuscalaca.sistema.financeiro.service;

import br.com.matheuscalaca.sistema.financeiro.entity.Meta;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.MetaDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.MetaInsertDto;
import br.com.matheuscalaca.sistema.financeiro.repository.ClienteRepository;
import br.com.matheuscalaca.sistema.financeiro.repository.MetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<MetaDto> findByClientId(Long idClient) {
        List<Meta> metas = metaRepository.findByCliente_Id(idClient);

        List<MetaDto> metasDto = metas.stream().map(meta -> new MetaDto(meta.getId(), meta.getTitulo(), meta.getData(), meta.getValor(), meta.getDescricao())).collect(Collectors.toList());

        return metasDto;
    }
}

package br.com.matheuscalaca.sistema.financeiro.service;

import br.com.matheuscalaca.sistema.financeiro.entity.Meta;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.MetaDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.MetaInsertDto;
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
    public MetaInsertDto create(MetaInsertDto dto, String token) {
        Meta meta = dto.toMeta();
        meta.setCliente(clienteService.findClientByToken(token));
        metaRepository.save(meta);
        return null;
    }

    @Override
    public List<MetaDto> findByClientId(Long idClient) {
        List<Meta> metas = metaRepository.findByCliente_Id(idClient);

        List<MetaDto> metasDto = metas.stream().map(meta -> new MetaDto(meta.getId(), meta.getTitulo(), meta.getData(), meta.getValor(), meta.getDescricao())).collect(Collectors.toList());

        return metasDto;
    }

    @Override
    public MetaDto findById(Long id) {
        MetaDto metaDto = metaRepository.findById(id).map(meta -> new MetaDto(meta.getId(), meta.getTitulo(), meta.getData(), meta.getValor(), meta.getDescricao())).get();

        return metaDto;
    }

    @Override
    public boolean deleteById(Long id) {
        try {
            metaRepository.deleteById(id);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Override
    public MetaDto update(MetaDto dto) {
        Long id = dto.getId();
        Meta meta = metaRepository.findById(id).get();

        meta.setTitulo(dto.getTitulo());
        meta.setData(dto.getData());
        meta.setValor(dto.getValor());
        meta.setDescricao(dto.getDescricao());

        metaRepository.save(meta);
        return null;
    }
}

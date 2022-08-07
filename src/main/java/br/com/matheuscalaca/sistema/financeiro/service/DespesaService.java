package br.com.matheuscalaca.sistema.financeiro.service;

import br.com.matheuscalaca.sistema.financeiro.entity.Despesa;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.DespesaDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.DespesaInsertDto;
import br.com.matheuscalaca.sistema.financeiro.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DespesaService implements DespesaServiceFacade {

    @Autowired
    private DespesaRepository despesaRepository;

    @Autowired
    private ClienteServiceFacade clienteService;

    @Autowired
    private CategoriaServiceFacade categoriaService;

    @Override
    public DespesaInsertDto create(DespesaInsertDto dto) {
        //todo: convert
        Despesa despesa = dto.toDespesa();
        despesa.setCliente(clienteService.findById(dto.getIdCliente()));
        despesa.setCategoria(categoriaService.findById(dto.getIdCategoria()));
        //todo: insert

        despesaRepository.save(despesa);

        //todo: return
        return null;
    }

    @Override
    public List<DespesaDto> findByClientId(Long idCliente, Integer month) {
        List<Despesa> despesas = despesaRepository.findByCliente_IdAndMonth(idCliente, month);

        List<DespesaDto> despesaDtos = despesas.stream().map(despesa -> new DespesaDto(despesa.getId(), despesa.getNome(), despesa.getOnde(), despesa.getPorQue(), despesa.getValor(), despesa.getData(), despesa.getMeioDePagamento().getNome(), despesa.getCategoria().getNome())).collect(Collectors.toList());

        return despesaDtos;
    }
}

package br.com.matheuscalaca.sistema.financeiro.service;

import br.com.matheuscalaca.sistema.financeiro.entity.Cliente;
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
    public DespesaInsertDto create(DespesaInsertDto dto, String token) {
        //todo: convert
        Despesa despesa = dto.toDespesa();
        despesa.setCliente(clienteService.findClientByToken(token));
        despesa.setCategoria(categoriaService.findById(dto.getIdCategoria()));
        //todo: insert

        despesaRepository.save(despesa);

        //todo: return
        return null;
    }

    @Override
    public List<DespesaDto> findByClientTokenAndMonth(String token, Integer month) {
        Cliente client = clienteService.findClientByToken(token);
        List<Despesa> despesas = despesaRepository.findByCliente_IdAndMonth(client.getId(), month);

        List<DespesaDto> despesaDtos = despesas.stream().map(despesa -> new DespesaDto(despesa.getId(), despesa.getNome(), despesa.getOnde(), despesa.getPorQue(), despesa.getValor(), despesa.getData(), despesa.getMeioDePagamento(), despesa.getCategoria().getNome())).collect(Collectors.toList());

        return despesaDtos;
    }

    @Override
    public DespesaDto findById(Long id) {
        DespesaDto despesaDto = despesaRepository.findById(id).map(despesa -> new DespesaDto(despesa.getId(), despesa.getNome(), despesa.getOnde(), despesa.getPorQue(), despesa.getValor(), despesa.getData(), despesa.getMeioDePagamento(), despesa.getCategoria().getNome())).get();

        return despesaDto;
    }

    @Override
    public boolean deleteById(Long id) {
        try {
            despesaRepository.deleteById(id);
            return true;
        }catch (Exception ex){
            return false;
        }
    }
}

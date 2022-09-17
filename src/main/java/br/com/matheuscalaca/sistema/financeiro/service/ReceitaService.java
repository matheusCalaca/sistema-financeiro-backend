package br.com.matheuscalaca.sistema.financeiro.service;

import br.com.matheuscalaca.sistema.financeiro.entity.Meta;
import br.com.matheuscalaca.sistema.financeiro.entity.Receita;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.MetaInsertDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.ReceitaDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.ReceitaInsertDto;
import br.com.matheuscalaca.sistema.financeiro.repository.MetaRepository;
import br.com.matheuscalaca.sistema.financeiro.repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ReceitaService implements ReceitaServiceFacade {

    @Autowired
    private ReceitaRepository receitaRepository;

    @Autowired
    private ClienteServiceFacade clienteService;

    @Override
    public ReceitaInsertDto create(ReceitaInsertDto dto, String token) {
        Receita receita = dto.toReceita();
        receita.setCliente(clienteService.findClientByToken(token));
        receitaRepository.save(receita);
        return null;
    }

    @Override
    public List<ReceitaDto> findByClientIdAndMonth(Long idCliente, Integer month) {
        List<Receita> receitas = receitaRepository.findByClienteIdAndMonth(idCliente, month);

        List<ReceitaDto> receitasDto = receitas.stream().map(receita -> new ReceitaDto(receita.getId(), receita.getNome(), receita.getData(), receita.getValor(), receita.getDescricao())).collect(Collectors.toList());

        return receitasDto;
    }

    @Override
    public ReceitaDto findById(Long id) {
        ReceitaDto receitaDto = receitaRepository.findById(id).map(receita -> new ReceitaDto(receita.getId(), receita.getNome(), receita.getData(), receita.getValor(), receita.getDescricao())).get();
        return receitaDto;
    }

    @Override
    public boolean deleteById(Long id) {
        try {
            receitaRepository.deleteById(id);
            return true;
        }catch (Exception ex){
            return false;
        }
    }

    @Override
    public void update(ReceitaDto dto) {
        Receita receita = receitaRepository.findById(dto.getId()).get();

        receita.setNome(dto.getNome());
        receita.setData(dto.getData());
        receita.setValor(dto.getValor());
        receita.setDescricao(dto.getDescricao());

        receitaRepository.save(receita);
    }
}

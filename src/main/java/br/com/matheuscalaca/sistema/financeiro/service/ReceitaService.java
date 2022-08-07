package br.com.matheuscalaca.sistema.financeiro.service;

import br.com.matheuscalaca.sistema.financeiro.entity.Meta;
import br.com.matheuscalaca.sistema.financeiro.entity.Receita;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.MetaInsertDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.ReceitaInsertDto;
import br.com.matheuscalaca.sistema.financeiro.repository.MetaRepository;
import br.com.matheuscalaca.sistema.financeiro.repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReceitaService implements ReceitaServiceFacade {

    @Autowired
    private ReceitaRepository receitaRepository;

    @Autowired
    private ClienteServiceFacade clienteService;

    @Override
    public ReceitaInsertDto create(ReceitaInsertDto dto) {
        //todo: convert
        Receita receita = dto.toReceita();
        receita.setCliente(clienteService.findById(dto.getIdCliente()));
        //todo: insert

        receitaRepository.save(receita);

        //todo: return
        return null;
    }
}
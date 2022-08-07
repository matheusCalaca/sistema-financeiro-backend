package br.com.matheuscalaca.sistema.financeiro.service;

import br.com.matheuscalaca.sistema.financeiro.entity.Despesa;
import br.com.matheuscalaca.sistema.financeiro.entity.Receita;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.DespesaInsertDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.ReceitaInsertDto;
import br.com.matheuscalaca.sistema.financeiro.repository.DespesaRepository;
import br.com.matheuscalaca.sistema.financeiro.repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
}

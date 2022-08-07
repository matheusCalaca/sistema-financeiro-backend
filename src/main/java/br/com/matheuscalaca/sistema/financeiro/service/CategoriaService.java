package br.com.matheuscalaca.sistema.financeiro.service;

import br.com.matheuscalaca.sistema.financeiro.entity.Categoria;
import br.com.matheuscalaca.sistema.financeiro.entity.Cliente;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.CategoriaInsertDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.ClienteInsertDto;
import br.com.matheuscalaca.sistema.financeiro.repository.CategoriaRepository;
import br.com.matheuscalaca.sistema.financeiro.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CategoriaService implements CategoriaServiceFacade {

    @Autowired
    private CategoriaRepository categoriaRepository;


    @Override
    public Categoria findById(Long id) {
        return categoriaRepository.findCategoriaByIdIs(id);
    }

    @Override
    public CategoriaInsertDto create(CategoriaInsertDto dto) {
        Categoria categoria = dto.toCategoria();

        categoriaRepository.save(categoria);
        return null;
    }

}

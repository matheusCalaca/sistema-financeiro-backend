package br.com.matheuscalaca.sistema.financeiro.service;

import br.com.matheuscalaca.sistema.financeiro.entity.Categoria;
import br.com.matheuscalaca.sistema.financeiro.entity.Cliente;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.CategoriaDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.CategoriaInsertDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.ClienteInsertDto;
import br.com.matheuscalaca.sistema.financeiro.repository.CategoriaRepository;
import br.com.matheuscalaca.sistema.financeiro.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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

    @Override
    public List<CategoriaDto> findAll() {
        Iterable<Categoria> all = categoriaRepository.findAll();
        List<CategoriaDto> categoriaDtos = StreamSupport.stream(all.spliterator(), false)
                .map(categoria -> new CategoriaDto(categoria.getId(), categoria.getNome()))
                .collect(Collectors.toList());
        return categoriaDtos;
    }

}

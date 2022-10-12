package br.com.matheuscalaca.sistema.financeiro.service;

import br.com.matheuscalaca.sistema.financeiro.entity.Categoria;
import br.com.matheuscalaca.sistema.financeiro.entity.Estado;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.CategoriaDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.CategoriaInsertDto;
import br.com.matheuscalaca.sistema.financeiro.entity.dto.EstadoDto;
import br.com.matheuscalaca.sistema.financeiro.repository.CategoriaRepository;
import br.com.matheuscalaca.sistema.financeiro.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class EstadosService implements EstadosServiceFacade {

    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    public List<EstadoDto> findAll() {
        List<Estado> all = estadoRepository.findAll();
        List<EstadoDto> estadoDtos = all.stream()
                .map(estado -> new EstadoDto(estado.getUf()))
                .collect(Collectors.toList());
        return estadoDtos;
    }

}

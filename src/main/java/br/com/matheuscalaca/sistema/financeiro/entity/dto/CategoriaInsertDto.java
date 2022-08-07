package br.com.matheuscalaca.sistema.financeiro.entity.dto;

import br.com.matheuscalaca.sistema.financeiro.entity.Categoria;

public class CategoriaInsertDto {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "CategoriaInsertDto{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Categoria toCategoria() {
        return new Categoria(this.nome);
    }
}

package br.com.matheuscalaca.sistema.financeiro.entity.dto;

import java.math.BigDecimal;
import java.util.Date;

public class ReceitaDto {

    private Long id;

    private String nome;

    private Date data;

    private BigDecimal valor;

    private  String descricao;

    public ReceitaDto(Long id, String nome, Date data, BigDecimal valor, String descricao) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.valor = valor;
        this.descricao = descricao;
    }

    public ReceitaDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

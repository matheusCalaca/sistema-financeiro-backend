package br.com.matheuscalaca.sistema.financeiro.entity.dto;

import br.com.matheuscalaca.sistema.financeiro.entity.Receita;

import java.math.BigDecimal;
import java.util.Date;

public class ReceitaInsertDto {

    private String nome;

    private Date data;

    private BigDecimal valor;

    private  String descricao;

    private Long idCliente;

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

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Receita toReceita() {
        return new Receita(this.nome, this.data, this.valor, this.descricao);
    }
}

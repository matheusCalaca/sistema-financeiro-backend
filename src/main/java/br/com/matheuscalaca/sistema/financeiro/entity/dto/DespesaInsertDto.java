package br.com.matheuscalaca.sistema.financeiro.entity.dto;

import br.com.matheuscalaca.sistema.financeiro.entity.Despesa;
import br.com.matheuscalaca.sistema.financeiro.entity.enums.MeioDePagamento;

import javax.persistence.Enumerated;
import java.math.BigDecimal;
import java.util.Date;

public class DespesaInsertDto {

    private String nome;

    private String onde;

    private String porque;

    private BigDecimal valor;

    private Date data;

    @Enumerated
    private MeioDePagamento meioDePagamento;

    private Long idCategoria;

    private Long idCliente;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOnde() {
        return onde;
    }

    public void setOnde(String onde) {
        this.onde = onde;
    }

    public String getPorque() {
        return porque;
    }

    public void setPorque(String porque) {
        this.porque = porque;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public MeioDePagamento getMeioDePagamento() {
        return meioDePagamento;
    }

    public void setMeioDePagamento(MeioDePagamento meioDePagamento) {
        this.meioDePagamento = meioDePagamento;
    }

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "DespesaInsertDto{" +
                "nome='" + nome + '\'' +
                ", onde='" + onde + '\'' +
                ", porQue='" + porque + '\'' +
                ", valor=" + valor +
                ", data=" + data +
                ", meioDePagamento=" + meioDePagamento +
                ", idCategoria=" + idCategoria +
                ", idCliente=" + idCliente +
                '}';
    }

    public Despesa toDespesa() {
        return new Despesa(this.nome, this.onde, this.porque, this.valor, this.data, this.meioDePagamento);
    }
}
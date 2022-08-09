package br.com.matheuscalaca.sistema.financeiro.entity.dto;

import br.com.matheuscalaca.sistema.financeiro.entity.Despesa;
import br.com.matheuscalaca.sistema.financeiro.entity.enums.MeioDePagamento;

import javax.persistence.Enumerated;
import java.math.BigDecimal;
import java.util.Date;

public class DespesaUpdateDto {

    private Long id;
    private String nome;

    private String onde;

    private String porQue;

    private BigDecimal valor;

    private Date data;

    @Enumerated
    private MeioDePagamento meioDePagamento;

    private Long idCategoria;

    public DespesaUpdateDto() {
    }

    public DespesaUpdateDto(Long id, String nome, String onde, String porQue, BigDecimal valor, Date data, MeioDePagamento meioDePagamento) {
        this.id = id;
        this.nome = nome;
        this.onde = onde;
        this.porQue = porQue;
        this.valor = valor;
        this.data = data;
        this.meioDePagamento = meioDePagamento;
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

    public String getOnde() {
        return onde;
    }

    public void setOnde(String onde) {
        this.onde = onde;
    }

    public String getPorQue() {
        return porQue;
    }

    public void setPorQue(String porQue) {
        this.porQue = porQue;
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

    @Override
    public String toString() {
        return "DespesaUpdateDto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", onde='" + onde + '\'' +
                ", porQue='" + porQue + '\'' +
                ", valor=" + valor +
                ", data=" + data +
                ", meioDePagamento=" + meioDePagamento +
                ", idCategoria=" + idCategoria +
                '}';
    }


}

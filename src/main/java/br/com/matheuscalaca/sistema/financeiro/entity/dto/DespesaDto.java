package br.com.matheuscalaca.sistema.financeiro.entity.dto;

import java.math.BigDecimal;
import java.util.Date;

public class DespesaDto {

    private Long id;

    private String nome;

    private String onde;

    private String porque;

    private BigDecimal valor;

    private Date data;

    private String meioPagamento;

    private String categoria;

    public DespesaDto(Long id, String nome, String onde, String porque, BigDecimal valor, Date data, String meioPagamento, String categoria) {
        this.id = id;
        this.nome = nome;
        this.onde = onde;
        this.porque = porque;
        this.valor = valor;
        this.data = data;
        this.meioPagamento = meioPagamento;
        this.categoria = categoria;
    }

    public DespesaDto() {
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

    public String getMeioPagamento() {
        return meioPagamento;
    }

    public void setMeioPagamento(String meioPagamento) {
        this.meioPagamento = meioPagamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "DespesaDto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", onde='" + onde + '\'' +
                ", porque='" + porque + '\'' +
                ", valor=" + valor +
                ", data=" + data +
                ", meioPagamento='" + meioPagamento + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}

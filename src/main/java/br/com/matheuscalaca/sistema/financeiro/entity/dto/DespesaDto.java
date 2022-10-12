package br.com.matheuscalaca.sistema.financeiro.entity.dto;

import br.com.matheuscalaca.sistema.financeiro.entity.enums.MeioDePagamento;

import java.math.BigDecimal;
import java.util.Date;

public class DespesaDto {

    private Long id;

    private String nome;

    private String onde;

    private String porque;

    private BigDecimal valor;

    private Date data;

    private MeioDePagamento meioDePagamento;

    private String categoria;

    private  Long idCategoria;

    public DespesaDto(Long id, String nome, String onde, String porque, BigDecimal valor, Date data, MeioDePagamento meioDePagamento, String categoria, Long idCategoria) {
        this.id = id;
        this.nome = nome;
        this.onde = onde;
        this.porque = porque;
        this.valor = valor;
        this.data = data;
        this.meioDePagamento = meioDePagamento;
        this.categoria = categoria;
        this.idCategoria = idCategoria;
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

    public MeioDePagamento getMeioDePagamento() {
        return meioDePagamento;
    }

    public void setMeioDePagamento(MeioDePagamento meioDePagamento) {
        this.meioDePagamento = meioDePagamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
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
                ", meioPagamento='" + meioDePagamento + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}

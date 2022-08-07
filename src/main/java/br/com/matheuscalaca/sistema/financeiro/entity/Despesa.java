package br.com.matheuscalaca.sistema.financeiro.entity;

import br.com.matheuscalaca.sistema.financeiro.entity.enums.MeioDePagamento;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Despesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String onde;

    private String porQue;

    private BigDecimal valor;

    private Date data;

    private MeioDePagamento meioDePagamento;

    @ManyToOne
    @JoinColumn(name = "ID_CATEGORIA", referencedColumnName = "ID", nullable = false)
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE", referencedColumnName = "ID", nullable = false)
    private Cliente cliente;

    public Despesa(String nome, String onde, String porQue, BigDecimal valor, Date data, MeioDePagamento meioDePagamento) {
        this.nome = nome;
        this.onde = onde;
        this.porQue = porQue;
        this.valor = valor;
        this.data = data;
        this.meioDePagamento = meioDePagamento;
    }

    public Despesa() {
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Despesa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", onde='" + onde + '\'' +
                ", porQue='" + porQue + '\'' +
                ", valor=" + valor +
                ", data=" + data +
                ", meioDePagamento=" + meioDePagamento +
                ", categoria=" + categoria +
                ", cliente=" + cliente +
                '}';
    }
}

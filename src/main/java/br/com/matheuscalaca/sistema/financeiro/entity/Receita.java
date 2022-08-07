package br.com.matheuscalaca.sistema.financeiro.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Receita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Date data;

    private BigDecimal valor;

    private  String descricao;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE", referencedColumnName = "ID", nullable = false)
    private Cliente cliente;

    public Receita() {
    }

    public Receita(String nome, Date data, BigDecimal valor, String descricao) {
        this.nome = nome;
        this.data = data;
        this.valor = valor;
        this.descricao = descricao;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Receita{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", data=" + data +
                ", valor=" + valor +
                ", descricao='" + descricao + '\'' +
                ", cliente=" + cliente +
                '}';
    }
}

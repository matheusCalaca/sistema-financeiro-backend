package br.com.matheuscalaca.sistema.financeiro.entity.dto;

import br.com.matheuscalaca.sistema.financeiro.entity.Cliente;
import br.com.matheuscalaca.sistema.financeiro.entity.Meta;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.Date;

public class MetaInsertDto {

    private String titulo;

    private Date data;

    private BigDecimal valor;

    private  String descricao;

    private Long idCliente;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public Meta toMeta() {
        return new Meta(this.titulo, this.data, this.valor, this.descricao);
    }

    @Override
    public String toString() {
        return "MetaInsertDto{" +
                "titulo='" + titulo + '\'' +
                ", data=" + data +
                ", valor=" + valor +
                ", descricao='" + descricao + '\'' +
                ", idCliente=" + idCliente +
                '}';
    }
}

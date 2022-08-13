package br.com.matheuscalaca.sistema.financeiro.entity.dto;

import br.com.matheuscalaca.sistema.financeiro.entity.Meta;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

public class MetaDto {

    private Long id;

    @NotEmpty
    private String titulo;

    @NotNull
    private Date data;

    @NotNull
    private BigDecimal valor;

    private String descricao;

    public MetaDto(Long id, String titulo, Date data, BigDecimal valor, String descricao) {
        this.id = id;
        this.titulo = titulo;
        this.data = data;
        this.valor = valor;
        this.descricao = descricao;
    }

    public MetaDto() {
    }

    public Meta toMeta() {
        return new Meta(this.id, this.titulo, this.data, this.valor, this.descricao);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "MetaDto{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", data=" + data +
                ", valor=" + valor +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}

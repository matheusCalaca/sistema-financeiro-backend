package br.com.matheuscalaca.sistema.financeiro.entity;

import com.sun.istack.NotNull;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Valid
public class Meta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank(message = "Titulo não pode estar vazio")
    private String titulo;

    @NotNull
    private Date data;

    @NotNull
    private BigDecimal valor;

    private  String descricao;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE", referencedColumnName = "ID", nullable = false)
    private Cliente cliente;

    public Meta() {
    }

    public Meta(String titulo, Date data, BigDecimal valor, String descricao) {
        this.titulo = titulo;
        this.data = data;
        this.valor = valor;
        this.descricao = descricao;
    }

    public Meta(Long id, String titulo, Date data, BigDecimal valor, String descricao) {
        this.id = id;
        this.titulo = titulo;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Meta{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", data=" + data +
                ", valor=" + valor +
                ", descricao='" + descricao + '\'' +
                ", cliente=" + cliente +
                '}';
    }
}

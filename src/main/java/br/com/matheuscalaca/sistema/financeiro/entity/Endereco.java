package br.com.matheuscalaca.sistema.financeiro.entity;

import javax.persistence.*;

@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cep;

    private String logradouro;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_ESTADO", referencedColumnName = "ID")
    private Estado estado;

    private String cidade;

    private String complemento;

    public Endereco() {
    }

    public Endereco(String cep, String logradouro, Estado estado, String cidade, String complemento) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.estado = estado;
        this.cidade = cidade;
        this.complemento = complemento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", estado=" + estado +
                ", cidade='" + cidade + '\'' +
                ", complemento='" + complemento + '\'' +
                '}';
    }
}

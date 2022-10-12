package br.com.matheuscalaca.sistema.financeiro.entity;

import javax.persistence.*;

@Entity
public class UserDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_CLIENTE", referencedColumnName = "ID")
    private Cliente cliente;

    public UserDetail() {
    }

    public UserDetail(String password, Cliente cliente) {
        setPassword(password);
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "UserDetail{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", cliente=" + cliente +
                '}';
    }
}

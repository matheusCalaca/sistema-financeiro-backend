package br.com.matheuscalaca.sistema.financeiro.entity.dto;

import br.com.matheuscalaca.sistema.financeiro.entity.Cliente;

public class ClienteInsertDto {

    private String cpf;

    private String name;

    private String email;

    private EnderecoInsertDto endereco;

    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EnderecoInsertDto getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoInsertDto endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Cliente toCliente(){
        return new Cliente(this.cpf, this.name, this.email, this.endereco.toEndereco());
    }
}

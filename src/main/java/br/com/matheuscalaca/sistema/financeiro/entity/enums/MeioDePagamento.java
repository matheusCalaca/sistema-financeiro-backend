package br.com.matheuscalaca.sistema.financeiro.entity.enums;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;

public enum MeioDePagamento {
    CREDITO(1, "Catão de Credito"),
    DEBITO(2, "Catão de Debito"),
    BOLETO(3, "Boleto"),
    DINHEIRO(4, "Dinheiro"),
    PIX(5, "PIX");

    private int id;
    private String nome;

    MeioDePagamento(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

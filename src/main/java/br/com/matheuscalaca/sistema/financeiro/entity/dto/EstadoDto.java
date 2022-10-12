package br.com.matheuscalaca.sistema.financeiro.entity.dto;

import br.com.matheuscalaca.sistema.financeiro.entity.Estado;

public class EstadoDto {
    private String uf;

    public EstadoDto(String uf) {
        this.uf = uf;
    }

    public EstadoDto() {
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Estado toEstado() {
        return new Estado(this.uf);
    }
}

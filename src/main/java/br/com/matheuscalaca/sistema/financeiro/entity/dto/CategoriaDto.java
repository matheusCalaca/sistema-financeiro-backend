package br.com.matheuscalaca.sistema.financeiro.entity.dto;

public class CategoriaDto {

    private Long value;

    private String name;

    public CategoriaDto() {
    }

    public CategoriaDto(Long value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "CategoriaDto{" +
                "id=" + value +
                ", nome='" + name + '\'' +
                '}';
    }
}

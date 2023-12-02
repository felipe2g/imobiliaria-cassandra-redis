package com.imobiliaria.cassandraredis.Entities;

import java.util.Objects;

public class Imovel {
    private String id;

    private String endereco;

    private String tipoImovel;

    private Double area;

    private Double preco;

    public Imovel() {
    }

    public Imovel(String id, String endereco, String tipoImovel, Double area, Double preco) {
        this.id = id;
        this.endereco = endereco;
        this.tipoImovel = tipoImovel;
        this.area = area;
        this.preco = preco;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(String tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Imovel imovel = (Imovel) o;
        return Objects.equals(id, imovel.id) && Objects.equals(endereco, imovel.endereco) && Objects.equals(tipoImovel, imovel.tipoImovel) && Objects.equals(area, imovel.area) && Objects.equals(preco, imovel.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, endereco, tipoImovel, area, preco);
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "id='" + id + '\'' +
                ", endereco='" + endereco + '\'' +
                ", tipoImovel='" + tipoImovel + '\'' +
                ", area=" + area +
                ", preco=" + preco +
                '}';
    }
}

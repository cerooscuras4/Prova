package br.com.bandtec.prova;

import java.util.List;

public abstract class GameStore implements Lancamento {


private String descricao;
private Double preco;
private String tipo;

    public GameStore(String descricao, Double preco, String tipo) {
        this.descricao = descricao;
        this.preco = preco;
        this.tipo = tipo;
    }

    public GameStore() {

    }


    @Override
    public String toString() {
        return "GameStore{" +
                "descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", tipo='" + tipo + '\'' +
                "} " + super.toString();
    }

    public String getNome() {
        return descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public String getTipo() {
        return tipo;
    }








}

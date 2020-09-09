package br.com.bandtec.prova;

public abstract class GameStore implements Lancamento {


private String descricao;
private Double preco;
private String tipo;



    public GameStore(String descricao, Double preco, String tipo) {
        this.descricao = descricao;
        this.preco = preco;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "GameStore{" +
                "nome='" + descricao + '\'' +
                ", tipo='" + tipo + '\'' +
                ", preco=" + String.format("R$ %.2f",preco)+
                '}';
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

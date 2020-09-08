package br.com.bandtec.prova;

import java.util.List;

public class Indie extends GameStoreController{


private String estudio;

    public Indie(String nome, Double preco, String tipo, List<Lancamento> lancamentos, String estudio) {
        super(nome, preco, tipo, lancamentos);
        this.estudio = estudio;
    }

    @Override
    public Double getValorLancado() {
        return getPreco() * 0.30;
    }


    @Override
    public String toString() {
        return "Indie{" +
                "estudio='" + estudio + '\'' +
                ", taxa=" + String.format("R$ %.2f",getValorLancado())+
                "} " + super.toString();
    }
}

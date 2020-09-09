package br.com.bandtec.prova;

import java.util.List;

public class Indie extends GameStore{


private String estudio;

    public Indie(String descricao, Double preco, String tipo, String estudio) {
        super(descricao, preco, tipo);
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

    public String getEstudio() {
        return estudio;
    }
}

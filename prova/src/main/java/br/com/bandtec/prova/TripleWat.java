package br.com.bandtec.prova;

import java.util.List;

public class TripleWat extends GameStore {


    private String empresa;

    public TripleWat(String descricao, Double preco, String tipo, String empresa) {
        super(descricao, preco, tipo);
        this.empresa = empresa;
    }

    @Override
        public String toString() {
            return "TripleWat{" +
                    "estudio='" + empresa + '\'' +
                    ", taxa=" + String.format("R$ %.2f",getValorLancado())+
                    "} " + super.toString();
        }

    @Override
    public Double getValorLancado() {
        return getPreco() * 0.50;
    }
}
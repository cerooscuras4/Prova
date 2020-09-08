package br.com.bandtec.prova;

import java.util.List;

public class TripleWat extends GameStoreController {


    private String empresa;



    public TripleWat(String nome, Double preco, String tipo, List<Lancamento> lancamentos, String empresa) {
        super(nome, preco, tipo, lancamentos);
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
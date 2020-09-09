package br.com.bandtec.prova;

public class TestaLancamento {



    public static void main(String[] args) {

        Indie PlayGold = new Indie("Um RPG do estilo tradicional ",60.00,"RPG","RetroEstudio");
        TripleWat Zelda  = new TripleWat("A maior aventura do mundo dos games ",250.00,"Aventura","Nintendo");

        LancamentoController lanca = new LancamentoController();

        lanca.adicionaLancamento(PlayGold);
        lanca.adicionaLancamento(Zelda);
    }


    }


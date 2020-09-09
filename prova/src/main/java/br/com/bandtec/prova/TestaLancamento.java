package br.com.bandtec.prova;

public class TestaLancamento {



    public static void main(String[] args) {

        Indie PlayGold = new Indie("Um RPG do estilo tradicional ",60.00,"RPG","RetroEstudio");
        TripleWat Zelda  = new TripleWat("A maior aventura do mundo dos games ",250.00,"Aventura","Nintendo");



        System.out.println(PlayGold);
        System.out.println(Zelda);




        LancamentoController lanca = new LancamentoController();

        lanca.adicionaLancamento(PlayGold);
        lanca.adicionaLancamento(Zelda);

        System.out.println("Total de impostos nos jogos: " +
                String.format("R$ %.2f",lanca.calculaTotalLancamento()));

    }


    }


package br.com.bandtec.prova;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/lancamentos")
public class LancamentoController {


   private List<GameStore> lista;

    public LancamentoController() {
        lista = new ArrayList<GameStore>();
    }

   public List<GameStore> lista2= new ArrayList<>();

    public List<Lancamento> lista1= new ArrayList<>();




    public void adicionaGameStore(GameStore l) { lista.add(l); }


    @GetMapping
    public ResponseEntity getListar() {
        if (lista.isEmpty()){
            return ResponseEntity.status(404).build();

        }else {
            return ResponseEntity.ok(lista);
        }

    }
    @GetMapping("/{id}")
    public GameStore getLista(@PathVariable int id) {
            return lista.get(id-1);
    }




    /// cadastrar Triplewat
    @PostMapping("/TripleWat")
    public ResponseEntity cadastrarGame(@RequestBody TripleWat novoTripleWat) {

       lista.add(novoTripleWat);
       return ResponseEntity.status(201).build();

    }
    /// cadastrar Indie
    @PostMapping("/Indie")
    public ResponseEntity cadastrarInde(@RequestBody Indie novoIndie) {

        lista.add(novoIndie);
        return ResponseEntity.status(201).build();

    }


    @Override
    public String toString() {
        return "LancamentoController{" +
                "lista=" + lista +
                '}';
    }


    public Double calculaTotalLancamento() {
        Double total = 0.0;
        for (Lancamento l : lista) {
            total += l.getValorLancado();
        }
        return total;


    }

}

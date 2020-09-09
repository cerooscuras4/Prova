package br.com.bandtec.prova;

import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/lancamentos")
public class LancamentoController {



    private List<Lancamento> lista;

    public LancamentoController() {lista = new ArrayList<Lancamento>();}

    public void adicionaLancamento(Lancamento l) { lista.add(l); }



    public Double calculaTotalLancamento() {
        Double total=0.0;
        for(Lancamento l : lista) {
            total += l.getValorLancado();
        }
        return total;

    }


    @PostMapping
    public void cadastrarLista(@RequestBody Lancamento novoLancamento) {
        lista.add(novoLancamento);
    }




    @GetMapping
        public ArrayList<Lancamento> getLancamento() {return (ArrayList<Lancamento>) lista;}



   @DeleteMapping("/{id}")
    public void excluirCachorro(@PathVariable int id) {
        lista.remove(id-1);

    }





}

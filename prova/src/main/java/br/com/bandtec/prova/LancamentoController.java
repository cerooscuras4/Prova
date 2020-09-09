package br.com.bandtec.prova;

import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/lancamento")
public class LancamentoController {



    private List<Lancamento> lista;

    public LancamentoController() {lista = new ArrayList<Lancamento>();}

    public void adicionaLancamento(Lancamento l) { lista.add(l); }



    @PostMapping("/cadastrar")
    public void cadastrarLista(@RequestBody Lancamento novoLancamento) {
        lista.add(novoLancamento);
    }




    @GetMapping("/listar")
        public ArrayList<Lancamento> getLancamento() {return (ArrayList<Lancamento>) lista;}



   @DeleteMapping("/excluir/{id}")
    public void excluirCachorro(@PathVariable int id) {
        lista.remove(id-1);

    }





}

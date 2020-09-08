package br.com.bandtec.prova;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;




@RestController
@RequestMapping("/lancamento")
public abstract class GameStoreController implements Lancamento {


private String nome;
private Double preco;
private String tipo;

    private List<Lancamento> lancamentos =new ArrayList<>();

    public GameStoreController(String nome, Double preco, String tipo, List<Lancamento> lancamentos) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
        this.lancamentos = lancamentos;
    }


    @Override
    public String toString() {
        return "GameStoreController{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", lancamentos=" + lancamentos +
                ", preco=" + String.format("R$ %.2f",preco)+
                '}';
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public String getTipo() {
        return tipo;
    }


    @GetMapping("/listar")
    public List<Lancamento> getLancamentos() {return lancamentos;}









}

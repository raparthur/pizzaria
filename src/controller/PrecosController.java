/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Sabor;
import model.TipoPizza;
import view.JanelaPrincipal;

/**
 *
 * @author Raparthur
 */
public class PrecosController {

    private JanelaPrincipal view;
    //incluir variavel dao
    
    public PrecosController(JanelaPrincipal view){ //passado apenas a view, paasar tambem dao no construtor
       this.view = view;
       initController();
    }

    private void initController(){
        this.view.setController(this);
        //exemplos de tipos de pizza e sabores para alimentar os comboboxes, devem ser listados todos do dao ordem alfabetica
        List<TipoPizza> tipos = new ArrayList<>();
        TipoPizza t1 = new TipoPizza();
        t1.setId(1);
        t1.setNome("simples");
        t1.setPrecoUnidArea(1.00);
        tipos.add(t1);
        TipoPizza t2 = new TipoPizza();
        t2.setId(2);
        t2.setNome("premium");
        t2.setPrecoUnidArea(1.20);
        tipos.add(t2);
        
        view.carregaTiposPizza(tipos);
    
    }
    
    public void atualizarTipoPizza(){
        //pega o obj pronto para atualizar
        TipoPizza tipo = view.getTipoParaAtualizar();
        if(tipo == null){
            view.apresentaInfo("algum campo faltando ou deu merda ao converter o preço por area para double");
        } else {
            System.out.println("id:"+tipo.getId()+" nome: "+tipo.getNome());
            //atualizar via dao. talvez seria interessante fazer uma logica 
            //para nao deixar atualizar com algum nome ja existente na dao. utilizar view.apresentaErro("nome duplicado");
            
        }
    }
    
    public void inserirTipoPizza(){
        //pega o obj pronto para inserir, mas com id=0 por padrao, já que é novo
        TipoPizza tipo = view.getTipoParaInserir();
        if(tipo == null){
            view.apresentaInfo("algum campo faltando ou deu merda ao converter o preço por area para double");
        } else {
            System.out.println("id:"+tipo.getId()+" nome: "+tipo.getNome());
            //inserir via dao. talvez seria interessante fazer uma logica 
            //para nao deixar inserir com algum nome ja existente na dao. utilizar view.apresentaErro("nome duplicado");
            //chamar view.carregaTiposPizza(tipos); para atualizar a nova lista na view (porque precisa do novo id)
        }
    }

    
}

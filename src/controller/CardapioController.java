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
public class CardapioController {
    
    private JanelaPrincipal view;
    
    public CardapioController(JanelaPrincipal view){ //passado apenas a view, paasar tambem dao no construtor
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
        
        List<Sabor> sabores = new ArrayList<>();
        Sabor s1 = new Sabor();
        s1.setId(1);
        s1.setNome("portuguesa");
        s1.setTipo(t1);
        sabores.add(s1);
        Sabor s2 = new Sabor();
        s2.setId(2);
        s2.setNome("frango catupiry");
        s2.setTipo(t1);
        sabores.add(s2);
        Sabor s3 = new Sabor();
        s3.setId(3);
        s3.setNome("strogonoff");
        s3.setTipo(t2);
        sabores.add(s3);
        
        view.carregaCardapio(sabores, tipos);
    }
    
    
}

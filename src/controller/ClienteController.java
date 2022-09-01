/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Cliente;
import view.JanelaPrincipal;

/**
 *
 * @author Raparthur
 */
public class ClienteController {
    private JanelaPrincipal view;
    //acrescentar dao
    
    public ClienteController(JanelaPrincipal view){
       this.view = view;
       initController();
    }
    
    
    private void initController(){
        this.view.setController(this);
        this.view.initView();
    }
    
    public void inserirCliente(){
        System.out.println("chamado inserir");
        //Cliente cliente = view.getClienteFormulario();
        //if(cliente == null){
        //    System.out.println("nao preenchido");
        //} else {
        //    System.out.println("nome: "+cliente.getNome());
        //}
    }
}

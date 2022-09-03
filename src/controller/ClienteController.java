/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import view.JanelaPrincipal;

/**
 *
 * @author Raparthur
 */
public class ClienteController {
    private JanelaPrincipal view;
    //acrescentar variavel dao
    
    public ClienteController(JanelaPrincipal view){ //passado apenas a view, paasar tambem dao no construtor
       this.view = view;
       initController();
    }
    
    private void initController(){
        this.view.setController(this);
    }
    
    public void inserirCliente(){
        Cliente cliente = view.getClienteFormulario();
        if(cliente == null){
            view.apresentaInfo("formulário não preenchido");
        } else {
            //apenas add na tabela, falta o dao, id=0 default,substituir o id pelo forcenido pelo dao
            view.adicionaClienteTabela(cliente);
        }
    }
    
    public void atualizarCliente(){
        //get cliente selecionado e já modificado via formulario
        Cliente cliente = view.getClienteParaAtualizar();
        if(cliente == null){
            view.apresentaInfo("nada selecionado");
        } else {
            System.out.println("id: "+cliente.getId()+" nome: "+cliente.getNome());
        }
    }

    public void listarTodosClientes() {
        //exemplo com 2, deve vir do dao
        List<Cliente> clientes = new ArrayList<>();
        Cliente c1 = new Cliente();
        c1.setId(1);
        c1.setNome("claudio");
        c1.setSobrenome("kruger");
        c1.setTel("1111");
        clientes.add(c1);
        Cliente c2 = new Cliente();
        c2.setId(2);
        c2.setNome("jose");
        c2.setSobrenome("gustavo");
        c2.setTel("2222");
        clientes.add(c2);
        view.listaClientesTabela(clientes);
    }
    
    public void excluirClientes(){
        List<Cliente> clientes = view.getContatosParaExcluir();
        for(Cliente c: clientes){
            System.out.println("nome:"+c.getNome());
        }
        view.excluirContatosTabela(clientes);
    }

    public void pesquisarClientes(String termo) {
        System.out.println("termo:"+termo);
        //fazer metodo no dao para buscar clientes para o termo (LIKE)
        //usar view.listaClientesTabela(clientes) para mostra-los
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Circular;
import model.Cliente;
import model.Forma;
import model.Pedido;
import model.Pizza;
import model.Quadrado;
import model.Sabor;
import model.TipoPizza;
import model.Triangular;
import view.JanelaPrincipal;

/**
 *
 * @author Raparthur
 */
public class PedidoController {
    private JanelaPrincipal view;
    //incluir variavel dao
    
    public PedidoController(JanelaPrincipal view){ //passado apenas a view, paasar tambem dao no construtor
       this.view = view;
       initController();
    }

    private void initController(){
        this.view.setController(this);
        
        //======== EXEMPLOS ABAIXO DEVEM VIR DO DAO =========        
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
        view.setClientesPedido(clientes);
        //================================================
    }
    
    public void filtraClientes(String termo){
        //vai preencher o combobox de clientes por filtro
        //buscar a lista de clientes com telefone contendo "termo" (LIKE). Busca todos se termo vazio ordem alfabetica
        System.out.println("termo a buscar:"+termo);
        
        //===exemplo
        List<Cliente> clientes = new ArrayList<>();
        Cliente c1 = new Cliente();
        c1.setId(1);
        c1.setNome("filtrado");
        c1.setSobrenome("teste");
        c1.setTel("1111");
        clientes.add(c1);
        view.setClientesPedido(clientes);
        //=====
    }
    
    public void listaPedidosCliente(Cliente cliente){
        //System.out.println("nome:"+cliente.getNome());
        //busca a lista de pedidos do cliente para mostrar o combobox de pedidos deste cliente e armazenar internamente
        //============ exemplo ========================
        
        //============abaixo, lista TODAS as formas e sabores da dao para alimentar as comboboxes=====
        //IMPORTANTE: estas formas, apesar de fixas, existem tabela e uma pizza está referenciada a esta no banco de dados so para garantir que seja de um dos tipos. Talvez nao precise guardar no BD, estudar se vale a manter a tabela ou não.
        List<Forma> formas = new ArrayList<>();
        formas.add(new Quadrado(1)); //id no construtor
        formas.add(new Triangular(2));
        formas.add(new Circular(3));
        view.setFormasPedido(formas);
        
        //listar todos os tipos, vem do dao
        TipoPizza t1 = new TipoPizza();
        t1.setId(1);
        t1.setNome("simples");
        t1.setPrecoUnidArea(0.1);
     
        TipoPizza t2 = new TipoPizza();
        t2.setId(2);
        t2.setNome("premium");
        t2.setPrecoUnidArea(0.2);
        
        //listar todos, vem do dao
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
        view.setSaboresPedido(sabores);
        //===========abaixo todos os pedidos deste cliente que vem da dao========================================================
                
        Pizza p1 = new Pizza();
        p1.setId(1);
        p1.setDimensao(20);
        p1.setForma(new Quadrado(1));
        p1.setSabor1(s1);
        
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(p1);
        
        Pedido a1 = new Pedido();
        a1.setId(1);
        a1.setCliente(cliente);
        a1.setEstado(0);
        a1.setPizzas(pizzas);
        
        Pizza p2 = new Pizza();
        p2.setId(2);
        p2.setDimensao(25);
        p2.setForma(new Quadrado(1));
        p2.setSabor1(s2);
        p2.setSabor2(s3);
        
        Pizza p3 = new Pizza();
        p3.setId(3);
        p3.setDimensao(10);
        p3.setForma(new Circular(3));
        p3.setSabor1(s3);
        
        List<Pizza> pizzas2 = new ArrayList<>();
        pizzas2.add(p2);
        pizzas2.add(p3);
        
        Pedido a2 = new Pedido();
        a2.setId(2);
        a2.setCliente(cliente);
        a2.setEstado(2);
        a2.setPizzas(pizzas2);
        
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(a1);
        pedidos.add(a2);
        //nao alterar
        view.setPedidosCliente(pedidos);
        
    }
    
    public void setPedidoSelecionado(Pedido pedido){
        view.setPedidotabela(pedido);
    }
 
    public void atualizaPizza(){
        //pizza pronta para atualizar via dao
        Pizza pizza = view.getPizzaParaAtualizar();
        if(pizza == null){
            view.apresentaInfo("algum campo vazio ou deu merda ao converter valores para double");
        }
         System.out.println("-------- ATUALIZAR ---------");
        System.out.println("sabor1:"+pizza.getSabor1().getNome());
        if(pizza.getSabor2() != null) //talvez nao tenha sabor 2
            System.out.println("sabor2:"+pizza.getSabor2().getNome());
        System.out.println("id forma:"+pizza.getForma().getId()); //pode ser instancia de quadrado,triangulo ou circulo (so o id vai ser guardado rem pizza no BD)
        System.out.println("id pizza:"+pizza.getId());
        System.out.println("valor pizza:"+pizza.getValor());
        System.out.println("area:"+pizza.getArea());
        System.out.println("dim:"+pizza.getDimensao());
        System.out.println("-------------------------");
        view.atualizaTotalPedido(); //deixar aqui para atualizar o total a pagar
    }

    public void alterarEstado(Pedido pedido) {
        System.out.println("novo estado:"+pedido.getEstado());
        //atualizar esse pedido na dao
    }
    
    public void inserirPizza(){
        //pizza pronta para inserir na dao
        Pizza pizza = view.getPizzaFormulario();
        if(pizza == null){
            view.apresentaInfo("algum campo vazio ou deu merda ao converter valores para double");
        }
        System.out.println("-------- INSERIR ---------");
        System.out.println("sabor1:"+pizza.getSabor1().getNome());
        if(pizza.getSabor2() != null) //talvez nao tenha sabor 2
            System.out.println("sabor2:"+pizza.getSabor2().getNome());
        System.out.println("id forma:"+pizza.getForma().getId()); //pode ser instancia de quadrado,triangulo ou circulo (so o id vai ser guardado rem pizza no BD)
        System.out.println("id pizza:"+pizza.getId());
        System.out.println("valor pizza:"+pizza.getValor());
        System.out.println("area:"+pizza.getArea());
        System.out.println("dim:"+pizza.getDimensao());
        System.out.println("-------------------------");
        // nao alterar: atualiza tela
        view.adicionaPizzaTabela(pizza); 
        view.adiconaTotalPedido(pizza);
    }
    
    public void removerPizza(){
        List<Pizza> pizzas = view.getPizzasParaExcluir();
        System.out.println("------ EXCLUIR:----------");
        for(Pizza p : pizzas){
            System.out.println("id:"+p.getId()+" sabor1:"+p.getSabor1().getNome());
        }
        view.eliminaPizzasTabela(pizzas);
        //se todas as pizzas forem eliminadas talvez seria interessante eliminar o pedido tb ou nao deixar excluir a ultima pizza
    }
    
    //abre novo pedido com 1 pizza
    public void novoPedidoComPizza(Pedido pedido, Pizza pizza){
        //pizza veio separado do pedido porque precisa persisti-la antes do pedido
        if(pizza == null){
            view.apresentaInfo("campo dimenao vazio ou merda ao converter para double");
        } else {
            
            //nao alterar: seta o cliente selecionado para este pedido
            Cliente cliente = view.getClienteSelecionado();           
            if(cliente == null){
                view.apresentaInfo("lista de clientes vazia ou nenhum selecionado");
                return;
            }
            pedido.setCliente(cliente); 
            
            System.out.println("-------- NOVO PEDIDO ---------");
            System.out.println("pedido:"+pedido.getId());
            System.out.println("sabor1:"+pizza.getSabor1().getNome());
            //pedido.setPizzas(lista de pizzas contendo somente a pizza do parametro com o novo id fornecido do autoincremento)
            List<Pizza> pizzas = new ArrayList<>();
            pizza.setId(5); //coloquei a força para testar, mas vai vir do autoincrement apos persistir
            pizzas.add(pizza);
            pedido.setPizzas(pizzas);
            
            List<Pedido> pedidos = view.getPedidosCliente();
            pedido.setId(3); //coloquei a força para testar, mas vai vir do autoincrement apos persistir
            pedidos.add(pedido);
            
            // nao alterar: atualiza tela
            view.esvaziarPizzasDaTabela();
            view.setPedidosCliente(pedidos);
            view.setPedidoSelecionado(pedido);
     
        }
    }
}

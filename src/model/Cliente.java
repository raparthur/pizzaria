/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author Raparthur
 */
public class Cliente {
    private long id;
    private String nome;
    private String sobrenome;
    private String tel;
    private List<Pedido> pedidos;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
    public void addPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    
    public void atualizaPedido(Pedido pedido){
        for(int i=0;i<pedidos.size();i++){
            if(pedidos.get(i).getId() == pedido.getId()){
                pedidos.set(i, pedido);
                return;
            }
        }
    }
    
    public void removePedido(int id){
        for(int i=0;i<pedidos.size();i++){
            if(pedidos.get(i).getId() == id){
                pedidos.remove(i);
                return;
            }
        }
    }
    
}

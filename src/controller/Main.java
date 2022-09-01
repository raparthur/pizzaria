/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controller;

import view.JanelaPrincipal;

/**
 *
 * @author Raparthur
 */
public class Main {

    public static void main(String[] args){
        JanelaPrincipal view = new JanelaPrincipal();
        ClienteController controller = new ClienteController(view);
        
    }
    
}

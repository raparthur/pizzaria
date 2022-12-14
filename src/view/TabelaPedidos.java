/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import model.Pizza;
import model.Sabor;

/**
 *
 * @author Raparthur
 */
public class TabelaPedidos extends javax.swing.JPanel {

    private JanelaPrincipal janela;
    private int linhaClicadaParaAtualizacao = -1;

    private PedidoTableModel modeloTabelaPedido = new PedidoTableModel();

    /**
     * Creates new form TabelaPedidos
     */
    public TabelaPedidos() {
        initComponents();
    }

    public void setJanelaView(JanelaPrincipal janela) {
        this.janela = janela;
    }

    public PedidoTableModel getModeloTabela() {
        return modeloTabelaPedido;
    }

    public JTable getTabelaPedido() {
        return jTable1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabelaPedidos = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTable1.setModel(modeloTabelaPedido);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        tabelaPedidos.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabelaPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabelaPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        //Pega a linha clicada
        linhaClicadaParaAtualizacao = this.jTable1.rowAtPoint(evt.getPoint());
        //Pega o contato da linha clicada
        Pizza pizza = modeloTabelaPedido.getPizza(linhaClicadaParaAtualizacao);
        //Seta os dados no formul??rio
        janela.getFormularioPizza().setPizzaParaPreencher(pizza);
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable jTable1;
    private javax.swing.JScrollPane tabelaPedidos;
    // End of variables declaration//GEN-END:variables

    //insere este cliente como linha na tabela
    public void adicionaPizza(Pizza pizza) {
        modeloTabelaPedido.adicionaPizza(pizza);
        janela.getFormularioPizza().setPizzaParaPreencher(pizza);
    }

    public void atualizarPizzaTabela(Pizza pizza) {
        modeloTabelaPedido.fireTableRowsUpdated(linhaClicadaParaAtualizacao, linhaClicadaParaAtualizacao);
    }

    public void setListaPizzasTabela(List<Pizza> lista) {
        modeloTabelaPedido.setListaPizzas(lista);
    }

    public List<Pizza> getPizzaParaExcluirDaTabela() {
        int[] linhasSelecionadas = this.getTabelaPedido().getSelectedRows();
        List<Pizza> listaExcluir = new ArrayList();
        for (int i = 0; i < linhasSelecionadas.length; i++) {
            Pizza pizza = modeloTabelaPedido.getPizza(linhasSelecionadas[i]);
            listaExcluir.add(pizza);
        }
        return listaExcluir;
    }

    public void excluirPizzasDaTabela(List<Pizza> listaParaExcluir) {
        modeloTabelaPedido.removePizzas(listaParaExcluir);
    }
    
    public void esvaziarPizzasDaTabela() {
        modeloTabelaPedido.limpaTabela();
    }

    
}

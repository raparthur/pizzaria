/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import controller.CardapioController;
import java.util.ArrayList;
import java.util.List;
import model.TipoPizza;

/**
 *
 * @author Raparthur
 */
public class FormularioTiposPizza extends javax.swing.JPanel {

    /**
     * Creates new form FormularioTiposPizza
     */
    public FormularioTiposPizza() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoPizzaCbbox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        nomeTipoPizzaTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        precoTipoPizzaTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        atualizarTipoPizzaBtn = new javax.swing.JButton();
        inserirTipoPizzaBtn = new javax.swing.JButton();
        removerTipoPizzaBtn = new javax.swing.JButton();

        jLabel1.setText("selecione tipo");

        jLabel2.setText("nome");

        jLabel3.setText("preço cm2");

        atualizarTipoPizzaBtn.setText("atualizar");

        inserirTipoPizzaBtn.setText("inserir");

        removerTipoPizzaBtn.setText("remover");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(nomeTipoPizzaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(precoTipoPizzaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inserirTipoPizzaBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(atualizarTipoPizzaBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removerTipoPizzaBtn))))
                    .addComponent(tipoPizzaCbbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipoPizzaCbbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeTipoPizzaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precoTipoPizzaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atualizarTipoPizzaBtn)
                    .addComponent(inserirTipoPizzaBtn)
                    .addComponent(removerTipoPizzaBtn))
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarTipoPizzaBtn;
    private javax.swing.JButton inserirTipoPizzaBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nomeTipoPizzaTxt;
    private javax.swing.JTextField precoTipoPizzaTxt;
    private javax.swing.JButton removerTipoPizzaBtn;
    private javax.swing.JComboBox<String> tipoPizzaCbbox;
    // End of variables declaration//GEN-END:variables

    private List<TipoPizza> tiposPizza = new ArrayList<>(); //var auxiliar para representar os itens tipos de pizza do combobox como objeto
    
    public void setController(CardapioController controller){
        
    }
    
    //alimenta a lista de tipos de pizza disponiveis na variavel global auxiliar e combobox
    public void setTiposPizzaList(List<TipoPizza> tipos){
        tiposPizza = tipos;
        tipoPizzaCbbox.removeAllItems();
        for(TipoPizza tipo:tipos){
            tipoPizzaCbbox.addItem(tipo.getNome());
        }
    }
    
    //retorna toda a lista de tipos de pizza do combobox
    public List<TipoPizza> getTiposPizzaList(){
        return tiposPizza;
    }
    
    //remove o tipo de pizza do combobox
    public TipoPizza removeTipoPizzaCbbox(int id){
        for(TipoPizza tipo:tiposPizza){
            int index = 0;
            if(tipo.getId() == id){
                tipoPizzaCbbox.remove(index);
                return tipo;
            }
            index++;
        }
        return null;
    }
    
    //add o tipo de pizza no combobox
    public void addTipoPizzaCbbox(TipoPizza tipo){
        tiposPizza.add(tipo);
        tipoPizzaCbbox.addItem(tipo.getNome());
    }

    //retorna os campos preenchidos na forma de objeto
    public TipoPizza getTipoPizzaFormulario(){
        String nome = nomeTipoPizzaTxt.getText();
        String precoStr = precoTipoPizzaTxt.getText();
        
        if(nome.isBlank() || precoStr.isBlank()){
            return null;
        }
        
        try{
            double preco = Double.parseDouble(precoStr);
            TipoPizza tipo = new TipoPizza();
            tipo.setId(0);
            tipo.setNome(nome);
            tipo.setPrecoUnidArea(preco);
            return tipo;
        } catch(Exception e){
            return null;
        }
    }
    
    //preenche os campos a partir do objeto
    public void setTipoPizzaPreencher(TipoPizza tipo){
        nomeTipoPizzaTxt.setText(tipo.getNome());
        precoTipoPizzaTxt.setText(String.valueOf(tipo.getPrecoUnidArea()));
    }
}

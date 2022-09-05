/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import controller.CardapioController;
import java.util.ArrayList;
import java.util.List;
import model.Sabor;
import model.TipoPizza;

/**
 *
 * @author Raparthur
 */
public class FormularioSabores extends javax.swing.JPanel {

    private List<Sabor> saboresList = new ArrayList<>(); //var auxiliar para representar os itens sabor de pizza do combobox como objeto
    private List<TipoPizza> tiposPizzaList = new ArrayList<>(); //var auxiliar para representar os itens tipos de pizza do combobox como objeto
    
    /**
     * Creates new form FormularioSabores
     */
    public FormularioSabores() {
        initComponents();
    }
    
    public void setController(CardapioController controller){
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        saborCbbox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        nomeSaborTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tipoPizzaSaborCbbox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        inserirSaborBtn = new javax.swing.JButton();
        atualizarSaborBtn = new javax.swing.JButton();
        excluirSaborBtn = new javax.swing.JButton();

        jLabel1.setText("selecione sabor para atualizar");

        jLabel2.setText("nome");

        jLabel3.setText("tipo");

        inserirSaborBtn.setText("Inserir");

        atualizarSaborBtn.setText("Atualizar");

        excluirSaborBtn.setText("Excluir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeSaborTxt)
                    .addComponent(saborCbbox, 0, 720, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tipoPizzaSaborCbbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inserirSaborBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atualizarSaborBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluirSaborBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saborCbbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeSaborTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoPizzaSaborCbbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inserirSaborBtn)
                    .addComponent(atualizarSaborBtn)
                    .addComponent(excluirSaborBtn))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarSaborBtn;
    private javax.swing.JButton excluirSaborBtn;
    private javax.swing.JButton inserirSaborBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nomeSaborTxt;
    private javax.swing.JComboBox<String> saborCbbox;
    private javax.swing.JComboBox<String> tipoPizzaSaborCbbox;
    // End of variables declaration//GEN-END:variables

    //alimenta a lista de sabores disponiveis na variavel global auxiliar e combobox
    public void setSaboresList(List<Sabor> sabores){
        saboresList = sabores;
        saborCbbox.removeAllItems();
        for(Sabor sabor:sabores){
            saborCbbox.addItem(sabor.getNome());
        }
    }
    
    //alimenta a lista de tipos de pizza disponiveis na variavel global auxiliar e combobox
    public void setTiposPizzaList(List<TipoPizza> tipos){
        tiposPizzaList = tipos;
        tipoPizzaSaborCbbox.removeAllItems();
        for(TipoPizza tipo:tipos){
            tipoPizzaSaborCbbox.addItem(tipo.getNome());
        }
    }
    
    //retorna toda a lista de sabores do combobox
    public List<Sabor> getSaboresList(){
        return saboresList;
    }
    
    //remove o tipo de pizza do combobox
    public Sabor removeSaboresCbbox(int id){
        for(Sabor sabor:saboresList){
            int index = 0;
            if(sabor.getId() == id){
                saborCbbox.remove(index);
                return sabor;
            }
            index++;
        }
        return null;
    }
    
    //add o sabor no combobox
    public void addTipoPizzaCbbox(Sabor sabor){
        saboresList.add(sabor);
        saborCbbox.addItem(sabor.getNome());
    }
    
    //retorna os campos preenchidos na forma de objeto
    public Sabor getSaborFormulario(){
        
        String nome = nomeSaborTxt.getText();
        TipoPizza tipo = null;
       
        for(int i=0; i<tiposPizzaList.size(); i++){
            if(i == tipoPizzaSaborCbbox.getSelectedIndex()){
                tipo = tiposPizzaList.get(i);
                break;
            }
        }
        
        if(nome.isBlank() || tipo == null){
            return null;
        }
        
        Sabor sabor = new Sabor();
        sabor.setId(0);
        sabor.setNome(nome);
        sabor.setTipo(tipo);
        
        return sabor;
    }


}

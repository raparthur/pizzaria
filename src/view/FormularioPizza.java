/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import controller.PedidoController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import model.Circular;
import model.Forma;
import model.Pedido;
import model.Pizza;
import model.Quadrado;
import model.Sabor;
import model.Triangular;

/**
 *
 * @author Raparthur
 */
public class FormularioPizza extends javax.swing.JPanel {

    private List<Sabor> saboresList = new ArrayList<>();
    private List<Forma> formasList = new ArrayList<>();
    private Pizza pizzaParaAtualizar;

    /**
     * Creates new form FormularioPizza
     */
    public FormularioPizza() {
        initComponents();

        sabor2Cbbox.setEnabled(false);
        sabor2Ckbox.addChangeListener((ChangeEvent e) -> {
            sabor2Cbbox.setEnabled(sabor2Ckbox.isSelected());
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        formaCbbox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        sabor1Cbbox = new javax.swing.JComboBox<>();
        sabor2Ckbox = new javax.swing.JCheckBox();
        sabor2Cbbox = new javax.swing.JComboBox<>();
        dimTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        areaTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inserirPizzaBtn = new javax.swing.JButton();
        atualizarPizzaBtn = new javax.swing.JButton();
        excluirPizzaBtn = new javax.swing.JButton();
        novoPedidoBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("forma");

        formaCbbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                formaCbboxFocusLost(evt);
            }
        });

        jLabel2.setText("sabor 1");

        sabor2Ckbox.setText("sabor 2");

        dimTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dimTxtFocusLost(evt);
            }
        });

        jLabel3.setText("dimensão (cm)");

        areaTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                areaTxtFocusLost(evt);
            }
        });

        jLabel4.setText("area (cm²)");

        inserirPizzaBtn.setText("inserir");

        atualizarPizzaBtn.setText("atualizar");

        excluirPizzaBtn.setText("excluir");

        novoPedidoBtn.setText("inserir em novo pedido");

        jLabel5.setText("editar pizza selec. neste pedido:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dimTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(areaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(novoPedidoBtn))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inserirPizzaBtn)
                                .addGap(12, 12, 12)
                                .addComponent(atualizarPizzaBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(excluirPizzaBtn))
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(formaCbbox, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sabor1Cbbox, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sabor2Cbbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sabor2Ckbox)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(sabor2Ckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formaCbbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sabor1Cbbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sabor2Cbbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dimTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(areaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inserirPizzaBtn)
                    .addComponent(atualizarPizzaBtn)
                    .addComponent(excluirPizzaBtn)
                    .addComponent(novoPedidoBtn))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    //caixa dimensao alterada perde foco, recalcula area
    private void dimTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dimTxtFocusLost
        if (pizzaParaAtualizar != null) {
            pizzaParaAtualizar.setDimensao(Double.valueOf(dimTxt.getText()));
            areaTxt.setText(String.valueOf(Pizza.round(pizzaParaAtualizar.getArea(), 1)));
        } else {
            setCalcArea();

        }
    }//GEN-LAST:event_dimTxtFocusLost

    //caixa area alterada perde foco, recalcula dimensao
    private void areaTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_areaTxtFocusLost
        if (pizzaParaAtualizar != null) {
            pizzaParaAtualizar.setArea(Double.valueOf(areaTxt.getText()));
            dimTxt.setText(String.valueOf(Pizza.round(pizzaParaAtualizar.getDimensao(),1)));
        } else {
            setCalcDim();
        }
    }//GEN-LAST:event_areaTxtFocusLost

    //alterou combobox formarecalcula area ou dimensao
    private void formaCbboxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formaCbboxFocusLost
        if (!dimTxt.getText().isBlank()) {
            setCalcArea();
            setCalcDim();
        } else if (!areaTxt.getText().isBlank()) {
            setCalcDim();
            setCalcArea();
        }
    }//GEN-LAST:event_formaCbboxFocusLost

    private void setCalcArea() {
        try {
            double dim = Double.valueOf(dimTxt.getText());
            for (int i = 0; i < formasList.size(); i++) {
                if (formaCbbox.getSelectedIndex() == i) {
                    Forma forma = formasList.get(i);
                    areaTxt.setText(String.valueOf(Pizza.round(forma.calcArea(dim), 1)));
                }
            }
        } catch (Exception e) {
            System.out.println("problemas para converter dimensao para double");
        }
    }

    private void setCalcDim() {
        try {
            double area = Double.valueOf(areaTxt.getText());
            for (int i = 0; i < formasList.size(); i++) {
                if (formaCbbox.getSelectedIndex() == i) {
                    Forma forma = formasList.get(i);
                    dimTxt.setText(String.valueOf(Pizza.round(forma.calcDim(area), 1)));
                }
            }
        } catch (Exception e) {
            System.out.println("problemas para converter dimensao para double");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaTxt;
    private javax.swing.JButton atualizarPizzaBtn;
    private javax.swing.JTextField dimTxt;
    private javax.swing.JButton excluirPizzaBtn;
    private javax.swing.JComboBox<String> formaCbbox;
    private javax.swing.JButton inserirPizzaBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton novoPedidoBtn;
    private javax.swing.JComboBox<String> sabor1Cbbox;
    private javax.swing.JComboBox<String> sabor2Cbbox;
    private javax.swing.JCheckBox sabor2Ckbox;
    // End of variables declaration//GEN-END:variables

    //alimenta a lista de sabores disponiveis na variavel global auxiliar e combobox
    public void setSaboresList(List<Sabor> sabores) {
        saboresList = sabores;
        sabor1Cbbox.removeAllItems();
        sabor2Cbbox.removeAllItems();
        for (Sabor sabor : sabores) {
            sabor1Cbbox.addItem(sabor.getNome());
            sabor2Cbbox.addItem(sabor.getNome());
        }
    }

    public void setFormasList(List<Forma> formas) {
        formasList = formas;
        formaCbbox.removeAllItems();
        for (Forma forma : formas) {
            formaCbbox.addItem(forma.toString());
        }
    }

    public Pizza getFormularioPreenchido() {
        if (sabor1Cbbox.getSelectedIndex() == -1 || formaCbbox.getSelectedIndex() == -1
                || dimTxt.getText().isBlank() || areaTxt.getText().isBlank() || dimTxt.getText().isBlank()) {
            return null;
        }
        Pizza pizza = new Pizza();
        pizza.setId(0);
        try {
            pizza.setDimensao(Double.valueOf(dimTxt.getText()));
        } catch (Exception e) {
            return null;
        }

        try {
            pizza.setDimensao(Double.parseDouble(dimTxt.getText()));
        } catch (Exception e) {
            return null;
        }

        for (int i = 0; i < saboresList.size(); i++) {
            if (sabor1Cbbox.getSelectedIndex() == i) {
                pizza.setSabor1(saboresList.get(i));
            }
            if (sabor2Ckbox.isSelected() && sabor2Cbbox.getSelectedIndex() == i) {
                pizza.setSabor2(saboresList.get(i));
            }
        }

        for (int i = 0; i < formasList.size(); i++) {
            if (formaCbbox.getSelectedIndex() == i) {
                pizza.setForma(formasList.get(i));

            }
        }
        return pizza;
    }

    public void setPizzaParaPreencher(Pizza pizza) {
        pizzaParaAtualizar = pizza;
        dimTxt.setText(String.valueOf(pizza.getDimensao()));
        areaTxt.setText(String.valueOf(pizza.getArea()));

        sabor2Ckbox.setSelected(false);
        for (int i = 0; i < saboresList.size(); i++) {

            if (saboresList.get(i).getId() == pizza.getSabor1().getId()) {
                sabor1Cbbox.setSelectedIndex(i);
            }

            if (pizza.getSabor2() != null && saboresList.get(i).getId() == pizza.getSabor2().getId()) {
                sabor2Cbbox.setSelectedIndex(i);
                sabor2Ckbox.setSelected(true);
            }
        }

        for (int i = 0; i < formasList.size(); i++) {
            if (formasList.get(i).getId() == pizza.getForma().getId()) {
                formaCbbox.setSelectedIndex(i);
            }
        }

    }

    public Pizza getPizzaParaAtualizar() {
        if (pizzaParaAtualizar == null) {
            return null;
        }
        try {
            pizzaParaAtualizar.setDimensao(Double.parseDouble(dimTxt.getText()));
        } catch (Exception e) {
            return null;
        }

        for (int i = 0; i < saboresList.size(); i++) {
            if (sabor1Cbbox.getSelectedIndex() == i) {
                pizzaParaAtualizar.setSabor1(saboresList.get(i));
            }
            if (sabor2Cbbox.getSelectedIndex() == i) {
                if (sabor2Ckbox.isSelected()) {
                    pizzaParaAtualizar.setSabor2(saboresList.get(i));
                } else {
                    pizzaParaAtualizar.setSabor2(null);
                }
            }
        }

        for (int i = 0; i < formasList.size(); i++) {
            if (formaCbbox.getSelectedIndex() == i) {
                pizzaParaAtualizar.setForma(formasList.get(i));

            }
        }
        return pizzaParaAtualizar;
    }

    void setController(PedidoController controller) {
        this.novoPedidoBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pedido pedido = new Pedido();
                pedido.setId(0);
                pedido.setEstado(0);

                try {
                    Pizza pizza = new Pizza();
                    pizza.setId(0);
                    pizza.setDimensao(Double.parseDouble(dimTxt.getText()));
                    
                    for (int i = 0; i < saboresList.size(); i++) {
                        if (sabor1Cbbox.getSelectedIndex() == i) {
                            pizza.setSabor1(saboresList.get(i));
                        }
                        if (sabor2Cbbox.getSelectedIndex() == i && sabor2Ckbox.isSelected()) {
                            pizza.setSabor2(saboresList.get(i));
                        }
                    }

                    for (int i = 0; i < formasList.size(); i++) {
                        if (formaCbbox.getSelectedIndex() == i) {
                            pizza.setForma(formasList.get(i));

                        }
                    }
                    controller.novoPedidoComPizza(pedido,pizza);
                } catch (Exception ex) {
                    ex.printStackTrace();
                    controller.novoPedidoComPizza(pedido,null);
                }

                
            }
        });
        this.inserirPizzaBtn.addActionListener((ActionEvent e) -> controller.inserirPizza());
        this.atualizarPizzaBtn.addActionListener((ActionEvent e) -> controller.atualizaPizza());
        this.excluirPizzaBtn.addActionListener((ActionEvent e) -> controller.removerPizza());
    }

}

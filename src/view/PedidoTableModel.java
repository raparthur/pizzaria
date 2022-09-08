/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Pizza;

/**
 *
 * @author Rafael
 */
public class PedidoTableModel extends AbstractTableModel{
    private String[] colunas=new String[]{"id","Sabor 1","Sabor 2","Valor"};

    private List<Pizza> lista=new ArrayList();

    
    public PedidoTableModel(List<Pizza> lista){
        this.lista=lista;
    }

    public PedidoTableModel(){
    }


    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public String getColumnName(int index) {
        return this.colunas[index];
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
        /*if(column==0)
            return true;
        return false;*/
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pizza pizza = lista.get(rowIndex);
        switch (columnIndex) {
            case 0: return pizza.getId();
            case 1: return pizza.getSabor1().getNome();
            case 2: 
                if(pizza.getSabor2() != null)
                    return pizza.getSabor2().getNome();
                return null;
            case 3: return pizza.getValor();
            default : return null;
        }
    }

    @Override
    public void setValueAt(Object value, int row, int col) {
        /*
        Pizza pizza = lista.get(row);
        switch (col) {
            case 0:
                pizza.setId((int)value); //if column 0 (code)
                break;
            case 1:
                //cliente.setNome((String) value);
                break;
            case 2:
                //cliente.setSobrenome((String) value);
                break;
            default:
        }
        this.fireTableCellUpdated(row, col);
*/
    }

    public boolean removePizza(Pizza pizza) {
        int linha = this.lista.indexOf(pizza);
        boolean result = this.lista.remove(pizza);
        this.fireTableRowsDeleted(linha,linha);//update JTable
        return result;
    }

    public void adicionaPizza(Pizza pizza) {
        this.lista.add(pizza);
        this.fireTableRowsInserted(lista.size()-1,lista.size()-1);//update JTable
    }

    public void setListaPizzas(List<Pizza> pizzas) {
        this.lista = pizzas;
        this.fireTableDataChanged();
        //this.fireTableRowsInserted(0,contatos.size()-1);//update JTable
    }

    public void limpaTabela() {
        int indice = lista.size()-1;
        if(indice<0)
            indice=0;
        this.lista = new ArrayList();
        this.fireTableRowsDeleted(0,indice);//update JTable
    }

    public Pizza getPizza(int linha){
        return lista.get(linha);
    }

    void removePizzas(List<Pizza> listaParaExcluir) {
        listaParaExcluir.forEach((contato) -> {
            removePizza(contato);
        });
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Cliente;

/**
 *
 * @author Rafael
 */
public class ClienteTableModel extends AbstractTableModel{
    private String[] colunas=new String[]{"id","Nome", "Sobrenome","Tel"};

    private List<Cliente> lista=new ArrayList();

    
    public ClienteTableModel(List<Cliente> lista){
        this.lista=lista;
    }

    public ClienteTableModel(){
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
        Cliente cliente = lista.get(rowIndex);
        switch (columnIndex) {
            case 0: return cliente.getId();//if column 0 (code)
            case 1: return cliente.getNome();//if column 1 (name)
            case 2: return cliente.getSobrenome();//if column 2 (age)
            case 3: return cliente.getTel();
            default : return null;
        }
    }

    @Override
    public void setValueAt(Object value, int row, int col) {
        Cliente cliente = lista.get(row);
        switch (col) {
            case 0:
                cliente.setId((Long) value); //if column 0 (code)
                break;
            case 1:
                cliente.setNome((String) value);
                break;
            case 2:
                cliente.setSobrenome((String) value);
                break;
            default:
        }
        this.fireTableCellUpdated(row, col);
    }

    public boolean removeCliente(Cliente cliente) {
        int linha = this.lista.indexOf(cliente);
        boolean result = this.lista.remove(cliente);
        this.fireTableRowsDeleted(linha,linha);//update JTable
        return result;
    }

    public void adicionaCliente(Cliente cliente) {
        this.lista.add(cliente);
        this.fireTableRowsInserted(lista.size()-1,lista.size()-1);//update JTable
    }

    public void setListaClientes(List<Cliente> clientes) {
        this.lista = clientes;
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

    public Cliente getClientes(int linha){
        return lista.get(linha);
    }

    void removeClientes(List<Cliente> listaParaExcluir) {
        listaParaExcluir.forEach((contato) -> {
            removeCliente(contato);
        });
    }
    
}

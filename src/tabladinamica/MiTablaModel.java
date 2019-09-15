package tabladinamica;

import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

public class MiTablaModel extends AbstractTableModel{
    private LinkedList<Nodo> items;
    private LinkedList<String> cols;
    
    public MiTablaModel(){
        items = new LinkedList();
        cols = new LinkedList();
    }
    
    public void addCol(String cad){
        cols.add(cad);
    }
    
    public void addNodo(Nodo n){
        items.add(n);
        this.fireTableRowsInserted(this.items.size()-1,this.items.size()-1);
        
    }
    
    @Override
    public int getRowCount() {
        return items.size();
    }

    @Override
    public int getColumnCount() {
        return this.cols.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex==0){
            return this.items.get(rowIndex).getI();
        }else{
            return this.items.get(rowIndex).getCad();
        }
    }

    @Override
    public String getColumnName(int column) {
        return this.cols.get(column);
    }
    
    
}

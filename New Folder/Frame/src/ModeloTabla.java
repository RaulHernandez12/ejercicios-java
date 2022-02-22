/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;


import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Raul
 */
public class ModeloTabla extends AbstractTableModel{

    
    @Override
    public int getRowCount() {
        return 4;
    }
   

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int i, int il) {
        String cadena = " cadena" + (i+1) + (il+2);
        return cadena;
    }
    
}

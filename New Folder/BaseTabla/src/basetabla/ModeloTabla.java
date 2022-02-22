/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basetabla;

import static basetabla.Conexion.rs;
import static basetabla.Conexion.sentencia;
import java.sql.ResultSet;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Raul
 */
public class ModeloTabla extends AbstractTableModel{
    
    Conexion con = new Conexion();
   
    
    @Override
    public int getRowCount() {
        
        return con;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String cadena = "";
        try{
        while(con.rs.next()){
            cadena = con.rs.getString("codigo") + con.rs.getString("nombre");
        }    
    }catch(Exception ex){
            System.out.println("ERROR"+ ex);
}

        return cadena;
}
    
}

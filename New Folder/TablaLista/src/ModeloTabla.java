

import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raul
 */
public class ModeloTabla implements TableModel {
    
    
    private ArrayList<Persona> personas= new ArrayList<Persona>();
    private Persona per ;
    
    public ModeloTabla(ArrayList<Persona> misPersonas) {
        this.personas = misPersonas ;
    }

    @Override
    public int getRowCount() {
        
        return personas.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int i) {
        String titulo="";
        switch (i){
            case 0 : titulo = "Nombre";
            break;
            case 1 : titulo = "Apellidos";
            break;
            case 2 : titulo =" Edad";
            break;
        }
        return titulo;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        Object valor = null;
        switch (columnIndex){
            case 0: valor = String.class;
            break;
            case 1: valor = String.class;
            break;
            case 2 : valor = Integer.class;
            break;
        }
           return (Class<?>) valor;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        personas.get(rowIndex);
        personas.get(columnIndex);
        return false;
       
    }

    @Override
    public Object getValueAt(int i, int i1) {
          String valor;
          int edad;
          per = personas.get(i);
          
          switch (i1){
              case 0 : valor = per.getNombre();
              break;
              case 1 : valor = per.getApellido();
              break;
              case 2 : edad =  per.getEdad(); 
              return edad;
              default: valor="Error";
             
              
              
          }
         return valor;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
         
          personas.get(rowIndex);
          if (columnIndex==0){
               per.setApellidos(aValue.toString());                     
          }
          if (rowIndex == 1){
               per.setApellidos(aValue.toString());
          }
          
          if (rowIndex == 2){              
              per.setEdad((int) aValue); 
          }
         
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        //
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
           //
    }

    
    
}

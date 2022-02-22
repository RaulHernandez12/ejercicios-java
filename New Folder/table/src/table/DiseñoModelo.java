/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 * @author Raul
 */
public class DiseñoModelo extends JFrame{

    public DiseñoModelo(){
                   
        configurarVentana();
        inicializarComponentes();
}
   
    private void configurarVentana(){
        setTitle("Esta es mi ventana");
        setBounds(400,400,500,500);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
    }
    
    private void inicializarComponentes(){
        
        TableModel tabla = new ModeloTabla();
        JTable miTabla = new JTable(tabla);
        validate();
        add(new JScrollPane(miTabla), BorderLayout.CENTER);
        
    }

    
}

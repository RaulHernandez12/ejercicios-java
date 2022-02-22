/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planetas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 * @author Raul
 */
public class Planetas extends JFrame{
    String [] columnas= {"Nombre","Tamaño","Gaseoso"};
    Object [][] filas = {
            {"Plutón",2440,0,false},
            {"Mercurio",3440,1,true},
            {"Neptuno",500,0,false},
            {"Marte",3000,1,true}    
                };
    
    JTable miTabla = new JTable(filas,columnas);   
    
    public Planetas(){
        configurarVentana();
        inicializarComponentes();
        
    }
    
    private void configurarVentana(){
        setTitle("Planetas");
        setBounds(400,400,500,500);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
    }
    
    private void inicializarComponentes(){
                
             
        add(new JScrollPane(miTabla), BorderLayout.CENTER);
        JPanel panel = new JPanel();        
        add(panel, BorderLayout.SOUTH);        
        JButton bimprimir = new JButton("Imprimir");
        
        panel.add(bimprimir);
        
        bimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bimprimirActionPerformed(evt);
               
            }
        });
        
    }    
    private void bimprimirActionPerformed (java.awt.event.ActionEvent evt){
        try{ 
        miTabla.print();
        }catch(Exception ex){
            System.out.println("Error");
        }
                
    }
    
}

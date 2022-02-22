/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outputinput;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;


public class OutputInput {

 
    public static void main(String[] args) {
        
        escribirNumero();
        leerArchivo();
        
    }//FIN DEL MAIN
    
    
    public static void escribirNumero(){
    Random r=new Random();
    
    int i;
    try{
        FileOutputStream fos=new FileOutputStream("C:\\Users\\Raul\\Desktop\\output");
        DataOutputStream dos=new DataOutputStream(fos);
        
        for(i=0;i<10;i++){
            dos.writeDouble(r.nextDouble()*9);
        }
        
        dos.close();
    }catch(FileNotFoundException ex){
        System.out.println("No se encuentra el archivo");
    }catch(IOException ex){
        System.out.println("Error de lectura");
    }    
    
}    
    public static void leerArchivo(){
    boolean finArchivo = false;
        
    try{
        FileInputStream fis=new FileInputStream("C:\\Users\\Raul\\Desktop\\output");
        DataInputStream dis=new DataInputStream(fis);
        while(!finArchivo){
            
            System.out.println(dis.readDouble());
        }
        dis.close();
    }catch(EOFException ex){
        finArchivo = true;
     
    }catch(FileNotFoundException ex){
        System.out.println("No se encuentra el archivo");
    }catch(IOException ex){
        System.out.println("Error de lectura del archivo");
    }       
   }

    
}

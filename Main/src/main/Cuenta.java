
package main;

import java.util.Scanner;

public class Cuenta {   
    //Creamos la clase con sus atributos
     private String Titular;
     private double Cantidad;

    //Constructor por defecto

public Cuenta(){

    Titular="";
    Cantidad=0;
}

    //Constructor con parámetros
    
    public Cuenta(String Titular){
        this.Titular=Titular;
    }

    public Cuenta (String Titular, double Cantidad){
        this.Titular=Titular;
        this.Cantidad=Cantidad;
    }


    //Métodos get
        
     public String getTitular(){
     return Titular;
     }
     
     public double getCantidad(){
       return Cantidad;  
    }
    
     //Métodos set
     
     public void setTitutlar(String Titular){
         this.Titular=Titular;
     }
     
     public void setCantidad(double Cantidad){
         this.Cantidad=Cantidad;
     }
     
     //Creamos toString
     
     @Override
     public String toString(){
         String mensaje = "La cantidad de la cuenta de "+Titular+" es "+Cantidad;
         return mensaje;
     }

     //Creamos métodos ingresar y retirar
     
     public void ingresar (double ingreso){
       
             Cantidad+=ingreso;
                       
     }
     
     public double retirar (double retirar){
         if(retirar >= Cantidad){
            Cantidad=0;
            return Cantidad;
         }else{
         Cantidad-=retirar;
         }
         return Cantidad;
     }

     public void menu(){
         int opcion=0;
       if(opcion == 1){
           
           
       }
         
         
         
     }
        



}
    

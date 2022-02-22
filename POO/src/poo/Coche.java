/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Raúl Hernández
 */
public class Coche {
    private int ruedas;
    private String marca;
    private String modelo;
    private double velocidad;
    static double descuento=1500;
   
    //CONSTRUCTOR POR DEFECTO
public Coche(){
    ruedas=4;
    marca="";
    modelo="";
    velocidad=0;
       
   }
    //CONSTRUCTOR CON TODOS LOS PARAMETROS
   public Coche(int ruedas, String marca,String modelo,double velocidad){
       this.ruedas=ruedas;      
       this.marca=marca;    
       this.modelo=modelo;
       this.velocidad=velocidad;
       
   }
    //CONSTRUCTOR CON 2 PARAMETROS
   public Coche(String marca, String modelo){
       this.marca=marca;
       this.modelo=modelo;
   }
   //METODOS GET
   
   public String getModelo(){
       return modelo;
   }
   
   public int getRuedas(){
       return ruedas;
   }
   
   public String getMarca(){
       return marca;
   }
   public double getVelocidad(){
       return velocidad;
   }
    //METODOS SET
   
   public void setModelo(String modelo){
       this.modelo=modelo;
   }
   
   public void setRuedas (int ruedas){
       this.ruedas=ruedas;
   }
   
   public void setMarca( String marca){
       this.marca=marca;
   }
   
   public void setVelocidad(double velocidad){
       this.velocidad=velocidad;
   }
   
   //to string
   
   @Override
   public String toString(){
       String mensaje= "Este coche es de la marca "+marca+" modelo "+modelo+ " y alcanza una velocidad de "+velocidad+ " y el descuento es de "+descuento;
       return mensaje;
   }
   
   //METODO AUMENTAR VELOCIDAD
   
   public double aumentarVelocidad(){
        this.velocidad+=20;
        return velocidad; 
}
   
   public double frenar(){
       this.velocidad-=velocidad;
       return velocidad;
   }
}

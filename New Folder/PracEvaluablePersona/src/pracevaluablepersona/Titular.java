/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pracevaluablepersona;

/**
 *
 * @author Raul
 */
public class Titular extends Profesor{
        
        private final int HORASMAX=22;
        private final double PRECIOHORA=  26.5;
        private final double IRPF= 0.85;
        
        public Titular(){
          
          nombre="";
          apellidos="";
          edad=0;
          numhoras= 0;
          centro="";
          salario=0;
          
        }
      
        public Titular(String nombre,String apellidos,int edad, int numHoras,String centro){
          this.nombre=nombre;
          this.apellidos=apellidos;
          this.edad=edad;
          numeroHoras(numHoras);
          this.centro=centro;         
        }
      
        
        
        public String getNombre(){
            
            return ("Profesor titular: "+ nombre);
        }
        
        public void setNumHoras(int horas){
            numeroHoras(horas);
        }
        
        public  void numeroHoras(int horas){
            if (horas > HORASMAX){
                System.out.println("El numero de horas introducido al "+getNombre()+": "+horas+ ", es mayor a "+HORASMAX+ ", introduzca un numero menor de horas"); 
                this.numhoras=0;
            }else{
                this.numhoras=horas;
         }
    
        }
        
        public double calcularSueldo(){         
         
            this.salario = ((PRECIOHORA * numhoras)* IRPF) * SEMANAS;
            
            return salario;
        } 
        
        public void Mostrar(){
            System.out.println(getNombre() +", apellido : "+getApellido()+ ",  edad : "+ getEdad()+ " ha trabajado: "+getNumHoras() +" horas, su sueldo es de: "+ calcularSueldo()
                    +"€ y trabaja en "+ getCentro());
        }
}//CLASS
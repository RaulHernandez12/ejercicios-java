/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Raul
 */
public class Persona {
    
    protected String nombre;
    protected String apellido;
    protected int edad;
    
    public Persona(){
        nombre="";
        apellido="";
        edad=0;
    }
    
    public Persona(String nombre,String apellido,int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public void Mostrar(){
        System.out.print(" El nombre es: "+ nombre+" el apellido es: "+ getApellido() + " y la edad es: "+ getEdad());
    }
}

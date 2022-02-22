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
public abstract class Persona {
    
    protected String nombre;
    protected String apellidos;
    protected  int edad;    

     public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellidos;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setApellido(String apellido){
        this.apellidos=apellido;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    public abstract void Mostrar();
}

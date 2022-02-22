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
public class Alumno extends Persona{
    
    private String grupo;
    private String especialidad;
    
    public Alumno(){
        grupo="";
        especialidad="";
    }
    
    public Alumno(String nombre, String apellido, int edad,String grupo, String especialidad){
        super(nombre,apellido,edad);
        this.grupo=grupo;
        this.especialidad=especialidad;
    }
    
    
    
    public String getNombre(){    
        
        return ("Alumno: "+ nombre);
    }
    
    public String getGrupo(){
        return grupo;
    }
    
    public String getEspecialidad(){
        return especialidad;
    }
    
    public void setGrupo(String grupo){
        this.grupo=grupo;
    }
    
    public void setEspecialidad(String especialidad){
        this.especialidad=especialidad;
    }
    
    public void Mostrar(){
       
        super.Mostrar();
        System.out.println(" su grupo es : "+ getGrupo()+ " y su especialidad : "+ getEspecialidad());
    }
}

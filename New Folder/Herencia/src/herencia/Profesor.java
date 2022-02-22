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
public class Profesor extends Persona{
    
    private double salario;
    private String departamento;
    
    public Profesor(){
        salario=0;
        departamento="";
    }
    
    public Profesor (String nombre, String apellido, int edad, double salario, String departamento){
        super(nombre,apellido,edad);
        this.salario=salario;
        this.departamento=departamento;
    }
    
    public String getNombre(){
        
        return ("Profesor: "+nombre);
    }
    public double getSalario(){
        return salario;
    }
    
    public String getDepartamento(){
        return departamento;
    }
    
    public void setSalario (double salario){
        this.salario=salario;
    }
    
    public void setDepartamento(String departamento){
        this.departamento=departamento;
    }
    
    public void Mostrar(){
        super.Mostrar();
        System.out.println(" su salario es: "+getSalario()+" y su departamento es: "+getDepartamento());
    }
}

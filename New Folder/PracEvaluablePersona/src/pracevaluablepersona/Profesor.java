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
public abstract class Profesor extends Persona{
    protected final int SEMANAS=4;
    
    protected int numhoras;
    protected String centro;
    protected double salario;
    
    public int getNumHoras(){
        return numhoras;
    }
    
    public String getCentro(){
        return centro;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setNumHoras(int horas){
        this.numhoras=horas;
    }
    
    public void setCentro(String centro){
        this.centro=centro;
    }
    
    
    
    public abstract void numeroHoras( int horas);
    
    public abstract double calcularSueldo();
}

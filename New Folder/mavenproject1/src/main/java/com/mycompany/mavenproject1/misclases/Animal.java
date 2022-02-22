/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.misclases;

/**
 *
 * @author helter
 */
public class Animal {
    
    private String raza;
    private String nombre;
    private int edad;

    public Animal(String nuevoNombre)
    {
        nombre = nuevoNombre; //Se le da un nombre al animal
    }

    //Método para obtener la edad del animal
    public int getEdad()
    {
        return edad;
    }

    //Método para establecer la edad del animal
    public void setEdad(int nuevaEdad)
    {
        edad = nuevaEdad;
    }

    //Método para obtener el nombre del animal
    public String getNombre()
    {
        return nombre;
    }
        //Método para obtener el nombre del animal
    public void setNombre(String nuevoNombre)
    {
         nombre = nuevoNombre;
    }
    
    //Método para obtener el nombre del animal
    public void countAnimals(String animal)
    {
        switch(animal) {
            case "Leon":
                    for(int i = 0; i <= 50; i++)
                    {
                    System.out.print(i  + "\n");

                    }
                    break;
            case "Halcón":
                    for(int i = 0; i <= 30; i++)
                    {
                      System.out.print(i  + "\n");

                    }
                    break;
            case "Tiburón":
                    for(int i = 0; i <= 40; i++)
                    {
                      System.out.print(i  + "\n");

                    }
                    break;
           default:
                System.out.print("Especie no Encontrada  \n");
                break;
        
        }
}


}
    

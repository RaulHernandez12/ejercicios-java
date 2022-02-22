
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.misclases.Animal; //Importamos la clase Animal para poder usarla

public class NewMain {

    
    public static void main(String[] args) {

        
        Animal miAnimal = new Animal("Leon");

        miAnimal.setEdad(3);

        System.out.println("El nombre es: " + miAnimal.getNombre());
        System.out.println(" y tiene " + miAnimal.getEdad() + " años");
        
        // TODO code application logic here
        for(int i = 0; i <= 12; i++)
        {
            System.out.print("-----"+ miAnimal.getNombre() +"-"+i+ "------\n");
            if(i>4)
                 miAnimal.setNombre("Halcón");
            if(i>9)
                miAnimal.setNombre("Tiburón");
            
            miAnimal.countAnimals(miAnimal.getNombre());
        }
        
    }
    
}

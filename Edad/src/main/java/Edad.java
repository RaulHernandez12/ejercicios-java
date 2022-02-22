
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raúl Hernández
 */
public class Edad {
     public static void main (String[] args){ 
        Scanner scn=new Scanner(System.in);
        
        System.out.println("Ingresa año de nacimiento");
        int año=scn.nextInt();
        int edad=2020-año;
        int numero;
        numero=año+edad;
        
        System.out.println("La edad es: "+edad);
        System.out.println("El numero es: "+numero);
                
        
     }
    
}


package main;

import java.util.Scanner;

public class Main {

  
    public static void main(String[] args) {
        Scanner tec;
        tec=new Scanner(System.in);
        double ingreso;
        double retirar;
        int opcion;
         
         
        Cuenta uno;
        uno=new Cuenta();
        
        Cuenta dos;
        dos=new Cuenta("Juan Pedro");
        
        Cuenta tres;
        tres=new Cuenta("Raúl Hernández",1000);
        
        /*System.out.println(uno);
        System.out.println(dos);
        System.out.println(tres);
        
        do{
        System.out.println("Indique la cantidad a ingresar");
        ingreso=tec.nextDouble();
        
        if (ingreso > 0){
            tres.ingresar(ingreso);
        }else
            System.out.println("La cantidad es erronea");
            
        }while( ingreso < 0);
        System.out.println("Indique una cantidad que desea retirar");
        retirar=tec.nextDouble();
        System.out.println(tres.retirar(retirar));*/
        
        
        System.out.println("Menú de consulta de datos");
        System.out.println("Señale 1 para consultar titular");
        System.out.println("Señale 2 para consultar el importe");
        System.out.println("Señale 3 para consultar su saldo de la cuenta");
        System.out.println("Señale 0 para salir");
        System.out.println("¿Qué desea hacer?");
        opcion=tec.nextInt();
        
    }
    
}

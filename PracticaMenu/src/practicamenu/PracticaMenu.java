
package practicamenu;

import java.util.Scanner;


public class PracticaMenu {
    static Scanner teclado;
    
  
    public static void main(String[] args) {
        //VARIABLES
        teclado=new Scanner(System.in);
        int opcion1=-1;
        int opcion=-1;
        float numero1;
        float numero2;
        float resultado;
        int volver;
        
        
            while(opcion<0 || opcion>3){
                System.out.println("Elija una opcion");
                System.out.println();
                System.out.println("1 - Opcion 1");
                System.out.println("2 - Opcion 2");
                System.out.println("3 - Salir");
                opcion=teclado.nextInt();
            
          
        switch (opcion){
            case 1 -> {                
                while(opcion1<0 || opcion1>3){
                    System.out.println();
                    System.out.println("Ha seleccionado la opcion 1");
                    System.out.println();
                    System.out.println("1 - Suma");
                    System.out.println("2 - Resta");
                    System.out.println("3 - Volver");
                    opcion1=teclado.nextInt();
                }
                switch (opcion1){
                    case 1 ->{
                    System.out.println("Ingrese un numero");
                    numero1=teclado.nextFloat();
                    System.out.println("Ingrese otro numero");
                    numero2=teclado.nextFloat();
                    resultado = numero1 + numero2;
                    System.out.println("La suma es "+resultado);
                    break;
                }
                     case 2 ->{
                    System.out.println("Ingrese un numero");
                    numero1=teclado.nextFloat();
                    System.out.println("Ingrese otro numero");
                    numero2=teclado.nextFloat();
                    resultado = numero1 - numero2;
                    System.out.println("La resta es "+resultado);
                    break;
                    }
                     
                     case 3 ->{
                         System.out.println("chao");
                         opcion=20;
                    break;
                        
                     }
                }
            break;
            }
            case 2 ->{
                System.out.println("Has elegido la opción 2");
            break;
            }
            case 3 ->{
                System.out.println("Gracias");
            break;
            }
        }
    
    }
}
}
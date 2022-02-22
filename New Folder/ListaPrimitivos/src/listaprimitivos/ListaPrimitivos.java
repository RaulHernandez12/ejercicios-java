
package listaprimitivos;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class ListaPrimitivos {

 
    public static void main(String[] args) {
        
         /* Tenemos que hacer lo siguiente
            1- Añadir numero
            2- Listar numero
            3- Buscar numero
            4- borrar numero
            5- borrar todos los numeros de la lista
            6- salir de la aplicacion
            introduzca la opcion deseada
        */
        //Creamos la lista
        List<Integer> lista = new ArrayList<Integer>();
        
        //Creamos las variables
        Scanner tec;
        tec = new Scanner(System.in);
        int op=0;
                
     
        //Creamos el menu
        while(op<1 || op>6){
            try{
                System.out.println("¿Que desea hacer?");
                System.out.println("------------------");
                System.out.println("1- Añadir numero");
                System.out.println("2- Listar numeros");
                System.out.println("3- Buscar numeros");
                System.out.println("4- Borrar numeros");
                System.out.println("5- Borrar todos numeros");
                System.out.println("6- Salir");
                op=tec.nextInt();
            
            switch(op){
                
                case 1:
                    Metodos.añadirNumero(lista);
                    op=-1;
                    System.out.println();
                    break;
                
                case 2:
                    Metodos.mostrarNumeros(lista);
                    op=-1;
                    System.out.println();
                    break;
                
                case 3:
                    System.out.println();
                    Metodos.buscarNumero(lista);
                    op=-1;
                    System.out.println();
                    break;
                
                case 4:
                    Metodos.borrarNumero(lista);
                    op=-1;
                    break;
                
                case 5:
                    Metodos.borrarTodos(lista);
                    op=-1;        
                    System.out.println();
                    break;
                    
                
                case 6:
                    System.out.println("GRACIAS");                   
                    break;
                    
            }
            }catch(InputMismatchException e){
                        System.err.println("ERROR ! Debe introducir un numero");
                    }
            op=0;
        }
    }
    
}

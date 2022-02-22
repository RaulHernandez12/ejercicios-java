
package listaprimitivos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Metodos {
  
   
   public static void añadirNumero(List<Integer> l){  
       int n;
       Scanner tec;
       tec=new Scanner(System.in);
       System.out.println("Introduzca un numero");
       n = tec.nextInt();       
       l.add(n);
       System.out.println("La lista tiene ahora mismo "+l.size()+" elementos");
       
   }
   
   public static void mostrarNumeros(List<Integer> l){
     int n;
     if(l.isEmpty()==true){
        
        System.out.println("La lista esta vacia");
        
        }else{        
     Iterator<Integer> mostrar = l.iterator();
     while(mostrar.hasNext()){
     n= mostrar.next();
     System.out.print(n +" ");
        }
     }
   }
   
   public static void buscarNumero(List<Integer> l){
    int n;
    Scanner tec;
    tec=new Scanner(System.in);
    
    if(l.isEmpty()==true){
        
        System.out.println("La lista esta vacia");
        
        }else{        
            System.out.println("Introduzca el numero que quiere buscar");
            n=tec.nextInt();
            l.contains(n);
            if(l.contains(n)==true){
                
                System.out.println("Este numero esta en la lista");
                
            }else{
                 
                System.out.println("Este numero no se encuentra en la lista");
        }
    }
   }
   
   public static void borrarNumero(List<Integer> l){
    Integer n;
    Scanner tec;
    tec=new Scanner(System.in);
    
    if(l.isEmpty()==true){
        
        System.out.println("La lista está vacia");
        
        }else{
        
            System.out.println("Introduzca el numero que quiere borrar");
            n=tec.nextInt();
            l.contains(n);
    
            if(l.contains(n)==true){
                l.remove(n);   
                System.out.println("El numero "+ n + " ha sido eliminado de la lista");    
                System.out.println("La lista ahora es");
                Metodos.mostrarNumeros(l);
             
            }else{
            System.out.println("Este numero no se encuentra en la lista");
            }
        }
   }
   
   public static void borrarTodos(List<Integer> l){
       if(l.isEmpty()==true){
           System.out.println("La lista está vacia");
       }else{
       l.removeAll(l);
       System.out.println("Se han borrado todos los numeros");
       }
   }
   }


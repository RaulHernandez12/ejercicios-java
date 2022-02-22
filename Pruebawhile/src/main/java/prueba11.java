
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
public class prueba11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int N;
        int M;
        int i;
        Scanner tec;
        
        tec=new Scanner(System.in);
        
        do{ 
            System.out.println("Introduzca un numero");
            N=tec.nextInt();
            
            System.out.println("Introudzca otro numero");
            M=tec.nextInt();
            if ((N<0) || M<0)
                System.out.println("Error, introduce numeros positivos");
            if (N>M)
                System.out.println("N tiene que ser menor que M");
        }while ((N  <= 0) || (M <= 0) || (N>M));
         
        for(i=1;i<=M;i++){
            if(i%N!=0) {
           } else {
                System.out.println(i);
           }
        }
       
        
        
      
            }
        
          
        }        
    
    
    


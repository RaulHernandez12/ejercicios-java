
import java.util.Scanner;

/*
 Programa  que  lea  dos  números  enteros  positivos  N  y  M 
y  muestre  los múltiplos  de  N  que  hay  desde  1  hasta  M. 
Por  ejemplo  si  N  =  4  y  M  =  500  el programa mostrará los 
múltiplos de 4 desde 1 hasta 500. El valor de N deberá ser menor que el valor de M.
Si nose introducen valores válidos para N o M se mostrará el mensaje correspondiente y se vuelven a pedir.
 */



public class while11 {

    
   
    public static void main(String[] args) {
        
        int N;
        int M;
        Scanner tec;
        
        tec=new Scanner(System.in);
        
        do{ 
            System.out.println("Introduzca un numero");
            N=tec.nextInt();
            System.out.println("Introudzca otro numero");
            M=tec.nextInt();
        }while (N  < 0 && M < 0);
        
        
          
            
                
            
            
            
            
        }        
    }
    


//Programa que pida que se introduzcan dos números enteros A y B por teclado y muestre 
//los números pares que hay entre A y B. A debe ser menor que B. Si no es así se mostrará 
//un mensaje indicándolo y se vuelven a introducir.
import java.util.Scanner;


public class while10 {

    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        int A,B;
        Scanner tec;
        
        tec=new Scanner(System.in);
        
        do{
            System.out.println("Introduzca numero");
            A=tec.nextInt();
            System.out.println("Introduzca otro numenro");
            B=tec.nextInt();
        } while (A>B);
            int i;
        
        for(i=A;i<=B;i++){
            if(i%2==0);
            System.out.println(i);
        }
            
            
        } 
    }
    


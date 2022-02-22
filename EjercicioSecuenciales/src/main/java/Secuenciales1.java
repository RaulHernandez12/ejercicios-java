
import java.util.Scanner;


public class Secuenciales1 {

    
    public static void main(String[] args) {
        
        //Variables
        
        int A;
        int B;
        Scanner teclado;
        
        // Ejercicio
        teclado=new Scanner(System.in); 
        System.out.println("Ingresa dos numeros");
        A=teclado.nextInt();
        B=teclado.nextInt();
        
        System.out.println("Los números son: "+A+ " y : "+B);
    }
    
}

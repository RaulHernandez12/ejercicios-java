
import java.util.Scanner;


public class Condicionales2 {

    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in); 
        System.out.println("Ingresa un numero");
        int B=scn.nextInt();
       
        
        System.out.println(B+ (B>=0?" es positivo" : " es negativo"));
    }
    
}

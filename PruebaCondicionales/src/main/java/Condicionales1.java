
import java.util.Scanner;


public class Condicionales1 {

   
    public static void main(String[] args) {
       
        Scanner scn=new Scanner(System.in); 
        System.out.println("Ingresa un numero");
        int A=scn.nextInt();
       
        
        System.out.println(A+ (A%2==0?" es par" : " es impar"));
    }
    
}

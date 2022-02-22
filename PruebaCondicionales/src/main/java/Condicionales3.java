
import java.util.Scanner;


public class Condicionales3 {

   
    public static void main(String[] args) {
       Scanner scn=new Scanner(System.in); 
        System.out.println("Ingresa un numero");
        int C=scn.nextInt();
        
       
        System.out.println(C+ (C>=0?" es positivo" : " es negativo"));
        System.out.println(C+ (C%2==0?" es par" : " es impar"));
        System.out.println(C+ (C%5==0?" es multiplo de 5" : " no es multiplo de 5"));
        System.out.println(C+ (C%10==0?" es multiplo de 10" : " no es multiplo de 10"));
        System.out.println(C+ (C>100?" es mayor de 100":(C==100?" es 100":" es menor de 100")));
        
        
    }
    
}

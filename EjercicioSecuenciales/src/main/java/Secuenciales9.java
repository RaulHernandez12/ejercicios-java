
import java.util.Scanner;


public class Secuenciales9 {

    
    public static void main(String[] args) {
       
        Scanner scn=new Scanner(System.in); 
        System.out.println("Ingresa el valor de los 3 lados del triangulo");
        float a=scn.nextFloat();
        float b=scn.nextFloat();
        float c=scn.nextFloat();
        
        float p= (a+b+c)/2;
       
        System.out.println("El area del triangulo es "+ (Math.sqrt(p*(p-a)*(p-b)*(p-c))));
        
    }
    
}

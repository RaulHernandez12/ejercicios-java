
import java.util.Scanner;


public class Secuenciales4 {

   
    public static void main(String[] args) {
        
        float F;
        Scanner scn=new Scanner(System.in); 
        System.out.println("Indique la temperatura acutal en ºC: ");
        float C=scn.nextFloat();
        
        System.out.println("La temperatura en Fahrenheit es "+(F = 32 + ( 9 * C / 5)));
    }
    
}

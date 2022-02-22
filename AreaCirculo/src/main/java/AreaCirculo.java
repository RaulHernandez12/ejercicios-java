
import java.util.Scanner;


public class AreaCirculo {
   
    public static void main (String[] args){ 
        
        Scanner scn=new Scanner(System.in); 
        System.out.println("Ingresar radio");
        double radio=scn.nextDouble();
        
        double area;
        
        System.out.println("El area es : "+(area=3.14*radio*radio));
    }
    
}

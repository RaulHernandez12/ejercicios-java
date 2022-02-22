
import java.util.Scanner;


public class ifelse2 {


    public static void main(String[] args) {
        
        //variables
        char a;
        Scanner tecl;
        tecl=new Scanner(System.in);
        
        //ejercicio 
        System.out.println("Igrese una letra");
        a=tecl.nextLine().charAt(0);
        
        if (Character.isUpperCase(a)){
            System.out.println("La letra "+a+" es mayúscula");
        }
        else{
            System.out.println("La letra "+a+" es minúscula");
        }
            
        
        
      
    }
    
}

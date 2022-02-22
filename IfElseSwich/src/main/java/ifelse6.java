
import java.util.Scanner;


public class ifelse6 {

    
    public static void main(String[] args) {
        
        int A;
        int B;
        int division;
        
        Scanner tec;
        
        tec=new Scanner(System.in);
        System.out.println("Ingresa 2 numeros");
        A=tec.nextInt();
        B=tec.nextInt(); 
        division =A/B;
        
       if (B==0){
       System.out.println("Error el divisor es 0");
       }
       else{
       System.out.println("El resultado es: "+division);
       }
    }
    
}

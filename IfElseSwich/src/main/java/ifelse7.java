
import java.util.Scanner;


public class ifelse7 {

  
    public static void main(String[] args) {
        
        int A;
        int B;
        int C;
        Scanner tec;
        
        tec=new Scanner(System.in);
        
        System.out.println("Ingresa 3 números");
        A=tec.nextInt();
        B=tec.nextInt();
        C=tec.nextInt();
        
        if ((A > B) && (A > C)){
            System.out.println("El numero mayor es: "+A);
        }
            if ((B > A) && (B > C)){
                System.out.println("El mayor es :"+B);
        }
            else{
            System.out.println("El numero mayor es : "+C);
            
            }
            
           
            
        }
        
       
    }
    


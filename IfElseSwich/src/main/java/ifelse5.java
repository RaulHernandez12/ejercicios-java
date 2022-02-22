
import java.util.Scanner;


public class ifelse5 {

    public static void main(String[] args) {
        
        char A;
        Scanner tec;
        
        tec=new Scanner(System.in);
        System.out.println("Intrduzca una letra o un número");
        A=tec.nextLine().charAt(0);
        
        if (Character.isDigit(A)){
            System.out.println("Lo que ha introducido es un número");    
        }
        else{
            System.out.println("Lo que ha introducido es una letra");
        }
    }
    
}

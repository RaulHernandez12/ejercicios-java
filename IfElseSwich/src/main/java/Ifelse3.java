
import java.util.Scanner;





public class Ifelse3 {

    
    public static void main(String[] args) {
        
        char A;
        char B;
        Scanner tec;
        
        tec=new Scanner(System.in);
        System.out.println("Introduzca 2 caracteres");
        A=tec.nextLine().charAt(0);
        B=tec.nextLine().charAt(0);
        
        if (A==B){
        System.out.println("Las dos letras son iguales");
        }
        else{
        System.out.println("Las letras son diferentes");
        }
        
       
    }
    
}

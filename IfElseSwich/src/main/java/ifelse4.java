
import java.util.Scanner;


public class ifelse4 {

  
    public static void main(String[] args) {
        char A;
        char B;
        Scanner tec;
        
        tec=new Scanner(System.in);
        System.out.println("Introduzca 2 caracteres");
        A=tec.nextLine().charAt(0);
        B=tec.nextLine().charAt(0);

        if (Character.isLowerCase(B)&& Character.isLowerCase(A)){
            
            System.out.println("Las letras son minusculas");
        }
        else{
            System.out.println("Una de las letras o ambas no son minuscula");
        }
        
    }
    
}

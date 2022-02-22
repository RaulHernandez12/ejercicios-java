
import javax.swing.JOptionPane;


public class IfElse1 {

 
    public static void main(String[] args) {
     int A;
     
     
     String numero= JOptionPane.showInputDialog(null,"Intruduzca un numero");
     A= Integer.parseInt(numero);
     
     if(A%2==0){
        System.out.println("El numero es par");
        }
     else{
         System.out.println("El numero es impar");
     }
    }
    
}

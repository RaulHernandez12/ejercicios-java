
import javax.swing.JOptionPane;


public class Joptionraizcuadrada {

   
    public static void main(String[] args) {
        String numero;
        double raiz;
        double resultado;
        
        numero= JOptionPane.showInputDialog("Introduzca un numero");
        raiz= Double.parseDouble(numero);
        resultado= Math.sqrt(raiz);
        
        System.out.println("La raíz cuadrada de "+raiz+" es: "+resultado);
    }
    
}


import javax.swing.JOptionPane;


public class Joption1 {
    
    public static void main(String[] args) {
        
        String edad;
        String nombre;
        int num_edad;
        
        nombre= JOptionPane.showInputDialog("Intruduce un nombre");
        edad = JOptionPane.showInputDialog("Introduce una edad");
        num_edad=Integer.parseInt(edad);
        num_edad++;
        
        System.out.println("El nombre es "+nombre+" y la edad es "+ num_edad);
    }
    
}

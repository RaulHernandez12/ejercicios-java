
public class Ejercicio1 {

  
    public static void main(String[] args) {
        boolean X = true, Y= false, Z = true;
        
        System.out.println((X && Y) || (X && Z)); //  ( 0 ) || (1) = true 
        System.out.println((X || !Y)&& (!X || Z)); //  (1) && (1) = true // primero hacemos los parentesis
        System.out.println(X || Y && Z); // true
        System.out.println(!(X || Y) && Z); // 0 && 1 = false
        System.out.println(X || Y || X && !Z && !Y); //  es true ya que primero tenemos que hacer las && y luego || 
        System.out.println(!X || !Y || Z && X && !Y);// lo mismo que el anterior 
    }
    
}


public class Ejercicio2 {


    public static void main(String[] args) {
      
        boolean W = false, X = true, Y =true, Z = false;
        
        System.out.println( W || Y && X && W || Z); // false
        System.out.println( X && !Y && !X || !W && Y); // true
        System.out.println(!(W || !Y) && X || Z );// true
        System.out.println( X && Y && W || Z || X); // true
        System.out.println( Y || !(Y || Z && W) ); // true
        System.out.println( !X && Y && (!Z || !X)); // ( false && true && ( true || false) ; (false && true) && true ; (false && true) = false
    }
    
}

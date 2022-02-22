
public class Ejercicio1 {


    public static void main(String[] args) {
        
        int a=8, b=3, c= -5;
        
         System.out.println(a + b + c); // 6
         System.out.println(2 * b + 3 * (a - c)); // 6 + 39 = 45
         System.out.println(a / b ); // al ser numeros enteros te redondea la division y muestra 2
         System.out.println( a % b); // el resto es 2
         System.out.println( a / c ); // redondea y muestra -1
         System.out.println( a % c); // no entiendo porque pone 3 y no -3
         System.out.println( a * b / c ); //muestra -4
         System.out.println( a * (b / c));  // 3 entre - 5 igual a 0 con algo redondea a 0 x 8 = 0
         System.out.println( (a * c) % b ); // ????
         System.out.println( a * (c % b)); // -2 x 8 = -16
         System.out.println((3 * a - 2 * b) % (2 * a - c)); // 18 resto 21 ??
         System.out.println( 2 * ( a / 5 + (4 - b * 3)) %(a + c - 2)); // 1 + 5 = 6 ; 2 * 6 = 12 entre 1 = 12 y resto = 0;
         System.out.println( (a - 3 * b) % (c + 2 * a) / (a - c) );//  (-1) % (11) / (12) 
         System.out.println( a - b - c * 2); // 8 - 3 - -10 = 15
    }
    
}

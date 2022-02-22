
public class PruebaMain2 {
    
    public static void main(String[] args) {
        char A = 'c'; // c en tabla assci = 99
        char B;
        System.out.println(A++); // muestra 99 y suma luego = 100  muestra = c
        System.out.println(A++); // muestra 100 y suma luego = 101 muestra = d
        System.out.println(++A); // 102 muestra = f
        B = --A; // b=101  a =101
        System.out.println(++A); // 102 = f
        A++; // 103
        --B; // 100
        System.out.println(B++); // muestra 100 y suma luego = 101 =d
        System.out.println(++B); // 102 = f
        System.out.println(++A); // 104 = h
        System.out.println(B--); // muestra 102 y luego resta = 101 = f
        System.out.println(A); // 104 = h
        System.out.println(B); // 101 = e
    }
    
}

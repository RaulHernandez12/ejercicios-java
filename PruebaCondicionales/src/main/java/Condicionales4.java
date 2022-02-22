
public class Condicionales4 {

    
    public static void main(String[] args) {
        int i= 8, j=5, k;
        float x = 0.005F, y = -0.01F, z;
        char a, b = 'p', c = 'q';
        
        System.out.println(k =(j == 5)? i : j );// como j es igual a 5 nos mostraria k=i que es 8
        System.out.println(k = (j > 5) ? i : j);// como j no es mayor que 5 nos mostraria k=j que es 5
        System.out.println(z = (x >= 0) ? x : 0);// como x es mayor que 0 nos muestra que z=x que es 0.005
        System.out.println(z = (y >= 0) ? y : 0);// como y es menor que 0 no muestra z=0 
        System.out.println(a = (b < c) ? b : c);// como b(p) es menor que c(q) a seria  a=b por lo que nos mostraria p
        System.out.println(k = (j > 0) ? j : 0);// como j es mayor que 0, k=j que es 5
        System.out.println(k = (i > 0&& j > 0) ? 0: 1); // como i es mayor 0 y j es mayor 0 seria verdad y verdad por lo que k=0
        System.out.println (k = (y > 0|| x > 0) ? i + 1: i -1); // como y es menor que 0 (falso) o x es mayor que 0( verdad), k=i+1 =9
        System.out.println (a = (b < 'c') ? b : c); // como b(p) es mayor que 'c', a=c(q)
        System.out.println (a = (b >= c) ? b : 'r'); // como b(p) es menor que c(q) seria falso y nos mostraria 'r'
    }
    
}

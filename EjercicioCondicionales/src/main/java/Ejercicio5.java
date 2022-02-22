
public class Ejercicio5 {

  
    public static void main(String[] args) {
       int i = 1, j = 1, k = 1, x; 
       
       x = (j >= 0&& k > 1) ? ++j : k+1; // j = verdad  k= falso 1x0 = 0 ; entonces nos mostraria k + 1 que es = 2 
       System.out.println(x);
      
      x = (j > 1|| k >= 1) ? j+3: k+1;// j = falso k= verdad 0 + 1 =1 ; entonces nos mostraria j + 3 = 4
      System.out.println(x);
      
      x = (j >= 1&& i <= 1) ? 10: 20; // verdad verdad = verdad ; entonces muestra 10
      System.out.println(x);
      
      x = (i + j  > 2|| k < 1) ? 2: 4;// falso falso = falso ; entonces muestra 4
      System.out.println(x);
      
      x = (3/2> i) ? j+5: k; // la division redondea a 1 entonces es falso y nos muestra k = 1
      System.out.println(x);
      
      x = (3% 2> i) ? j++ : ++k; // el resultado es falso = 2
      System.out.println(x);
      
      x = (i + 10<= j + 10|| k == 0) ? -1:-2; //  verdad , falso = verdad y muestra -1
      System.out.println(x);
       
      x = (i == 0|| j == 1|| k == 2) ? 0:5;// falso, verdad, falso = verdad y muestra 0
      System.out.println(x);
       
      x = ((i == 0 || j == 1) && k == 2) ? 0: 5; // ??
      System.out.println(x);
       
      x = (i != 0|| j == 1&& k == 2) ? 0:5;  // verdad, verdad, falso 
      System.out.println(x);
      
      
    }
    
}

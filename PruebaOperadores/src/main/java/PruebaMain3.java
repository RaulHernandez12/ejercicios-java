
public class PruebaMain3 {

    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int k = 1;
      
        System.out.println(i = ++j); // i valdria 2 y j valdria 2
        System.out.println(i = k++);// nos muestra 1 pero tanto i como k valdrian dos pero al tener el ++ despues de la k no nos lo muestra en pantalla
        System.out.println(i = k + ++j); // nos muestra 5 ya que k vale 2 y j vale 2 +1 por lo tanto i = 5
        System.out.println(i = i + j++); // nos muestra 8 pero en realidad valdria 9 ya que seria i=5 + j = 3 +1 pero no nos lo muestra ya que el ++ esta detras de la j
        System.out.println(i = j + ++k);// nos muestra 7 ya que j es igual 4 y k vale 3
        System.out.println(i = ++j + k++);// nos muestra 8 peroya que j = 5 y k = 3 que en realidad seria k = 4 pero no se muestra en pantalla porque va detras el ++
        System.out.println( j = k--+ --i);// j valdria 11 porque k valdria 4 pero en realidad seria 3 ya que el - esta despues e i valdria 7
        System.out.println(i = k + 1 + ++j);// i valdria 16 ya que k vale 3 y j valdria 12, mas el 1 =16
        System.out.println(i = ++i + --j + k--); // el valor de i es igual a 31 ya que i valdria 17 , j valdria 11 y el valor de k 3 pero en realidad valdria 2
        System.out.println(k = j-- + ++k);// el valor de k seria igual a     ya que j valdria 11 pero en realidad seria 10 y el valor de k seria 3
    }
    
}

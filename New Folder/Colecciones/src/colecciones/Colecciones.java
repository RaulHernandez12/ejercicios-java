
package colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class Colecciones {

    
    public static void main(String[] args) {
        
        List <String> Coleccion;
        Coleccion=new ArrayList <String>() ;
        
        Coleccion.add("Manzana");
        Coleccion.add("Pera");
        Coleccion.add("Limon");
        System.out.println(Coleccion);
        Coleccion.remove("Pera");
        System.out.println(Coleccion);
       
        if(Coleccion.contains("Manzana")==true){
            System.out.println("Si esta");
        }else
            System.out.print("No esta");
    }
    
}

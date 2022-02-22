
package claseabstracta;


public class Colegio {

   
    public static void main(String[] args) {
         Alumno a1 = new Alumno("Raul","Hernandez", 30,"2ºB","informatica");
        Profesor prof1= new Profesor("Alejando","Moreno",26,1000,"Jefatura");
        
        
       
        a1.Mostrar();
        prof1.Mostrar();
       
        System.out.println(a1.getNombre());
        System.out.println(prof1.getNombre());
    }
    
}

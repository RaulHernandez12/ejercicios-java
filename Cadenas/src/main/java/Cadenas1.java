
public class Cadenas1 {

   
    public static void main(String[] args) {
        //Variables
        
        String Cadena;
        Cadena="Raúl Hernández Cabello";
        
        //Ejercicio
        System.out.println("La longitud de la cadena es "+Cadena.length());
        System.out.println("El primer apellido es:" +Cadena.substring(5,14));
        System.out.println("El Segundo apellido es:" +Cadena.substring(15,22));
        System.out.println("La primera letra del primer apellido es: "+Cadena.charAt(5));
        System.out.println("La primera letra del segundo apellido es: "+Cadena.charAt(15));
    }
    
}

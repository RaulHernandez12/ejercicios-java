
package ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Ficheros {

    public static void main(String[] args){
        
        leerFichero();
        
    }//MAIN
    
    public static void leerFichero(){
        
        int caracter; //es entero porque lee 
        char letra;
        
        
        try{
            FileReader entrada = new FileReader("C:\\Users\\Raul\\Desktop\\fichero1.txt");
            caracter=entrada.read();
            letra=(char)caracter;
        while(caracter != -1){
            System.out.print(letra);
            caracter=entrada.read();
            letra=(char)caracter;
        }//Fin del while
            
        }catch(FileNotFoundException ex){
            System.out.println("Fichero no encontrado");
        }catch(IOException ex){
            System.out.println("Error de lectura");
        }
  
        
    
    }//FIN DEL METODO LEER
}

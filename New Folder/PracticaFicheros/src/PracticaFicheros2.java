
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class PracticaFicheros2 {

        /*2.Crea un fichero de texto con el nombre y el contenido que tú quieras.
        Haz un programa que lea este fichero de texto carácter a carácter y muestre su contenido por pantalla sin espacios en blanco. 
        Por ejemplo, si el fichero tiene el siguiente texto “Hola soy yo”, deberá mostrar “Holasoyyo”.*/
    public static void main(String[] args) {
       
        leer();
    }//MAIN
    
    public static void leer(){// creamos un metodo para leer el archivo
        //Declaramos las variables
        String ruta = "C:\\Users\\Raul\\Desktop\\practica.txt";// creamos un string con la ruta del archivo para posteriormente pasarselo al FileReader
        int caracter;// creamos un int caracter que luego le haremos un casting a char
        char letra;// creamos un char letra al cual le pasaremos el casting del int caracter
       
        try{
            //Creamos el FileReader
            FileReader leer= new FileReader(ruta);// creamos un filereader para leer caracteres y le pasamos la ruta guardada anteriormente
            caracter=leer.read();//leemos un caracter
            letra=(char)caracter;//hacemos el casting a char y lo guardamos en letra
        
            while(caracter != -1){// hacemos un bucle que hasta que el int caracter no valga -1 (final de archivo) nos haga lo siguiente
                
                caracter=leer.read();// leemos un caracter(int)
                letra=(char)caracter;// hacemos casting y lo guardamos en letra
                if(caracter!=32){                
                
                 System.out.print(letra);// si letra no es un espacio nos lo muestra por pantalla
                }
               
            }//Fin del while
            System.out.println();
        }catch(FileNotFoundException ex){
            System.out.println("El fichero no se ha encontrado");
        }catch(IOException ex){
            System.out.println("Error de lectura");
        }
            
        
    }
}//CLASS

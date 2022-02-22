
package practicaficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*1.Realizar un programa que, a partir de dos ficheros, cree un nuevo fichero con el contenido de ambos teniendo en cuenta las siguientes consideraciones:
-El programa debe pedir al usuario la ruta del primer fichero y la ruta del segundo fichero.
-El tercer fichero se llamará FICHEROUNION y vamos a hacer dos versiones:
Copiar los datos del primer fichero y a continuación el contenido del segundofichero. 
Copiar una línea del primer fichero y otra del segundo fichero de manera que el tercer fichero tendrá los datos mezclados línea a línea.
-Hay que tener en cuenta que los ficheros de donde se van cogiendo las líneas pueden tener tamaños diferentes.*/

public class PracticaFicheros {

   
    public static void main(String[] args) {
        
        //unirDatos();// Este metodo nos pone primero los datos del fichero uno y luego los del fichero dos en el el fichero union
        mezclarDatos();// Este metodo introduce las lineas del fichero 1 y fichero 2 intercaladas en el fichero 3
    }//MAIN
    
    
    
        
    public static void unirDatos(){ //Este lo vamos a hacer sin bufered 
        //Creamos las variables
        Scanner tec;
        tec=new Scanner(System.in);
        String ruta1;
        String ruta2;
        String ruta3 = "C:\\Users\\Raul\\Desktop\\ficherounion.txt";// hacemos una variable con la ruta del fichero de union
        int caracter1; //es entero porque lee
        int caracter2;
        char letra;
        char letra2;
        
        try{
            System.out.println("Introduzca la ruta del fichero 1");//Pedimos la ruta del fichero uno
            ruta1=tec.nextLine();//guardamos la ruta
            FileReader leer=new FileReader(ruta1);//creamos el objeto con la ruta del fichero
            caracter1=leer.read();//leemos el primer caracter del fichero que es un entero
            letra=(char)caracter1;// pasamos el entero a caracter
            System.out.println("Introduzca la ruta del fichero 2");
            ruta2=tec.nextLine();   
            FileReader leer2=new FileReader(ruta2);
            caracter2=leer2.read();
            letra2=(char)caracter2;
            FileWriter escribir = new FileWriter (ruta3);// creamos el objeto con la variable ruta3 que contiene la ruta del fichero de union
            while(caracter1 != -1){// hacemos un bucle el cual nos lee un entero lo pasa a cacter y lo pasa al fichero 3, esto nos pasaria del fichero 1 al fichero de union     
                caracter1=leer.read();
                letra=(char)caracter1;
                escribir.write(letra);
                escribir.flush();
            }//Fin del while
            escribir.write(10);
            System.out.println();
            while(caracter2 != -1){ // hacemos otro bucle que nos pase del fichero dos al fichero union           
                caracter2=leer2.read();
                letra2=(char)caracter2;
                escribir.write(letra2);
                
            }//Fin del while
            escribir.flush();
            escribir.close();
        }catch(FileNotFoundException ex){
            System.out.println("El fichero no se ha encontrado");
        }catch(IOException ex){
            System.out.println("Error de lectura");
        }
    }
    
    public static void mezclarDatos(){
         //Creamos las variables
        Scanner tec;
        tec=new Scanner(System.in);
        String ruta1;
        String ruta2;
        String ruta3 = "C:\\Users\\Raul\\Desktop\\ficherounion.txt";// hacemos una variable con la ruta del fichero de union
        String linea1 = "";
        String linea2 = "";
        
        
        try{
            BufferedWriter escribir= new BufferedWriter(new FileWriter(ruta3));
            System.out.println("Introduzca la ruta del fichero 1");//Pedimos la ruta del fichero uno
            ruta1=tec.nextLine();//guardamos la ruta
            BufferedReader leer=new BufferedReader(new FileReader(ruta1));    
            System.out.println("Introduzca la ruta del fichero 2");
            ruta2=tec.nextLine(); 
            BufferedReader leer1=new BufferedReader(new FileReader(ruta2));
            
            linea1=leer.readLine();
            linea2=leer1.readLine();
            while(linea1!= null && linea2 != null){              
                escribir.write(linea1);
                linea1=leer.readLine();
                escribir.write(10);                             
                escribir.write(linea2);
                linea2=leer1.readLine();
                escribir.write(10);
            }
            
            escribir.flush();// guardamos
            escribir.close();// cerramos
            
        }catch(FileNotFoundException ex){
            System.out.println("El fichero no se ha encontrado");
        }catch(IOException ex){
            System.out.println("Error de lectura");
        }
    }    
}//CLASS

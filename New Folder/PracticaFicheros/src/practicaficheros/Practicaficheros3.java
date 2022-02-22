
package practicaficheros;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Practicaficheros3 {
    
    /*3.Hacer  un  programa  que  escriba  en  un  fichero  una  cantidad  de  números aleatorios entre  0  y  100 que  indique  el  usuario.  
    Por  ejemplo,  le  pedimos  al usuario  que  introduzca  la  cantidad  de  números  aleatorios  a  generar.
    Si Tema 13 14: FICHEROS Y OPERACIONES SOBRE ELLOS2introduce  15,  
    generaremos  15  números  aleatorios  entre  0  y  100  que  se escribirán en un fichero. 
    Escribirlos  números  usando un  DataOutputStream  y mostrarlospor  pantalla leyéndolos con un DataInputStream.
    Cada  vez  que  ejecutemos  la  aplicación  añadiremos  números  al  fichero  sin borrar  los  anteriores, es  decir, 
    si  cuando creamosel fichero se   añadieron  5 números  y  después  añadimos 10  números más,
    en  el  fichero  habrá  20 números que serán mostrados por pantalla*/
    public static void main(String[] args) {
        
        escribirNumeros();
        leerArchivo();
        
    }//MAIN
    
    
    public static void escribirNumeros(){//metodo para escribir los numeros en el fichero
    //Declaramos las variables
    Scanner tec = new Scanner(System.in);    
    int numeros;
    Random r=new Random();//creamos un objeto random que nos genere los numeros aleatorios
    int i;
    System.out.println("Cuantos numeros quiere generar?");//le pedimos al usuario la cantidad de numeros que quiere generar
    numeros=tec.nextInt();//guardamos los numeros
    
    try{
        FileOutputStream fos=new FileOutputStream("C:\\Users\\Raul\\Desktop\\archivo.txt",true);// creamos un fileoutput con la ruta del archivo y el true que sirve para que no se borre cada vez que iniciamos el programa
        DataOutputStream dos=new DataOutputStream(fos);
        
        for(i=0;i<numeros;i++){// creamos un bucle que nos escriba en el fichero hasta los numeros que ha introducido el usuario
            dos.writeInt(r.nextInt(100));//le indrodicos el 100 entre parentesis para que los numeros vayan del 0 al 100 
        }
        
        dos.flush();//guardamos el fichero
        dos.close();//cerramos el fichero
    }catch(FileNotFoundException ex){
        System.out.println("No se encuentra el archivo");
    }catch(IOException ex){
        System.out.println("Error de lectura");
    }
    }

    public static void leerArchivo(){//metodo para leer los numeros del archivo y mostrarlos por pantalla
    boolean finArchivo = false;// creamos un boolean false para luego usarlo en el bucle
        
    try{
        FileInputStream fis=new FileInputStream("C:\\Users\\Raul\\Desktop\\archivo.txt");
        DataInputStream dis=new DataInputStream(fis);
        while(!finArchivo){//hacemos un bucle que mientras que fin de archivo sea falso  este leyendo numeros, cuando no hay mas numeros nos salta la excepcion de EOF(fin de archivo) y entonces finArchivo para a ser true y se sale del bucle
            
            System.out.println(dis.readInt());
        }
        
        dis.close();
    }catch(EOFException ex){
        finArchivo = true;
     
    }catch(FileNotFoundException ex){
        System.out.println("No se encuentra el archivo");
    }catch(IOException ex){
        System.out.println("Error de lectura del archivo");
    }       
   }
}//CLASS

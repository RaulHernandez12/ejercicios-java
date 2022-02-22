
package personamain;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class PersonaMain {

   
    public static void main(String[] args) {    
        escribir();
        leer();
        
    }
    
    public static void escribir(){
            Persona p;
            
        try{
            FileOutputStream fos= new FileOutputStream("C:\\Users\\Raul\\Desktop\\personas.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            p= new Persona("76652179X","Raul",28);
            oos.writeObject(p);
            p= new Persona("80080012R","Juan",30);
            oos.writeObject(p);
            p= new Persona("10010012T","Alex",26);
            oos.writeObject(p);
            p= new Persona("20020045P","David",20);
            oos.writeObject(p);
            
            oos.flush();
            oos.close();
            fos.close();
            
            
        }catch(FileNotFoundException ex){
            System.out.println("No se ha encontrado el archivo");
        }catch(IOException ex){
            System.out.println("Error al leer el archivo");
        }
    }
    
    public static void leer(){
        boolean finArchivo = false;
        try{
            FileInputStream fis= new FileInputStream("C:\\Users\\Raul\\Desktop\\personas.dat");
            ObjectInputStream leer=new ObjectInputStream(fis);
            while(!finArchivo){//hacemos un bucle que mientras que fin de archivo sea falso  este leyendo numeros, cuando no hay mas numeros nos salta la excepcion de EOF(fin de archivo) y entonces finArchivo para a ser true y se sale del bucle
            
            System.out.println(leer.readObject());
                
        }
            leer.close(); 
        }catch(EOFException ex){
            finArchivo = true;    
        }catch(FileNotFoundException ex){
            System.out.println("No se ha encontrado el archivo");
        }catch(IOException ex){
            System.out.println("Error al leer el archivo");
        }catch(ClassNotFoundException ex){
            System.out.println("Clase no encontrada");
        }
        
        
    }
}

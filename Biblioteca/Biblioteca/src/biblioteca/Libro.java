
package biblioteca;

import java.util.Scanner;


public class Libro {
    
    //Creamos los atributos
    private String titulo;
    private String autor;
    private String ISBN;
    
    //Creamos el constructor por defecto sin parámetros
public Libro(){
    
    titulo="";
    autor="";
    ISBN="";
}
    
    //Creamos un constructor con los 3 parámetros
public Libro(String titulo, String autor, String ISBN){
   
    this.titulo=titulo;
    this.autor=autor;                                   
    if (ISBNcorrecto(ISBN)){        
        this.ISBN=ISBN;
    }
    else{
        System.out.println("El ISBN no es correcto");
    }
}




   //Creamos los get y los set (en este caso consulta y cambia)

    //Primero creamos los consulta
   public String consultaTitulo(){
       return titulo;
   }
   
   public String consultaAutor (){
       return autor;
   }
   
   public String consultaISBN (){
       return ISBN;
   }
    
   //Ahora creamos los métodos cambia
   
   public void cambiaTitulo(String titulo){
       this.titulo=titulo;
   }
   
   public void cambiaAutor (String autor){
       this.autor=autor;
   }
   
   public void cambiaISBN (String ISBN){
       if (ISBNcorrecto(ISBN)){        
        this.ISBN=ISBN;
    }
    else{
        System.out.println("El ISBN no es correcto");
    }
       
   }
   
   //Creamos toString
   
   @Override
    public String toString() {
        String mensaje= " El titulo del libro es "+ this.consultaTitulo() + " el autor es "+ this.consultaAutor() + " el ISBN es "+ this.consultaISBN();
        return mensaje;
        
    }
   
   //Creamos el metodo privado de la clase libro que luego utilizaremos en la clase principal a través del constructor y el set
    
    
    private boolean ISBNcorrecto(String ISBN){
        Scanner teclado;
        teclado=new Scanner(System.in);
        int longitud;
        int i;
        int n=0;
        int posicion=1;
        int suma = 0;
        char k= '-';
        longitud= ISBN.length();
        
        for(i=0;i<longitud;i++){
            if (ISBN.charAt(i) == k){
                
            }else
            n=ISBN.charAt(i);
            suma=suma+(n-48)*posicion;
            posicion++;
        } //cierre del for    
            if (suma%11==0){
            return true;
            }
            else               
            return false;
       
    }


        
}



    
    
    
    
    
    
    
    
    
    
    
    
    


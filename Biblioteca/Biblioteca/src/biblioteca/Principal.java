
package biblioteca;

import java.util.Scanner;


public class Principal {
    
        
        
 
    public static void main(String[] args) {
        
        //Creamos objetos y variables
        int opcion = -2;
        int opcion1 = -1;
        int opcion2 = -1;
        Scanner teclado;
        teclado=new Scanner(System.in);
        Libro Libro1;
        Libro1 = new Libro("El principito","Juan Perez", " 02-20-4502-10");
        String tituloMain;
        String autorMain;
        String ISBNMain;
        
        
        //Creamos el menu
        
         while(opcion<0 || opcion>2){ //Creamos el primer menu , mientras se meta un numero menor que 0 o mayor que 2 seguira saliendo este menu
            System.out.println("Menu de opciones");
            System.out.println("-------------");
            System.out.println("1 - Introducir datos del libro");
            System.out.println("2 - Consultar datos del libro");
            System.out.println("0 - salir");
            System.out.println("-------------");
            System.out.println("¿Qué desea hacer?");
            opcion=teclado.nextInt();
         }
       
            switch(opcion){

                case 1 -> {
                    while(opcion1<0 || opcion1>4){
                        
                        System.out.println("Introducir datos");
                        System.out.println("-------------");
                        System.out.println("1 - Introducir titulo del libro");
                        System.out.println("2 - Introducir autor del libro");
                        System.out.println("3 - Introducir ISBN del libro");
                        System.out.println("4 - Introducir todos los datos del libro");
                        System.out.println("0 - Salir");
                        System.out.println("-------------");
                        System.out.println("¿Qué desea hacer?");
                        opcion1=teclado.nextInt();
                    }

                    switch(opcion1){
                        case 1 -> {
                            System.out.println("Introduzca el titulo");
                            tituloMain=teclado.next();
                        }
                        case 2 -> { 
                            System.out.println("Introduzca el autor");
                            autorMain=teclado.next();
                        }
                        case 3 -> {
                            System.out.println("Introduzca el ISBN");  
                            ISBNMain=teclado.next();
                            Libro1.cambiaISBN(ISBNMain);
                            System.out.println("EL ISBN es"+Libro1.consultaISBN());
                        }
                        case 4 -> {
                            System.out.println("Introduzca el titulo");
                            tituloMain=teclado.next();
                            Libro1.cambiaTitulo(tituloMain);
                            System.out.println("Introduzca el autor");
                            autorMain=teclado.next();
                            Libro1.cambiaAutor(autorMain);
                            System.out.println("Introduzca el ISBN");  
                            ISBNMain=teclado.next();
                            Libro1.cambiaISBN(ISBNMain);
                        }
                        case 0 -> {
                            System.out.println("Hasta pronto");
                            opcion1=17;
                        }
                    }
                }

                case 2 -> {
                    
                    while(opcion2<0 || opcion2>5){
                        System.out.println("Mostrar datos");
                        System.out.println("-------------");
                        System.out.println("1 - Mostrar titulo del libro");
                        System.out.println("2 - Mostrar autor del libro");
                        System.out.println("3 - Mostrar ISBN del libro");
                        System.out.println("4 - Mostrar todos los datos del libro");
                        System.out.println("0 - Salir");
                        System.out.println("-------------");
                        System.out.println("¿Qué desea hacer?");
                        opcion2=teclado.nextInt();
                    }
                        switch(opcion2){
                        case 1 -> {
                            System.out.println("Mostrar el titulo"+Libro1.consultaTitulo());                           
                        }
                        case 2 -> { 
                            System.out.println("Mostrar el autor"+Libro1.consultaAutor());                          
                        }
                        case 3 -> {
                            System.out.println("Muestra el ISBN"+Libro1.consultaISBN());                              
                        }
                        case 4 -> {
                             System.out.println(Libro1);
                        }
                        case 0 -> {
                            System.out.println("Hasta pronto");
                            opcion2=10;
                        }
                    }
                    }

                case 0 -> {
                    System.out.println("Hasta pronto");
                    opcion=10;
                    
                }        
            }        
    }
}

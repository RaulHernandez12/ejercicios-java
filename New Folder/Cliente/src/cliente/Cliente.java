
package cliente;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Cliente {
         
    public static boolean telefonoCorrecto(long telefono){
        
        if(telefono > 600000000 && telefono <700000000 || telefono > 900000000 && telefono < 1000000000){
            System.out.println("Telefono correcto");
        return true;
        }
        System.err.println("Telefono incorrecto");
       return false;               
    }
    
    public static boolean NIFCorrecto(String NIF){
               
        //Hacemos una
        if(NIF.length()<9 || NIF.length() >9){
            System.err.println("NIF Incorrecto, el numero de caracteres no se corresponde con los de un NIF");
            return false;
        }
        
        
        //Declaramos variables
        int i;
        String letras;
        letras = "TRWAGMYFPDXBNJZSQVHLCKE";        
        NIF = NIF.toUpperCase();//Pasamos el DNI a a mayusculas
        char letraNIF;
        letraNIF= NIF.charAt(8);//cogemos la letra del DNI
        
        String Numeros;
        Numeros= NIF.substring(0,8); // Cogemos los numeros solamente del DNI
        
        i = Integer.parseInt(Numeros) % 23; // Al hacer este calculo nos da la letra correcta del NIF de la cadena de letras
        return letraNIF == letras.charAt(i); // La letra de la cadena de letras pasa a ser la letra del NIF y si no se corresponde 
    }
    
    //Creamos un metodo para añadir los clientes  
    public static void añadirCliente(List<ListaCliente> lista){
        //Creamos un objeto de la clase cliente
        ListaCliente cliente;
        cliente = new ListaCliente();
    
        //Declaramos variables
        int op = 0;
        String NIF;
        String Nombre;
        long telefono;
        String direccion;
        double deuda;
        
        //Creamos el Scanner para introducir los datos
        
      
        //Introducimos todos los datos
        do{
            Scanner tec;
            tec=new Scanner(System.in);
            System.out.println("Añade un NIF");
            NIF=tec.nextLine();
            if(NIFCorrecto(NIF)==true){
            cliente.setNIF(NIF);
            op=7;
            }
        }while(op!=7);  
        
        Scanner tec;
        tec=new Scanner(System.in);
        System.out.println("Añade un Nombre");
        Nombre=tec.nextLine();
        cliente.setNombre(Nombre);
        
        op=0;
        do{
            
            tec=new Scanner(System.in);
            System.out.println("Añade un telefono");
            telefono=tec.nextLong();
            if(telefonoCorrecto(telefono)==true){
                cliente.setTelefono(telefono);
                op=7;
            }            
        }while(op!=7);
      
      tec=new Scanner(System.in);
      System.out.println("Añade una direccion");
      direccion=tec.nextLine();
      cliente.setDireccion(direccion);
      
      tec=new Scanner(System.in);
      System.out.println("Añade una deuda");
      deuda=tec.nextDouble();
      cliente.setDeuda(deuda);     
      
      lista.add(cliente);
  }
  
//Creamos un metodo para mostrar los clientes que hay
    
    public static void mostrarClientes(List<ListaCliente> lista){
        int n = 1;
        if(lista.isEmpty()==true){       
            System.out.println("La lista esta vacia");        
        }else{        
            Iterator<ListaCliente> mostrar = lista.iterator();
            while(mostrar.hasNext()){            
            System.out.println(mostrar.next());
            n++;
            }
        }
    }
    
    public static void buscarCliente(List<ListaCliente> lista){
    int n;
    Scanner tec;
    tec=new Scanner(System.in);
    
    if(lista.isEmpty()==true){
        
        System.out.println("La lista esta vacia");
        
        }else{
        
            System.out.println("Introduzca el numero de cliente que quiere buscar");
            n=tec.nextInt();
            n--;
    
            if(n<= lista.size() && n >=0){
                
                System.out.println("El cliente  se encuentra en la lista "); 
               
             
            }else{
                 System.out.println("Este numero no se encuentra en la lista");
        }
    }
    }
  public static void borrarCliente(List<ListaCliente> lista){
    int n;
    Scanner tec;
    tec=new Scanner(System.in);
    
    if(lista.isEmpty()==true){
        
        System.out.println("La lista está vacia");
        
        }else{
        
            System.out.println("Introduzca el numero de cliente que quiere borrar");
            n=tec.nextInt();
            n--;
    
            if(n<= lista.size() && n >=0){
                lista.remove(n);
                System.out.println("El numero "+ n + " ha sido eliminado de la lista"); 
               
             
            }else{
                 System.out.println("Este numero no se encuentra en la lista");
            }
        }
   }
  
  
  public static void borrarTodos(List<ListaCliente> lista){
       if(lista.isEmpty()==true){
           System.out.println("La lista está vacia");
       }else{
       lista.removeAll(lista);
       System.out.println("Se han borrado todos los cliente");
       }
   }
   
    public static void main(String[] args) {
        
        //Creamos la lista
        List<ListaCliente> lista = new LinkedList<ListaCliente>();
        
        //Creamos las variables
        Scanner tec;
        tec = new Scanner(System.in);
        int op=0;
                
     
        //Creamos el menu
        while(op<1 || op>6){
            System.out.println("¿Que desea hacer?");
            System.out.println("------------------");
            System.out.println("1- Añadir un cliente");
            System.out.println("2- Listar clientes");
            System.out.println("3- Buscar cliente");
            System.out.println("4- Borrar cliente");
            System.out.println("5- Borrar todos los clientes");
            System.out.println("6- Salir");
            op=tec.nextInt();       
    switch(op){
                
                case 1:
                    añadirCliente(lista);
                    op=-1;
                    System.out.println();
                    break;
                
                case 2:
                    mostrarClientes(lista);
                    op=-1;
                    System.out.println();
                    break;
                
                case 3:
                    System.out.println();
                    buscarCliente(lista);
                    op=-1;
                    System.out.println();
                    break;
                
                case 4:
                    System.out.println();
                    borrarCliente(lista);
                    op=-1;
                    break;
                
                case 5:
                    borrarTodos(lista);
                    op=-1;        
                    System.out.println();
                    break;
                    
                
                case 6:
                    System.out.println("GRACIAS");
                    
                    break;
            }
            
        }
    
}

}

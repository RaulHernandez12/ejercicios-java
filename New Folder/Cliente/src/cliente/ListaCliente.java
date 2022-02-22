
package cliente;

import java.util.List;


public class ListaCliente {
    //Añadimos los atributos a la clase
    private String NIF;
    private String Nombre;
    private long Telefono;
    private String Direccion;
    private double Deuda;
    
    //Creamos un constructor por defecto
    
    public ListaCliente(){
        NIF="";
        Nombre="";
        Telefono=0;
        Direccion="";
        Deuda=0;
    }
    
    //Creamos un constructor con todos los parametros
    
    public ListaCliente(String NIF,String Nombre, long Telefono, String Direccion, double Deuda){
        this.NIF=NIF;
        this.Nombre=Nombre;
        this.Telefono=Telefono;
        this.Direccion=Direccion;
        this.Deuda=Deuda;
    }
    
    //Creamos los metodos get 
    
    public String getNIF(){
        return NIF;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public long getTelefono(){
        return Telefono;
    }
    
    public String getDireccion(){
        return Direccion;
    }
    
    public double getDeuda(){
        return Deuda;
    }
    
    //Creamos los metodos set
    
    public void setNIF(String NIF){
        this.NIF=NIF;
    }
    
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    
    public void setTelefono(long Telefono){
        this.Telefono=Telefono;
    }
    
    public void setDireccion(String Direccion){
        this.Direccion=Direccion;
    }
    
    public void setDeuda(double Deuda){
        this.Deuda=Deuda;
    }
    
    @Override
    public String toString(){
        
        String mensaje ="Nombre: " +this.getNombre() +" , NIF: "+this.getNIF()+" , Dirección: "+this.getDireccion()+" , Teléfono: "+this.getTelefono()+" , Deuda: "+this.getDeuda();
        return mensaje;
    }
    
    

}

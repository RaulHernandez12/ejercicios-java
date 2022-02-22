
package personamain;

import java.io.Serializable;


public class Persona implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private String nif;
    private String nombre;
    private int edad;
    

public Persona(){
    nif= "";
    nombre="";
    edad= 0;
} 

public Persona(String nif, String nombre, int edad){
    this.nif=nif;
    this.nombre= nombre;
    this.edad= edad;
}

public String getNif(){
    return nif;
}

public void setNif(String nif){
    this.nif= nif;
}

public String getNombre(){
    return nombre;
}

public void setNombre(String nombre){
    this.nombre= nombre;
}

public int getEdad(){
    return edad;
}

public void setEdad(int edad){
    this.edad= edad;
}

@Override
    public String toString() {
        String mensaje= " El dni es "+ nif + " el nombre es "+ nombre + " y la edad es "+ edad;
        return mensaje;
        
    }
}//CLASS
    


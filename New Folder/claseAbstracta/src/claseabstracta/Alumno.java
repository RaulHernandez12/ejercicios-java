
package claseabstracta;


public class Alumno extends Persona{
    private String grupo;
    private String especialidad;
    
    public Alumno(){
        grupo="";
        especialidad="";
    }
    
    public Alumno(String nombre, String apellido, int edad,String grupo, String especialidad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.grupo=grupo;
        this.especialidad=especialidad;
    }
   
    public String getGrupo(){
        return grupo;
    }
    
    public String getEspecialidad(){
        return especialidad;
    }
    
    public void setGrupo(String grupo){
        this.grupo=grupo;
    }
    
    public void setEspecialidad(String especialidad){
        this.especialidad=especialidad;
    }
    
    public void Mostrar(){              
        System.out.println("Alumno: El nombre es: "+getNombre()+ " ,su apellido: "+ getApellido()+" ,su edad: "+getEdad()+ "su grupo es : "+ getGrupo()+ " y su especialidad : "+ getEspecialidad());
    }

    
    
}


package claseabstracta;


public class Profesor extends Persona{
    private double salario;
    private String departamento;
    
    public Profesor(){
        salario=0;
        departamento="";
    }
    
    public Profesor (String nombre, String apellido, int edad, double salario, String departamento){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.salario=salario;
        this.departamento=departamento;
    }
    
   
    public double getSalario(){
        return salario;
    }
    
    public String getDepartamento(){
        return departamento;
    }
    
    public void setSalario (double salario){
        this.salario=salario;
    }
    
    public void setDepartamento(String departamento){
        this.departamento=departamento;
    }
    
    public void Mostrar(){        
        System.out.println("Profesor: El nombre es: "+getNombre()+ " ,su apellido: "+ getApellido()+" ,su edad: "+getEdad()+ "su grupo es : "+ getSalario()+ " y su especialidad : "+ getDepartamento());
    }
}

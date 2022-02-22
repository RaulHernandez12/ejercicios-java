
package poo;


public class POO {

  
    public static void main(String[] args) {
       
        Coche Ferrari;
        Coche Renault;
        
        Ferrari=new Coche("ferrari","f10");
        Renault=new Coche();
      
        Renault.getModelo();
        System.out.println(Renault.getModelo());
        
        Renault.setModelo("peugeut");
        //System.out.println("El ancho del coche es ");
        System.out.println(Renault.getModelo());
        
        System.out.println(Renault);
        System.out.println(Renault.aumentarVelocidad());
        System.out.println(Renault.aumentarVelocidad());
        System.out.println(Renault.aumentarVelocidad());
        System.out.println(Renault.frenar());
       
        
    }
    
}
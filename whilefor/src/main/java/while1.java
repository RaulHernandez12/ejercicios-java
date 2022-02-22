
import java.util.Scanner;


public class while1 {

    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
                int numero1;
        int numero2;
        int mayor;
        int menor;
        int i;
        Scanner tec;
        
        tec=new Scanner(System.in);
        
     do{
         System.out.println("Introduzca numero");
         numero1=tec.nextInt();
         System.out.println("Introduzca otro numero");
         numero2=tec.nextInt();
         
         
         if(numero1==numero2){
             System.out.println("Error son iguales");    
         }
     while(numero1==numero2);
        if(numero1>numero2){
        mayor = numero1;
        menor = numero2;
        }
        else{ 
            mayor =numero2;
            menor =numero1;
        }
        
        System.out.println("Los numeros desde " +menor+ " hasta " +mayor+ " son");
        for(i=menor; i<=mayor; i++){
            System.out.println(i);
    }
    
}


package pracevaluablepersona;


public class Main {

    
    public static void main(String[] args) {
        
        Titular Lola = new Titular("Lola","Fernandez",35,10,"Medac Nevada");
        Titular Luis = new Titular("Luis","Fernandez",30,30,"Medac Nevada");
        Interino Raul = new Interino("Raul","Hernández",28,10,"Medac Nevada");
        Interino Alex = new Interino ("Alejandro","Moreno",26,15,"Medac Nevada");
        Lola.Mostrar();
        Luis.Mostrar();
        Raul.Mostrar();
        Luis.setNumHoras(200);
        Luis.calcularSueldo();
        Luis.Mostrar();
        Alex.Mostrar();
        System.out.println(Alex.getSalario());
        Alex.setNumHoras(9);
        Alex.Mostrar();
        Alex.setNumHoras(500);
        Alex.Mostrar();
    }
    
}

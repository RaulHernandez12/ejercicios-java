
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raul
 */
public class PracticaFicheros4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta= "C:\\Users\\Raul\\Desktop\\practica.txt";
        String palabra= "casa";
        String linea = "";
        int i = 0;
        int repeticiones = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            while ((linea = br.readLine()) != null) {
                while ((i = linea.indexOf(palabra)) != -1) {
                    linea = linea.substring(i + palabra.length(), linea.length());
                    repeticiones++;
                    
                }
              
            }
            System.out.println(repeticiones);
            br.close();
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededatos;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author Raul
 */
public class BaseDeDatos{

    public static Connection conexion;
    public static Statement sentencia;
    public static ResultSet rs;
    public static void main(String[] args) {
        try{
            conexion =  DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xepdb1", "c##_user1", "admin");
            sentencia = conexion.createStatement();
            rs = sentencia.executeQuery("SELECT * FROM DEPARTAMENTO");
            while(rs.next()){
                System.out.println("El código del departamento es: "+ rs.getString("codigo")+" y el nombre es: "+ rs.getString("nombre"));
            }
            rs.close();
        }catch (Exception ex){
            System.out.println("ERROR" + ex);
        }
        
        
    }
    
}

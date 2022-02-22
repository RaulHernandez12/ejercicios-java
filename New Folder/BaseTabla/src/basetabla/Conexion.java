/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basetabla;


import java.sql.*;
/**
 *
 * @author Raul
 */
public class Conexion {
    protected static Connection conexion;
    protected static Statement sentencia;
    protected static ResultSet rs;
    
    
    public Conexion(){
        try{
            conexion =  DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xepdb1", "c##_user1", "admin");
            sentencia = conexion.createStatement();           
            rs = sentencia.executeQuery("SELECT * FROM DEPARTAMENTO");
        }catch (Exception ex){
            System.out.println("ERROR" + ex);    
    }
    }
    
 

}//CLASS
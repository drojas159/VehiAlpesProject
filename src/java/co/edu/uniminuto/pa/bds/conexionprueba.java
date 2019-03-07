/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.pa.bds;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Daniela
 */
public class conexionprueba {
    private static Connection conn;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "root";
    private static final String url = "jdbc:mysql://127.0.0.1:3306//test";

    public conexionprueba() {
        conn= null;
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(url,user,password);
            if(conn!=null)
                System.out.println("conexion establecida");
        }catch(ClassNotFoundException|SQLException e){
            System.out.println("error de conexion: "+e);
            
        }
    } 
    
    public Connection getConnection(){
        return conn;
    }
    
    public void desconectar(){
        conn=null;
        if(conn==null){
            System.out.println("Conexion terminada");
        }
    }
    
}

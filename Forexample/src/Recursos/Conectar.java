package Recursos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {
    Connection conectar = null;
    
    public Connection conexion(){
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://sql10.freesqldatabase.com/sql10316843","sql10316843","Lj4Z9zqHTP");
            System.out.println("Conección establecida con éxito.");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }   
        return conectar;
    }
    
}

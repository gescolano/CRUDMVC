
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private final String BASE = "tienda";
    private final String USER = "root";
    private final String PASSWORD = "password";
    private final String URL = "jdbc:mysql://localhost:3306/" + BASE;
    private Connection con = null;
    
    public Connection getConexion() {
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(this.URL,this.USER, this.PASSWORD);     
        } catch (SQLException e) {
            System.out.println("Error en la Conexión " + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }    return con;
    }    
}

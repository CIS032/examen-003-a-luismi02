
package pruebaprogra3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Controlador {

 public Connection baseDatos() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            System.out.println("Driver Java DB cargado");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: No se encuentra en el Driver");
        }
        Connection conexion = null;
        String urlbd = "jdbc:derby://localhost:1527//Banco";
        try {
            conexion = DriverManager.getConnection(urlbd, "banco", "banco123");
            System.out.println("Conexion establecida a la base de datos");
        } catch (SQLException ex) {
            System.out.println("No se pudo establecer conexion a la Base de datos" + ex);
        }
        return conexion;
    }    
}

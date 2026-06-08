
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Conexion {

    Connection con;

    public Connection conectar(){

        try{

            con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/sistema_votacion",
            "root",
            "");

            System.out.println("Conexion Exitosa");

        }catch(Exception e){

            System.out.println("Error " + e);
        }

        return con;
    }

    public PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
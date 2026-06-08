package dao;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.Usuario;

public class UsuarioDAO {

    Conexion cn = new Conexion();
    Connection con;

    public boolean insertar(Usuario u){

        String sql =
        "INSERT INTO usuarios(nombre,usuario,clave) VALUES (?,?,?)";

        try{

            con = cn.conectar();

            PreparedStatement ps =
            con.prepareStatement(sql);

            ps.setString(1, u.getNombre());
            ps.setString(2, u.getUsuario());
            ps.setString(3, u.getClave());

            ps.execute();

            return true;

        }catch(Exception e){

            System.out.println(e);

            return false;
        }
    }
}

package dao;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VotoDAO {

    Conexion cn = new Conexion();

    Connection con;

    PreparedStatement ps;

    public void votar(int idUsuario, int idCandidato){

        try {

            con = cn.conectar();

            String sql =
            "INSERT INTO votos(id_usuario,id_candidato) VALUES (?,?)";

            ps = con.prepareStatement(sql);

            ps.setInt(1, idUsuario);

            ps.setInt(2, idCandidato);

            ps.executeUpdate();

            System.out.println("Voto registrado");

        } catch (SQLException e) {

            System.out.println("Error: " + e);

        }

    }

}
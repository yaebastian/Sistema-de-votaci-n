package dao;

import conexion.Conexion;
import modelo.Candidato;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class CandidatoDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;

    public void guardarCandidato(Candidato c){

        String sql =
        "INSERT INTO candidatos(nombre,partido) VALUES (?,?)";

        try{

            con = cn.conectar();

            ps = con.prepareStatement(sql);

            ps.setString(1, c.getNombre());
            ps.setString(2, c.getPartido());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null,
            "Candidato Guardado");

        }catch(Exception e){

            JOptionPane.showMessageDialog(null,
            "Error " + e);
        }
    }
}
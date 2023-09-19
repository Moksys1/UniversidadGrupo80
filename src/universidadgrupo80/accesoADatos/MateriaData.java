/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo80.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import universidadgrupo80.entidades.Materia;

/**
 *
 * @author Moksys
 */
public class MateriaData {
    
    private Connection con = null;

    public MateriaData() {
        con = Conexion.getConnection();
        
    }
    
    public void guardarMateria(Materia materias) throws SQLException{
        String sql = "INSERT INTO materias(nombre, año, estado)"
                + " VALUES (?, ?, ?, ?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materias.getNombre());
            ps.setInt(2, materias.getAño());
            ps.setBoolean(3, materias.isEstado());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                materias.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se ha añadido la materia correctamente.");
            }
            ps.close();
            
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia.");
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo80.accesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import universidadgrupo80.entidades.Inscripcion;

/**
 *
 * @author Usuario
 */
public class InscripcionData {

    private Connection con = null;

    public InscripcionData() {
        con = Conexion.getConnection();
    }
    AlumnoData aluData = new AlumnoData();
    MateriaData matData = new MateriaData();

    public void guardarInscripcion(Inscripcion insc) {

        String sql = "INSERT INTO inscripcion(idAlumno, idMateria, nota)"
                + "VALUES (? , ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, insc.getAlumno().getIdAlumno());
            ps.setInt(2, insc.getMateria().getIdMateria());
            ps.setDouble(3, insc.getNota());
            ps.executeQuery();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion con exito.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");

        }
    }
    public void actulizarNota (int idAlumno,int idMateria,double nota){
        
        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? and idMateria = ? ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1,nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int filas =ps.executeUpdate();
            if(filas>0){
                JOptionPane.showMessageDialog(null, "Nota actulizada");
            }
            ps.close();
            
                 
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al accerder a la tabla Inscripcion");
           
        }
        
        
    }
}

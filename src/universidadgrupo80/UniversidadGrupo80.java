/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo80;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import universidadgrupo80.accesoADatos.AlumnoData;
import universidadgrupo80.accesoADatos.Conexion;
import universidadgrupo80.entidades.Alumno;

/**
 *
 * @author Moksys
 */
public class UniversidadGrupo80 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Connection con = Conexion.getConnection();
        
        Alumno juancito = new Alumno(43856345, "Suarez", "Valentina", LocalDate.of(2001, 06, 26), true);
        AlumnoData alu = new AlumnoData();
        alu.guardarAlumno(juancito);
        //alu.modificarAlumno(juancito);
        //alu.BuscarAlumno(1);
        //alu.eliminarAlumno(1);
    }
    
}

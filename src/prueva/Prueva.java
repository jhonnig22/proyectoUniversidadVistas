/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueva;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import prueva.mdoelo.Alumno;
import prueva.mdoelo.AlumnoData;
import prueva.mdoelo.Conexion;

/**
 *
 * @author programador
 */
public class Prueva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

        String date = "16/08/2016";

        LocalDate localDate = LocalDate.parse(date, formatter);

        System.out.println(localDate);

        

           
            Conexion con = new Conexion();
            AlumnoData ad = new AlumnoData(con);
            Alumno alumno = ad.buscarAlumno(1);
            System.out.println(alumno.getNombre());
            Alumno juanito = new Alumno("juanito",LocalDate.now(), true);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Prueva.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    
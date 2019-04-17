/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueva.mdoelo;

import prueva.mdoelo.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alejo
 */
public class AlumnoData {
    private Connection con; //atributo de tipo conection

    public AlumnoData(Conexion conexion) { //contructor que recibe una coneccion para que haga la coneccion a la base de datos
        try {
            con = conexion.getConexion(); //inicializa el atributo con para que pueda hacer los querys a la base de datos
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }

    public AlumnoData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //metodo que recibe un alumno con su nombre, fecha de nac, y si esta activo y lo inserta en la base de datos
    public void guardarAlumno(Alumno alumno){ 
        try {
            //en los values del string se usan ? para representar los valores reales que van a llevar
            //dinamicamente estan ordenados, el primer ? es nombre, el segundo es fech nac y el tercero es activo
            String sql = "INSERT INTO alumno (nombre, fechNac, activo) VALUES ( ? , ? , ? );";

            //al ps le decimos valores van en los values ?
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, alumno.getNombre());
            ps.setDate(2, Date.valueOf(alumno.getFechNac())); //valueOf convierte Date en un localDate
            ps.setBoolean(3, alumno.getActivo());
            
            ps.executeUpdate();//sentencia que cuando se ejecuta hace el insert sobre la tabla alumnos
            
            ResultSet rs = ps.getGeneratedKeys(); //obtengo las claves 

            if (rs.next()) { //seteo id
                alumno.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un alumno");
            }
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
    }
    
    
    //metodo que hace un select en la base de datos, procesa el select en un resulset y me devuelve una lista de alumnos
    public List<Alumno> obtenerAlumnos(){ 
        List<Alumno> alumnos = new ArrayList<Alumno>();
            

        try {
            String sql = "SELECT * FROM alumno;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery(); //hace executeQuery porque estamos haciendo un select
            Alumno alumno;
            while(resultSet.next()){
                alumno = new Alumno();
                alumno.setId(resultSet.getInt("idAlumno"));
                alumno.setNombre(resultSet.getString("nombre"));
                alumno.setFechNac(resultSet.getDate("fechNac").toLocalDate());
                alumno.setActivo(resultSet.getBoolean("activo"));

                alumnos.add(alumno);
            }      
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        
        
        return alumnos;
    }
    
    
    //metodo que recibe un id de alumno y hace un delete en la base de datos y borra un alumno
    public void borrarAlumno(int id){
    try {
            
            String sql = "DELETE FROM alumno WHERE idAlumno =?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
                      
            ps.executeUpdate();//hace executeUpdate porque estamos haciendo un delete
                        
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
        
    
    }
    
    public void actualizarAlumno(Alumno alumno){
    
        try {
            
            String sql = "UPDATE alumno SET nombre = ?, fechNac = ? , "
                    + "activo =? WHERE idAlumno = ?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, alumno.getNombre());
            ps.setDate(2, Date.valueOf(alumno.getFechNac()));
            ps.setBoolean(3, alumno.getActivo());
            ps.setInt(4, alumno.getId());
            ps.executeUpdate();//hace executeUpdate porque estamos haciendo un update
            
          
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
    
    }
    
    
    //metodo que busca un alumno unico a partir de un id
    public Alumno buscarAlumno(int id){
    Alumno alumno=null;
    try {
            
            String sql = "SELECT * FROM alumno WHERE idAlumno =?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
           
            
            ResultSet resultSet=ps.executeQuery(); //hace executeQuery porque estamos haciendo un Select
            
            while(resultSet.next()){
                alumno = new Alumno();
                alumno.setId(resultSet.getInt("idAlumno"));
                alumno.setNombre(resultSet.getString("nombre"));
                alumno.setFechNac(resultSet.getDate("fechNac").toLocalDate());
                alumno.setActivo(resultSet.getBoolean("activo"));

                
            }      
            ps.close();
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
        
        return alumno;
    }
    
}

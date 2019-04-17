/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueva.mdoelo;

import java.time.LocalDate;

/**
 *
 * @author alejo
 */
public class Alumno { //clase alumno con los atributos que representan los campos de mi tabla alumno
    private int id = -1;
    private String nombre;
    private LocalDate fechNac;
    private boolean activo;

    public Alumno(int id, String nombre, LocalDate fecNac, boolean activo) {//constructor que inicializa a todos los atributos
        this.id = id;
        this.nombre = nombre;
        this.fechNac = fecNac;
        this.activo = activo;
    }

    public Alumno(String nombre, LocalDate fecNac, boolean activo) { //constructor que inicializa a todos los atributos menos el id
        //this.id = -1;
        this.nombre = nombre;
        this.fechNac = fecNac;
        this.activo = activo;
    }
    
    public Alumno(){ } //constructor vacio
    
    
    // INICIO DE METODOS GETTERS Y SETTERS DE LOS ATRIBUTOS DE LA CLASE
    public int getId() { 
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechNac() {
        return fechNac;
    }

    public void setFechNac(LocalDate fecNac) {
        this.fechNac = fecNac;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    //FIN DE GETTERS Y SETTERS
    
    public String toString(){
        
        
        return id+"-"+nombre;
    
        
    }
    
}

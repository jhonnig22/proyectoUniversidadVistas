/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueva.mdoelo;

/**
 *
 * @author Usuario
 */
public class Cursada { //clase cursada con los atributos que representan los campos de mi tabla cursada
    private int id=-1;
    private Alumno alumno; //A nivel clase mantengo una relacion de asociacion entre cursada y alumno
    private Materia materia; //A nivel clase mantengo una relacion de asociacion entre cursada y materia
    private int nota;
    
    public Cursada(Alumno alumno, Materia materia, int nota) { //constructor con todos los atributos menos id
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }
        
    public Cursada(int id, Alumno alumno, Materia materia, int nota) { //constructor con todos los atributos
        this.id = id;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Cursada(){} //constructor vacio
    
    
    //INICIO METODOS GET Y SET
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
  //FIN METODOS GET Y SET

    
    
    
    
}

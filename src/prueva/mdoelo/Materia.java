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
public class Materia {//clase materia con los atributos que representan los campos de mi tabla materia

private int id=-1;
private String nombre;

    public Materia(int id, String nombre) { //construcor que inicializa todos los atributos
        this.id = id;
        this.nombre = nombre;
    }
  public Materia( String nombre) { //constructor con todos los atributos
        
        this.nombre = nombre;
    }
    
    public Materia(){} // constructor vacio

    public int getId() {
        return id;
    }

    //INICIO DE METODOS GET Y SET
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //FIN DE METODOS GET Y SET
@Override
    public String toString(){
    
        return id+"-"+nombre;
    }


}

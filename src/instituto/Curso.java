/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instituto;

/**
 *
 * @author Notebook
 */
public class Curso {
    private int id;
    private int id_creador;
    private int cupo_alumnos;
    private String nombre;
    private String descripcion;
    private int costo;

    public void setId(int id) {
        this.id = id;
    }

    public void setCupo_alumnos(int cupo_alumnos) {
        this.cupo_alumnos = cupo_alumnos;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setId_creador(int id_creador) {
        this.id_creador = id_creador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public int getId_creador() {
        return id_creador;
    }

    public int getCupo_alumnos() {
        return cupo_alumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCosto() {
        return costo;
    }
    
    
}

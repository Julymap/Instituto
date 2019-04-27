
package instituto;

import java.sql.Date;


public class Matriculada {
 private int id_persona;
 private int id_curso;
 private Date fecha_inscripcion;
 private int costo;

    public int getId_persona() {
        return id_persona;
    }

    public int getId_curso() {
        return id_curso;
    }

    public Date getFecha_inscripcion() {
        return fecha_inscripcion;
    }

    public int getCosto() {
        return costo;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public void setFecha_inscripcion(Date fecha_inscripcion) {
        this.fecha_inscripcion = fecha_inscripcion;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }









}

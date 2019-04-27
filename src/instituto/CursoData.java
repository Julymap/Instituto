/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instituto;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Notebook
 */
public class CursoData {
    private Connection connection = null;
    
  
    public CursoData (Conexion conexion )
    {
    try {
    connection= conexion.getConexion();
}   
    catch(Exception ex){
    System.out.println(ex.getMessage());
}
    }

public void crearTablero(Curso curso){
    try {
    String sql= "insert into curso (id_creador, cupo_alumnos, nombre, descripcion, costo) values (?,?,?,?,?)";
    PreparedStatement stmt= connection.prepareStatement (sql, Statement.RETURN_GENERATED_KEYS);
    stmt.setInt(1,curso.getId_creador());
    stmt.setInt(2,curso.getCupo_alumnos());
    stmt.setString(3,curso.getNombre());
    stmt.setString(4,curso.getDescripcion());
    stmt.setInt(5,curso.getCosto());
    stmt.executeUpdate();
    ResultSet rs= stmt.getGeneratedKeys();
    if (rs.next()){
    curso.setId(rs.getInt(1));
    }else {
    System.out.println("No se puede obtener el ID tras crear un curso");
    }
    stmt.close();
    }
        catch(SQLException ex){
        System.out.println("Error al crear un curso"+ ex.getMessage());
        }

}
public void borrarCurso(Curso curso){
try{
String sentencia= "delete from curso where id= ?";
PreparedStatement stmt= connection.prepareStatement(sentencia);
stmt.setInt(1, curso.getId());
stmt.executeUpdate();


}
catch (Exception ex){
System.out.println("ERROR "+ ex.getMessage());
}










    }    //LOCALDATE NO COINCIDE CON LA BASES DE DATOS ENTONCES LO CONVERTIMOS EN DATE





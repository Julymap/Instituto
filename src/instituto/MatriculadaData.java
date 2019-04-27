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
public class MatriculadaData {
private Connection connection = null;
    
  
    public MatriculadaData (Conexion conexion )
    {
    try {
    connection= conexion.getConexion();
}   
    catch(Exception ex){
    System.out.println(ex.getMessage());
}
    
    }    //LOCALDATE NO COINCIDE CON LA BASES DE DATOS ENTONCES LO CONVERTIMOS EN DATE
    
public void Inscribir (Matriculada matricula){
    
try {String sql= "insert into matriculada (id_persona, id_curso, fecha_inscripcion, costo) values (?,?,?,?)";
    PreparedStatement stmt= connection.prepareStatement (sql, Statement.RETURN_GENERATED_KEYS);
    stmt.setInt(1,matricula.getId_persona());
    stmt.setInt(2,matricula.getId_curso());
    stmt.setDate(3,matricula.getFecha_inscripcion());
    stmt.setInt(4,matricula.getCosto());
    
    stmt.executeUpdate();
    ResultSet rs= stmt.getGeneratedKeys();
    stmt.close();
    }
   
        catch(SQLException ex){
        System.out.println("Error al marticular"+ ex.getMessage());
        }

}

}

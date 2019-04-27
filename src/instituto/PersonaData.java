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

public class PersonaData { 
    private Connection connection = null;
    
  
    public PersonaData (Conexion conexion )
    {
    try {
    connection= conexion.getConexion();
}   
    catch(Exception ex){
    System.out.println(ex.getMessage());
}
}    //LOCALDATE NO COINCIDE CON LA BASES DE DATOS ENTONCES LO CONVERTIMOS EN DATE
public void guardarPersona(Persona persona){
    try {
    String sql= "insert into personas (nombre, documento, nro_celular) values(?,?,?)";
    PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
    statement.setString(1, persona.getNombre());        
    statement.setString(2, persona.getDni());
    statement.setString(3, persona.getCelular());
statement.executeUpdate();
ResultSet rs= statement.getGeneratedKeys();
 
if (rs.next()){
    persona.setId(rs.getInt(1));
} else {
System.out.println("No se puede obtener el id luego de insertar un alumno");
}
statement.close();
}
    catch(SQLException ex){
    System.out.println("Error al insertar un alumno: "+ ex.getMessage());
    }
}
public void borrarPersona(Persona persona){
try{
String sentencia= "delete from personas where id= ?";
PreparedStatement stmt= connection.prepareStatement(sentencia);
stmt.setInt(1, persona.getId());
stmt.executeUpdate();


}
catch (Exception ex){
System.out.println("ERROR "+ ex.getMessage());
}
}
public void borrarPersonaNombre(Persona persona){
try{
 String borrador= "delete from personas where nombre= ?";
 PreparedStatement stmt= connection.prepareStatement(borrador);
 stmt.setString(1, persona.getNombre());
 stmt.executeUpdate();
}
catch(Exception ex){
    System.out.println("ERROR "+ ex.getMessage());
}
}
}
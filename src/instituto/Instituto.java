;

package instituto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Instituto {











}
  /*  public static void main(String[] args) {
     Conexion cn;
    try {
    cn = new Conexion("jdbc:mysql://localhost/instituto","root","");     
     PersonaData personaData = new PersonaData(cn);  
       
     Persona p= new Persona(); 
      p.setId(3);
     personaData.borrarPersona(p);
     Persona pp= new Persona();
     pp.setNombre("Maria Antonieta");
    personaData.borrarPersonaNombre(pp);
    
    System.out.print(pp.getId());
    }  
    catch(Exception e){
    System.out.println(e.getMessage());
    }
    
    } 
        
    }*/
       
    
    
    
    
    
    /*  try {
        Class.forName("org.mariadb.jdbc.Driver");
     String url = "jdbc:mysql://localhost/instituto2";
     String user = "root";
     String pass = "";
     Connection conexion= DriverManager.getConnection(url, user, pass);
     PreparedStatement prueba = conexion.prepareStatement("select * from persona where id= ?");
   prueba.setInt(1, 2);
     ResultSet resultado= prueba.executeQuery();
   while (resultado.next())
    System.out.println("Legajo " + resultado.getInt(1)+ " Nombre "+ resultado.getString(2)+ " DNI "
            + resultado.getString(3)+ " Celular "+ resultado.getString(4));
    
no hay columna 0   
   resultado.close();
   prueba.close();
   conexion.close();


    }end try
    catch (Exception e) { 
         System.out.println("Error al instanciar la clase conexion" + e.getMessage());
     } end catch
    }end main
}end class
*/ 
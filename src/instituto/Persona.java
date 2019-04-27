package instituto;


public class Persona {
   private int id;
   private String nombre;
   private String dni;
   private String celular;
    
   
   public Persona( String nombre2, String documento, String nro_telefono){
   
   nombre=nombre2;
   dni=documento;
   celular=nro_telefono;
   }
   
   public Persona(){
   this.id=-1;
   }  

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getDni() {
        return dni;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getCelular() {
        return celular;
    }
}

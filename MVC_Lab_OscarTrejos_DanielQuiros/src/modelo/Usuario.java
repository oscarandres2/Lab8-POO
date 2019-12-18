package modelo;

/**
 *
 * @author Oscar Andres y Daniel Quirós
 */
public class Usuario{
    
  private String nombre;
  private String contraseña;
  
  public Usuario(String pNombre,String pContraseña ){
    this.nombre = pNombre;
    this.contraseña = pContraseña;      
  }
  
  
  public String getNombre(){
    return this.nombre;  
  }
    
}

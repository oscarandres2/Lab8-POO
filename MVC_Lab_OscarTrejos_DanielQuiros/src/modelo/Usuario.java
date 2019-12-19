package modelo;

/**
 *Clase Usuario la cual contiene los métodos
 * y atributos necesarios.
 * 
 * @author Oscar Andres y Daniel Quiros.
 */
public class Usuario{
    
  private String nombre;
  private String contraseña;
  
  /**
   * Constructor de la clase Usuario
   * 
   * @param pNombre
   * @param pContraseña 
   */
  public Usuario(String pNombre,String pContraseña ){
    this.nombre = pNombre;
    this.contraseña = pContraseña;      
  }
  
  
  public String getNombre(){
    return this.nombre;  
  }
  
  
  public String getContraseña(){
    return this.contraseña;  
  }
    
}

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
  
  
  public Usuario(){
  }
  
  
  public String getNombre(){
    return this.nombre;  
  }
  
  
  public String getContraseña(){
    return this.contraseña;  
  }
  
  
  public void setNombre(String pNombre){
     this.nombre=pNombre;  
  }
  
  
  public void setContraseña(String pContraseña){
     this.contraseña=pContraseña;  
  }
}

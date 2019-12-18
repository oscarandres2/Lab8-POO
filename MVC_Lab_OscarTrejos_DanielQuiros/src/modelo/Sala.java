package modelo;

import java.util.Date;

/**
 *
 * @author Oscar Andres y Daniel Quirós
 */
public class Sala{
      
  private String identificador;
  private String ubicacion;
  private int capacidad;
  private Date fecha;
  private String organizador;
  private String[] nombreParticipantes;
  
  public Sala(String pIdentificador,String pUbicacion, int pCapacidad, String pOrganizador){
    this.identificador = pIdentificador;
    this.ubicacion = pUbicacion;
    this.capacidad = pCapacidad;
    this.organizador = pOrganizador;
  }
  
}

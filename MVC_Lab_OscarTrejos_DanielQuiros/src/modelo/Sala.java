package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;

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
  private ArrayList<String> nombreParticipantes;
  /**
  * Constructor vacío de la sala
  */
  public Sala(){
    setFechaCreacion();
  }
  /**
  * @params pIdentificador, pUbicacion, pCapacidad, pOrganizador para la creación de la sala
  */
  public Sala(String pIdentificador,String pUbicacion, int pCapacidad, String pOrganizador){
    this.identificador = pIdentificador;
    this.ubicacion = pUbicacion;
    this.capacidad = pCapacidad;
    this.organizador = pOrganizador;
    setFechaCreacion();
  }

  public String getIdentificador() {
    return identificador;
  }
  public String getUbicacion() {
    return ubicacion;
  }
  public int getCapacidad() {
    return capacidad;
  }
  public String getFechaCreacion(){		
    SimpleDateFormat mascara = new SimpleDateFormat( "dd/MM/yy" );
    return mascara.format(this.fecha);
  }
  public String getOrganizador() {
    return organizador;
  }
  public ArrayList<String> getNombreParticipantes() {
    return nombreParticipantes;
  }
  public void setIdentificador(String identificador) {
    this.identificador = identificador;
  }
  public void setUbicacion(String ubicacion) {
    this.ubicacion = ubicacion;
  }
  public void setCapacidad(int capacidad) {
    this.capacidad = capacidad;
  }
  /**
  * Asigna la fecha de la operación
  */
  public void setFechaCreacion() {
    Calendar calendario;
    calendario = Calendar.getInstance();
    fecha = calendario.getTime();
  }
  public void setOrganizador(String organizador) {
    this.organizador = organizador;
  }
  /**
  * @params pNombreParticipante agrega el participante a la lista de participantes 
  */
  public void agregarParticipante(String pNombreParticipante){
    this.nombreParticipantes.add(pNombreParticipante);
  }
}

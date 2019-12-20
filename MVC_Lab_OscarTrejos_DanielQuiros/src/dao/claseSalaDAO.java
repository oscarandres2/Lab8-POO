package dao;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Sala;
import static utilidad.Conexion.getConexion;
import vista.AddSalaForm;

/**
 *
 * @author Daniel Quirós y Óscar Trejos
 */
public class claseSalaDAO {
 
  public Sala validarSala(Sala sala,AddSalaForm vista) throws SQLException{
    try{
      Connection con = getConexion();
      PreparedStatement consulta = con.prepareStatement("select identificador from esquema.sala where identificador='"+ sala.getIdentificador() + "'");
      System.out.println(consulta);
      ResultSet respuesta_consulta = consulta.executeQuery();
      System.out.println(respuesta_consulta);
      ArrayList<String> sala_encontrada = new ArrayList<>();

      while (respuesta_consulta.next()) {
        sala_encontrada.add(respuesta_consulta.getString("identificador"));
      }
      if (sala_encontrada.isEmpty() == false) {
        JOptionPane.showMessageDialog(vista, "La sala con ese identificador ya fue creada");
        return null;
      }
      
      agregarSala(sala,con);
      
      return sala;  
    }catch (HeadlessException | NumberFormatException e) {
      JOptionPane.showMessageDialog(vista, "No se pudo establecer la conexion con el servidor", 
          "Error de conexion", JOptionPane.PLAIN_MESSAGE);
    }
      return null;
    }
    private void agregarSala(Sala pSala, Connection con) throws SQLException{
      PreparedStatement consultaAgregar = con.prepareStatement("insert into esquema.sala(identificador,ubicacion,capacidad,fecha,isPublica,organizador)"
        + "values('" + pSala.getIdentificador()+ "','" +pSala.getUbicacion()+ "'," + String.valueOf(pSala.getCapacidad()) + ",'"
            + pSala.getFechaCreacion() + "'," + String.valueOf(pSala.getIsPublica()) + ",'" + pSala.getOrganizador() +"')");
      System.out.println(consultaAgregar);
      consultaAgregar.executeQuery();
    }
  } 

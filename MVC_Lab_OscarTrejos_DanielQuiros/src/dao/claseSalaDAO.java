package dao;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Sala;
import static conexion.Conexion.getConexion;
import vista.AddSalaForm;

/**
 *
 * @author Daniel Quirós y Óscar Trejos
 */
public class claseSalaDAO {
 
  public Sala validarSala(Sala sala,AddSalaForm vista) throws SQLException{
    try{
      Connection con = getConexion();
      PreparedStatement consulta = con.prepareStatement("select identificador from esquema.sala where "
          + "identificador='"+ sala.getIdentificador() + "'");
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
      if(agregarSala(sala,con,vista)){
        return sala; 
      }
      return null;
        
    }catch (HeadlessException | NumberFormatException e) {
      JOptionPane.showMessageDialog(vista, "No se pudo establecer la conexion con el servidor", 
          "Error de conexion", JOptionPane.PLAIN_MESSAGE);
    }
      return null;
    }
    private boolean agregarSala(Sala pSala, Connection con, AddSalaForm vista){
      
      try{
        PreparedStatement consultaAgregar = con.prepareStatement("insert into esquema.sala(identificador,ubicacion,"
            + "capacidad,fecha,isPublica,organizador)" + "values('" + pSala.getIdentificador()+ "','" 
                +pSala.getUbicacion()+ "'," + String.valueOf(pSala.getCapacidad()) + ",'"
                    + pSala.getFechaCreacion() + "'," + String.valueOf(pSala.getIsPublica()) + ",'" + pSala.getOrganizador() 
                        +"')");
        consultaAgregar.executeQuery();
        return true;
      }catch(SQLException e){
        if(String.valueOf(e).equals("com.microsoft.sqlserver.jdbc.SQLServerException: La instrucción"
            + " no devolvió un conjunto de resultados.")){
          return true;
        }else{
          JOptionPane.showMessageDialog(null, "El organizador debe estar registrado en el sistema");
          return false;
        }
      }
    }
  } 

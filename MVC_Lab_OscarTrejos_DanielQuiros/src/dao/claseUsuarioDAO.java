package dao;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Usuario;
import static utilidad.Conexion.getConexion;

/**
 *
 * @author Oscar Andres y Daniel Quiros
 * @version 18/12/19
 */
public class claseUsuarioDAO{
    
  public Usuario iniciarSesion(Usuario usuario) throws SQLException{
    try{

      Connection con = getConexion();
      PreparedStatement consulta = con.prepareStatement("select usuario from esquema.usuario where usuario='" + usuario.getNombre() + "'");
      System.out.println(consulta);
      ResultSet respuesta_consulta = consulta.executeQuery();
      System.out.println(respuesta_consulta);
      ArrayList<String> lista_usuarios = new ArrayList<>();

    Connection con = getConexion();
    PreparedStatement consulta = con.prepareStatement("select nombre from esquema.usuario where nombre='" + usuario.getNombre() + "'");

    ResultSet respuesta_consulta = consulta.executeQuery();
    ArrayList<String> lista_usuarios = new ArrayList<>();


      while (respuesta_consulta.next()) {
        lista_usuarios.add(respuesta_consulta.getString("nombre"));
      }
      if (lista_usuarios.isEmpty() == true) {
        JOptionPane.showMessageDialog(null, "El usuario no existe");
        return null;
      } else{
        JOptionPane.showMessageDialog(null, "El usuario existe");
        return usuario;
        }  
  
    } catch (HeadlessException | NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion con el servidor", 
                "Error de conexion", JOptionPane.PLAIN_MESSAGE);
        }

      }
      return usuario;  
    }catch (HeadlessException | NumberFormatException e) {
      JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion con el servidor", 
          "Error de conexion", JOptionPane.PLAIN_MESSAGE);
      }
      return null;
    } 
}  


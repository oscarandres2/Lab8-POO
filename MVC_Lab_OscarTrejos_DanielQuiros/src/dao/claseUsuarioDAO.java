package dao;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Usuario;
import static conexion.Conexion.getConexion;

/**
 *
 * @author Oscar Andres y Daniel Quiros
 * @version 18/12/19
 */
public class claseUsuarioDAO{
  
  /**
  *
  * @param usuario método controlador del usuario
  */
  public Usuario iniciarSesion(Usuario usuario) throws SQLException{
    try{
      Connection con = getConexion();
      PreparedStatement consulta = con.prepareStatement("select nombre,contraseña from esquema.usuario where "
          + "nombre='" + usuario.getNombre() + "' and contraseña='"+usuario.getContraseña()+"'");
      ResultSet respuesta_consulta = consulta.executeQuery();
      ArrayList<String> lista_usuarios = new ArrayList<>();
      while (respuesta_consulta.next()) {
        lista_usuarios.add(respuesta_consulta.getString("nombre"));
      }
      if (lista_usuarios.isEmpty() == true) {
        JOptionPane.showMessageDialog(null, "Los datos del usuario no coinciden");
        return null;
      } else{
          JOptionPane.showMessageDialog(null, "Ingreso al usuario de manera exitosa! ");
          return usuario;
        }  
    }catch (HeadlessException | NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion con el servidor", 
            "Error de conexion", JOptionPane.PLAIN_MESSAGE);
    }
      return null;
  }
}  


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
    PreparedStatement consulta = con.prepareStatement("select lista_usuarios from esquema.usuario where placa='" + usuario.getNombre() + "'");
    ResultSet respuesta_consulta = consulta.executeQuery();
    ArrayList<String> lista_usuarios = new ArrayList<>();

      while (respuesta_consulta.next()) {
        lista_usuarios.add(respuesta_consulta.getString("lista_usuarios"));
      }
      if (lista_usuarios.isEmpty() == false) {
        JOptionPane.showMessageDialog(null, "El usuario no existe");
        return null;
      }
     return usuario;  
  
    } catch (HeadlessException | NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion con el servidor", 
                "Error de conexion", JOptionPane.PLAIN_MESSAGE);
        }
      return null;
  } 
}  


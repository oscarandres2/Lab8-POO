package controlador;

import vista.*;
import controlador.*;
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
 **Clase GestorSalas la cual contiene el main de la aplicación
 * 
 * @author Oscar Andres y Daniel Quiros
 * 
 */
public class GestorSalas {
    
  public static void main(String[] args) throws SQLException { 
//      try{
//    Connection con = getConexion();
//    JOptionPane.showMessageDialog(null, "Se pudo establecer la conexion con el servidor", 
//                "Exito de conexion", JOptionPane.PLAIN_MESSAGE);
//      } catch (HeadlessException | NumberFormatException e) {
//        JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion con el servidor", 
//                "Error de conexion", JOptionPane.PLAIN_MESSAGE);
//        }
//      try{
//    Connection con = getConexion();
//    Usuario usuario = new Usuario("Oscar","222");
//    PreparedStatement consulta = con.prepareStatement("select nombre from esquema.usuario where nombre='" + usuario.getNombre() + "'");
//        System.out.println(consulta);
//    ResultSet respuesta_consulta = consulta.executeQuery();
//    System.out.println(respuesta_consulta);
//    ArrayList<String> lista_usuarios = new ArrayList<>();
//
//      while (respuesta_consulta.next()) {
//        lista_usuarios.add(respuesta_consulta.getString("usuario"));
//      }
//      if (lista_usuarios.isEmpty() == false) {
//        JOptionPane.showMessageDialog(null, "El usuario no existe");
//        return ;
//      }
//     return ;  
//  
//    } catch (HeadlessException | NumberFormatException e) {
//        JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion con el servidor", 
//                "Error de conexion", JOptionPane.PLAIN_MESSAGE);
//        }

    LoginForm vista = new LoginForm();
    Usuario modelo = new Usuario("Oscar","12345");
    
    ControladorUsuario controladorUsuario = new 
        ControladorUsuario(vista, modelo);
    controladorUsuario.vista.setVisible(true);
    controladorUsuario.vista.setLocationRelativeTo(null);
  }
    
    
}

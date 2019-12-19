package controlador;

import vista.*;
import controlador.*;
import java.awt.HeadlessException;
import java.sql.Connection;
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
    
  public static void main(String[] args) { 
//      try{
//    Connection con = getConexion();
//    JOptionPane.showMessageDialog(null, "Se pudo establecer la conexion con el servidor", 
//                "Exito de conexion", JOptionPane.PLAIN_MESSAGE);
//      } catch (HeadlessException | NumberFormatException e) {
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

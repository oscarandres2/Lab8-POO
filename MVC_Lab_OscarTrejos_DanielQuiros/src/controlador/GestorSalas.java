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
import modelo.Sala;
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
     LoginForm vista = new LoginForm();
     vista.setVisible(true);
     Usuario modelo=new Usuario();
     ControladorUsuario controladorUsuario = new ControladorUsuario(vista,modelo);
    controladorUsuario.vista.setVisible(true);
    controladorUsuario.vista.setLocationRelativeTo(null);
     


//    AddSalaForm vista = new AddSalaForm();
//    vista.setVisible(true);
//    Sala modelo = new Sala();
//    ControladorSala controladorSala = new ControladorSala(vista, modelo);
  }
    
    
}

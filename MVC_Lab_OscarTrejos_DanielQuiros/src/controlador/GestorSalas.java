package controlador;

import vista.*;
import controlador.*;
import modelo.Usuario;


/**
 **Clase GestorSalas la cual contiene el main de la aplicación
 * 
 * @author Oscar Andres y Daniel Quiros
 * 
 */
public class GestorSalas {
    
  public static void main(String[] args) { 
    LoginForm vista = new LoginForm();
    Usuario modelo = new Usuario("Oscar","12345");
    
    ControladorUsuario controladorUsuario = new 
    ControladorUsuario(vista, modelo);
    controladorUsuario.vista.setVisible(true);
    controladorUsuario.vista.setLocationRelativeTo(null);
  }
    
    
}

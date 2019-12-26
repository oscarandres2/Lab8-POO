package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Sala;
import modelo.Usuario;
import vista.AddSalaForm;
import vista.ChoiceForm;
import vista.LoginForm;

/**
 *
 * @author Daniel Quirós y Óscar Trejos
 */
public class ControladorChoice implements ActionListener {
  ChoiceForm vista;
  
  /**
  *
  * @params pVista, recibe la vista principal
  */
  public ControladorChoice(ChoiceForm pVista){
    vista = pVista;
    this.vista.btIniciarSesion.addActionListener(this);
    this.vista.btAgregarSala.addActionListener(this); 
  }
  /**
  * @params e recibe como parámetro la accion sobre el correpondiente botón
  */
  public void actionPerformed(ActionEvent e) {    
    switch(e.getActionCommand()){
      case "Agregar Sala":
        abrirCrearSala();
        this.vista.dispose();
        break;
      case "Iniciar Sesión":
        abrirInicioSesion();
        this.vista.dispose();
        break;
      default:
        break;
    }
  }
  /**
  * Método que muestra la interfaz de agregar sala
  */
  public void abrirCrearSala(){
    AddSalaForm vista = new AddSalaForm();
    vista.setVisible(true);
    Sala modelo = new Sala();
    ControladorSala controladorSala = new ControladorSala(vista, modelo);
  }
  /**
  * Método que muestra la interfaz de inicio de sesión 
  */
  public void abrirInicioSesion(){
    LoginForm vista = new LoginForm();
    vista.setVisible(true);
    Usuario modelo = new Usuario();
    ControladorUsuario controladorLogin = new ControladorUsuario(vista, modelo);
  }
}

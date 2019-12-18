package controlador;

import dao.claseUsuarioDAO;
import java.awt.event.ActionListener;
import vista.LoginForm;
import javax.swing.*;
import java.awt.event.*;
import modelo.*;
import vista.*;
/**
 *Clase ControladorUsuario la cual contiene los métodos
 * y atributos necesarios.
 * 
 * @author Oscar Andres y Daniel Quiros.
 */
public class ControladorUsuario implements ActionListener {    
  public LoginForm vista;
  public claseUsuarioDAO dao;
  public Usuario modelo;
  
  
  /**
   * Contructor de la clase ControladorUsuario
   * 
   * @param pVista
   * @param pModelo 
   */
  public ControladorUsuario(LoginForm pVista, Usuario pModelo){
    vista = pVista;
    modelo = pModelo;
    claseUsuarioDAO dao= new claseUsuarioDAO();

    this.vista.btIniciarLogin.addActionListener(this);
    this.vista.btCancelarLogin.addActionListener(this);    
    }
  
  
  /**
   * Método que determina cuál acción se ejecutó
   * 
   * @param e 
   */
  public void actionPerformed(ActionEvent e){
    switch (e.getActionCommand()){
        case "Iniciar Login":
            LogIn();
            break;
        case "Cancelar LogIn":
            cerrarVentanaLogin();
            break;
        default:
            break;
    }
  
  }
  
  /**
   * Método que permite realizar LogIn
   */
  public void LogIn(){
    if(vista.logInDatosCorrectos()==true){
      String nombreUsuario=vista.txtNombreUsuario.getText();
      String contraseña= vista.txtContraseña.getText();
      
      modelo=new Usuario(nombreUsuario,contraseña);
      Usuario usuarioActual= dao.iniciarSesion(modelo);
      
      if(usuarioActual!=null){
        vista.setVisible(true);
        JOptionPane.showMessageDialog(vista, "Bienvenido: " + modelo.getNombre());
        vista.setVisible(true);
      } else{
        JOptionPane.showMessageDialog(vista, "El usuario indicado no existe: ");
        }                
    } else {
        JOptionPane.showMessageDialog(vista, "Todos los datos son requeridos");
      }
  }
  
  /**
   * Método que permite cerrar la ventana de LogIn
   */
  public void cerrarVentanaLogin() {
    vista.cancelarInicioSesion();
  }


    
}

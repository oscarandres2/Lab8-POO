package controlador;

import dao.claseUsuarioDAO;
import java.awt.event.ActionListener;
import vista.LoginForm;
import javax.swing.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuario;


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
    dao = new claseUsuarioDAO();
    
    this.vista.btIniciarLogin.addActionListener(this);
    this.vista.btCancelarLogin.addActionListener(this);    
    }
  
  
  /**
   * Método que determina cuál acción se ejecutó
   * 
   * @param e 
   */
  @Override
  public void actionPerformed(ActionEvent e){
    switch (e.getActionCommand()){
        case "Iniciar login":
          try {
            LogIn();
          } catch (SQLException ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
          }    
            break;
        case "Cancelar login":
          cerrarVentanaLogin();
          break;
        default:
          break;
    }
  
  }
  
  /**
   * Método que permite realizar LogIn
     * @throws java.sql.SQLException
   */
  public void LogIn() throws SQLException{
    try{
        
        if(vista.logInDatosCorrectos() == true){
          String nombreUsuario=vista.txtNombreUsuario.getText();
          String contraseña= vista.txtContraseña.getText();
          modelo=new Usuario(nombreUsuario,contraseña);
          Usuario usuarioActual = dao.iniciarSesion(modelo);      
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
        }catch (SQLException ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
  
  
  /**
   * Método que permite cerrar la ventana de LogIn
   */
  public void cerrarVentanaLogin() {
    vista.cancelarInicioSesion();
  }
  
  
}

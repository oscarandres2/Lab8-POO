/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionListener;
import vista.LoginForm;
import javax.swing.*;
import java.awt.event.*;
import modelo.*;
import vista.*;
/**
 *
 * @author Oscar Andres
 */
public class ControladorUsuario implements ActionListener {    
  public LoginForm vista;
  public UsuarioDAO dao;
  public Usuario modelo;
  
  
  public ControladorUsuario(LoginForm pVista, Usuario pModelo){
    vista = pVista;
    modelo = pModelo;
    UsuarioDAO dao= new UsuarioDAOXML();

    this.vista.btIniciarLogin.addActionListener(this);
    this.vista.btCancelarLogin.addActionListener(this);    
    }
  
  
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
  
  
  public void LogIn(){
    if(vista.logInDatosCorrectos()==true){
      String nombreUsuario=vista.txtNombreUsuario.getText();
      String contraseña= vista.txtContraseña.getText();
      
      modelo=new Usuario(nombreUsuario,contraseña);
      Usuario usuarioActual= dao.iniciarSesion(modelo);
      
      if(usuarioActual!=null){
        vista.setVisible(true);
        JOptionPane.showMessageDialog(vista, "Bienvenido: " + modelo.getNombre());
      }
              
              
              
    } else {
        JOptionPane.showMessageDialog(vista, "Todos los datos son requeridos");
      }
  }
  
  
   public void cerrarVentanaLogin() {
        vista.cancelarInicioSesion();
    }


    
}

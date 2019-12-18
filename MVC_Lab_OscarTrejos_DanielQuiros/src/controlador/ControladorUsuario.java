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
 *Clase ControladorUusario la cual contiene los métodos
 * y atributos necesarios.
 * 
 * @author Oscar Andres y Daniel Quiros.
 */
public class ControladorUsuario implements ActionListener {    
  public LoginForm vista;
  public UsuarioDAO dao;
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
    UsuarioDAO dao= new UsuarioDAOXML();

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
  
  
   public void cerrarVentanaLogin() {
        vista.cancelarInicioSesion();
    }


    
}

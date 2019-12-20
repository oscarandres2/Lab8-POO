package controlador;

import dao.claseSalaDAO;
import javax.swing.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Sala;
import vista.*;

/**
 *
 * @author Daniel Quirós y Óscar Trejos
 */
public class ControladorSala implements ActionListener {
  public AddSalaForm vista;
  public claseSalaDAO dao;
  public Sala modelo;
  
  /**
  * @params pVista, pModelo, recibe la vista y el modelo de la sala para crear el controlador
  */
  public ControladorSala(AddSalaForm pVista, Sala pModelo){
    vista = pVista;
    modelo = pModelo;
    dao= new claseSalaDAO();

    this.vista.btAgregar.addActionListener(this);
    this.vista.btCancelar.addActionListener(this);
  }
  /**
  * @params e recibe como parámetro la accion sobre el correpondiente botón
  */
  public void actionPerformed(ActionEvent e) {    
    switch(e.getActionCommand()){
      case "Agregar Sala":
        try{
          agregarSala();
        }catch (SQLException ex) {
          Logger.getLogger(ControladorSala.class.getName()).log(Level.SEVERE, null, ex);
        }
        break;
      case "Cancelar":
        cerrarAgregarSala();
        break;
      default:
        break;
    } 
  }
  /**
  * método controlador que interactua entre INTERFAZ, DAO Y MODELO para agregar la sala
  * @throws java.sql.SQLException
  */
  public void agregarSala() throws SQLException{
    if (vista.datosSonCorrectos() == true){
      String identificador = vista.txtIdentificador.getText();
      String ubicacion = vista.txtUbicacion.getText();
      int capacidad = Integer.parseInt(vista.txtCapacidad.getText());
      String organizador = vista.txtOrganizador.getText();
      byte isPublica = 0;
      
      switch(vista.decisionIsPublica.getSelectedItem().toString()){
        case "Si":
          isPublica=1;
          break;
        case "No":
          isPublica=0;
        default:
          break;
      }
      
      modelo = new Sala(identificador, ubicacion, capacidad, organizador, isPublica);
      Sala salaPorAgregar = dao.validarSala(modelo,vista);
      
      if (salaPorAgregar != null) {            
        vista.setVisible(false);
        JOptionPane.showMessageDialog(vista, "Se ha agregado con éxito: ");
        vista.setVisible(true);
      }else {
        JOptionPane.showMessageDialog(vista, "La sala ya ha sido agregada");
      }
      
    }else {
      JOptionPane.showMessageDialog(vista, "Ingrese los datos de nuevo");
    }
  }
  /**
  * llama al método para cerrar la vista
  */
  public void cerrarAgregarSala() {
    vista.cancelarAgregarSala();
  }
}

package controlador;

import dao.claseSalaDAO;
import javax.swing.*;
import java.awt.event.*;
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
    claseSalaDAO dao= new claseSalaDAO();

    this.vista.btAgregar.addActionListener(this);
    this.vista.btCancelar.addActionListener(this);
  }
  /**
  * @params e recibe como parámetro la accion sobre el correpondiente botón
  */
  public void actionPerformed(ActionEvent e) {    
    switch(e.getActionCommand()){
      case "Agregar Sala":
        agregarSala();
        break;
      case "Cancelar agregar":
        cerrarAgregarSala();
        break;
      default:
        break;
    } 
  }
  /**
  * método controlador que interactua entre INTERFAZ, DAO Y MODELO para agregar la sala
  */
  public void agregarSala(){
    if (vista.datosSonCorrectos() == true){
      String identificador = vista.txtIdentificador.getText();
      String ubicacion = vista.txtUbicacion.getText();
      String capacidad = vista.txtCapacidad.getText();
      String organizador = vista.txtOrganizador.getText();
      
      modelo = new Sala(identificador, ubicacion, Integer.parseInt(capacidad), organizador);
      Sala salaPorAgregar= dao.validarSala(modelo);
      
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

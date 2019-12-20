package controlador;

import vista.*;
import java.sql.SQLException;

/**
 **Clase GestorSalas la cual contiene el main de la aplicación
 * 
 * @author Oscar Andres y Daniel Quiros
 * 
 */
public class GestorSalas {
    
  public static void main(String[] args) throws SQLException {     
    ChoiceForm vista = new ChoiceForm();
    vista.setVisible(true);
    ControladorChoice controladorChoice = new ControladorChoice(vista);
    controladorChoice.vista.setVisible(true);
    controladorChoice.vista.setLocationRelativeTo(null);
  }
}

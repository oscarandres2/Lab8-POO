package vista;

import javax.swing.JOptionPane;

/**
 *Clase LoginForm la cual contiene los métodos
 * necesarios para implementación de la interfaz.
 * 
 * @author Oscar Andres y Daniel Quiros
 */
public class LoginForm extends javax.swing.JFrame {

  public LoginForm(){
    initComponents();       
  }
  
  /**
   * Método que determina si se ingresaron los datos
   * 
   * @return un valor booleano indicando si los datos son correctos o no
   */
  public boolean logInDatosCorrectos(){
    if(txtNombreUsuario.equals("")){
      JOptionPane.showMessageDialog(null, "Ingresar el nombre del usuario", "Error de ingreso", JOptionPane.PLAIN_MESSAGE);
            return false;
    }
    if(txtContraseña.equals("")){
      JOptionPane.showMessageDialog(null, "Ingresar la contraseña del usuario", "Error de ingreso", JOptionPane.PLAIN_MESSAGE);
            return false;
    }
    return true;    
  }
  
  /**
   *Método que despliega la ventana anterior
   */
  public void abrirVentanaAnterior(LoginForm ventanaAnterior){  
    ventanaAnterior.setVisible(true);
  }
  
  /**
   *Método que cancela el inicio de sesión y cierra el sistema
   */
  public void cancelarInicioSesion(){  
    System.exit(0);  
  }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNombreUsuario = new javax.swing.JLabel();
        lbContraseña = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        btCancelarLogin = new javax.swing.JButton();
        btIniciarLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbNombreUsuario.setText("Usuario:");

        lbContraseña.setText("Contraseña:");

        txtNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioActionPerformed(evt);
            }
        });

        btCancelarLogin.setText("Cancelar login");

        btIniciarLogin.setText("Iniciar login");
        btIniciarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIniciarLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNombreUsuario)
                            .addComponent(lbContraseña))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btCancelarLogin)
                        .addGap(43, 43, 43)
                        .addComponent(btIniciarLogin)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreUsuario)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbContraseña)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelarLogin)
                    .addComponent(btIniciarLogin))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIniciarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIniciarLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btIniciarLoginActionPerformed

    private void txtNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btCancelarLogin;
    public javax.swing.JButton btIniciarLogin;
    private javax.swing.JLabel lbContraseña;
    private javax.swing.JLabel lbNombreUsuario;
    public javax.swing.JTextField txtContraseña;
    public javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}

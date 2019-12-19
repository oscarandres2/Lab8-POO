package vista;

/**
 *
 * @author Daniel Quirós y Óscar Trejos
 */
public class AddSalaForm extends javax.swing.JFrame {

public AddSalaForm() {
  initComponents();
}
/**
 *
 * Valida los datos ingresados en la interfaz
 */
public boolean datosSonCorrectos(){
  int contadorErrores = 0;
  
  if(this.txtIdentificador.getText().equals(" ")){
    contadorErrores+=1;
  }if(this.txtOrganizador.getText().equals(" ")){
    contadorErrores+=1;
  }if(this.txtUbicacion.getText().equals(" ")){
    contadorErrores+=1;
  }if(this.txtCapacidad.getText().equals(" ")){
    contadorErrores+=1;
  }
  try{
    if(Integer.parseInt(this.txtCapacidad.getText()) != 0){
    }
  }
  catch(NumberFormatException e){
    contadorErrores+=1;
  }
  
  
  if(contadorErrores==0){
    return true;
  }
  return false;
}
/**
 *
 * Devuelve la interfaz anterior
 */
public void ventanaAnterior(AddSalaForm ventanaAnterior){
  ventanaAnterior.setVisible(true);
}
/**
 *
 * Termina el programa
 */
public void cancelarAgregarSala(){
  System.exit(0);
}
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIdentificador = new javax.swing.JLabel();
        lbUbicacion = new javax.swing.JLabel();
        lbOrganizador = new javax.swing.JLabel();
        lbCapacidad = new javax.swing.JLabel();
        infoEtiqueta = new javax.swing.JLabel();
        txtIdentificador = new javax.swing.JTextField();
        txtOrganizador = new javax.swing.JTextField();
        txtUbicacion = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        btAgregar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        decisionIsPublica = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbIdentificador.setText("Identificador");

        lbUbicacion.setText("Ubicación");

        lbOrganizador.setText("Organizador");

        lbCapacidad.setText("Capacidad");

        infoEtiqueta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        infoEtiqueta.setText("Agregar Sala");

        txtIdentificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificadorActionPerformed(evt);
            }
        });

        btAgregar.setText("Agregar Sala");
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");

        decisionIsPublica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jLabel1.setText("Sala Pública");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(infoEtiqueta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbIdentificador)
                            .addComponent(lbUbicacion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbCapacidad)
                                .addComponent(lbOrganizador)
                                .addComponent(jLabel1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCapacidad, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(txtOrganizador, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(decisionIsPublica, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btCancelar)
                        .addGap(74, 74, 74)
                        .addComponent(btAgregar)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(infoEtiqueta)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbIdentificador))
                    .addComponent(txtIdentificador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lbUbicacion)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbOrganizador)
                            .addComponent(txtOrganizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCapacidad)
                            .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(decisionIsPublica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btAgregar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdentificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificadorActionPerformed

    private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAgregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btAgregar;
    public javax.swing.JButton btCancelar;
    public javax.swing.JComboBox<String> decisionIsPublica;
    public javax.swing.JLabel infoEtiqueta;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel lbCapacidad;
    public javax.swing.JLabel lbIdentificador;
    public javax.swing.JLabel lbOrganizador;
    public javax.swing.JLabel lbUbicacion;
    public javax.swing.JTextField txtCapacidad;
    public javax.swing.JTextField txtIdentificador;
    public javax.swing.JTextField txtOrganizador;
    public javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}

package TEMA05;

import static TEMA05.Principal.actualizarPersonaPorId;
import static TEMA05.Principal.buscarPersonaPorId;
import static TEMA05.Principal.eliminarPersonaPorId;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.bson.Document;

public class Ventana4 extends javax.swing.JFrame {

    DefaultListModel dlm = new DefaultListModel();

    public Ventana4() {
        initComponents();
        lstHobbies.setModel(dlm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIdPersona = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblIdPersona = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        lblEstatura = new javax.swing.JLabel();
        txtEstatura = new javax.swing.JTextField();
        lblCasado = new javax.swing.JLabel();
        txtCasado = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        lblCalle = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblCiudad = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        lblHobbies = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstHobbies = new javax.swing.JList<>();
        lblBuscarEmpleado = new javax.swing.JLabel();
        botEliminar = new javax.swing.JButton();
        botLimpiar = new javax.swing.JButton();
        botSalir = new javax.swing.JButton();
        txtBuscarIdPersona = new javax.swing.JTextField();
        botBuscar = new javax.swing.JButton();
        botEditar = new javax.swing.JButton();
        botActualizar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtIdPersona.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdPersona.setEnabled(false);

        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setEnabled(false);

        lblIdPersona.setFont(new java.awt.Font("Courier New", 0, 10)); // NOI18N
        lblIdPersona.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblIdPersona.setText("ID PERSONA");

        lblNombre.setFont(new java.awt.Font("Courier New", 0, 10)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombre.setText("NOMBRE");

        lblEdad.setFont(new java.awt.Font("Courier New", 0, 10)); // NOI18N
        lblEdad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEdad.setText("EDAD");

        txtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEdad.setEnabled(false);

        lblEstatura.setFont(new java.awt.Font("Courier New", 0, 10)); // NOI18N
        lblEstatura.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEstatura.setText("ESTATURA");

        txtEstatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEstatura.setEnabled(false);

        lblCasado.setFont(new java.awt.Font("Courier New", 0, 10)); // NOI18N
        lblCasado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCasado.setText("CASADO");

        txtCasado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCasado.setEnabled(false);

        lblSexo.setFont(new java.awt.Font("Courier New", 0, 10)); // NOI18N
        lblSexo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSexo.setText("SEXO");

        txtSexo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSexo.setEnabled(false);

        lblCalle.setFont(new java.awt.Font("Courier New", 0, 10)); // NOI18N
        lblCalle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCalle.setText("CALLE");

        txtCalle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCalle.setEnabled(false);

        lblNumero.setFont(new java.awt.Font("Courier New", 0, 10)); // NOI18N
        lblNumero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNumero.setText("NUMERO");

        txtNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumero.setEnabled(false);

        lblCiudad.setFont(new java.awt.Font("Courier New", 0, 10)); // NOI18N
        lblCiudad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCiudad.setText("CIUDAD");

        txtCiudad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCiudad.setEnabled(false);

        lblHobbies.setFont(new java.awt.Font("Courier New", 0, 10)); // NOI18N
        lblHobbies.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHobbies.setText("HOBBIES");

        lstHobbies.setEnabled(false);
        jScrollPane1.setViewportView(lstHobbies);

        lblBuscarEmpleado.setText("BUSCAR UN DOCUMENTO EN MONGODB POR IDPERSONA");

        botEliminar.setText("ELIMINAR");
        botEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEliminarActionPerformed(evt);
            }
        });

        botLimpiar.setText("LIMPIAR");
        botLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botLimpiarActionPerformed(evt);
            }
        });

        botSalir.setText("SALIR");
        botSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSalirActionPerformed(evt);
            }
        });

        txtBuscarIdPersona.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        botBuscar.setText("BUSCAR");
        botBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botBuscarActionPerformed(evt);
            }
        });

        botEditar.setText("EDITAR");
        botEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEditarActionPerformed(evt);
            }
        });

        botActualizar1.setText("ACTUALIZAR");
        botActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botActualizar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(lblCasado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblEdad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblIdPersona, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                .addComponent(lblEstatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHobbies, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSexo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCasado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                        .addGap(83, 83, 83)
                        .addComponent(botActualizar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34)
                        .addComponent(botEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(txtIdPersona)
                                    .addComponent(txtEdad)
                                    .addComponent(txtEstatura))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(lblBuscarEmpleado))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(botLimpiar)
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtBuscarIdPersona, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(botEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                            .addComponent(botBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(botSalir))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(152, 152, 152)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBuscarEmpleado))
                    .addComponent(lblIdPersona))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEdad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEstatura)
                            .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCasado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSexo))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCalle))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumero))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCiudad))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHobbies)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(botSalir)
                                    .addComponent(botLimpiar)
                                    .addComponent(botBuscar)))
                            .addComponent(txtBuscarIdPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(botEliminar)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botActualizar1)
                            .addComponent(botEditar))))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEliminarActionPerformed
        String idPersonaEliminar = txtBuscarIdPersona.getText();
        int numero = Principal.eliminarPersonaPorId(idPersonaEliminar);
        if (numero != 0) {
            //System.out.println("OK: ELIMINO CORRECTAMENTE");
            JOptionPane.showMessageDialog(null, "ELIMINO CORRECTAMENTE", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        } else {
            //System.out.println("ERROR: NO EXISTE PERSONA CON ESE ID");
            JOptionPane.showMessageDialog(null, " NO EXISTE PERSONA CON ESE ID", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_botEliminarActionPerformed

    private void cargarLista(String[] hobbies) {
        for (String hobby : hobbies) {
            dlm.addElement(hobby);
        }
    }

    private void botLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botLimpiarActionPerformed
        txtIdPersona.setText("");
        txtBuscarIdPersona.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        txtEstatura.setText("");
        txtCasado.setText("");
        txtCalle.setText("");
        txtNumero.setText("");
        txtCiudad.setText("");
        txtSexo.setText("");
        dlm.clear();
    }//GEN-LAST:event_botLimpiarActionPerformed

    private void botSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_botSalirActionPerformed

    private void botBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botBuscarActionPerformed
        String idPersonaBuscar = txtBuscarIdPersona.getText();
        Persona persona = Principal.buscarPersonaPorId(idPersonaBuscar);
        if (persona != null) {
            //System.out.println(persona);
            txtIdPersona.setText(persona.getIdPersona());
            txtNombre.setText(persona.getNombre());
            txtEdad.setText(persona.getEdad() + "");
            txtEstatura.setText(persona.getEstatura() + "");
            txtCasado.setText(persona.getCasado() + "");
            txtSexo.setText(persona.getSexo());
            txtCalle.setText(persona.getDireccion().getCalle());
            txtNumero.setText(persona.getDireccion().getNumero() + "");
            txtCiudad.setText(persona.getDireccion().getCiudad());
            String[] hobbies = persona.getHobbies();
            cargarLista(hobbies);
        } else {
            JOptionPane.showMessageDialog(null, "IDPERSONA NO EXISTE", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botBuscarActionPerformed

    private void botEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEditarActionPerformed
        txtNombre.setEnabled(true);
        txtEdad.setEnabled(true);
        txtEstatura.setEnabled(true);
        txtCasado.setEnabled(true);
        txtSexo.setEnabled(true);
        txtCalle.setEnabled(true);
        txtNumero.setEnabled(true);
        txtCiudad.setEnabled(true);
        lstHobbies.setEnabled(true);
        
    }//GEN-LAST:event_botEditarActionPerformed

    private void botActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botActualizar1ActionPerformed
        // TODO add your handling code here:
        Direccion direccion = new Direccion(txtCalle.getText(),
                                                    Integer.parseInt(txtNumero.getText()),
                                                    txtCiudad.getText());
        
        Persona persona = new Persona(txtIdPersona.getText(),
                                      txtNombre.getText(),
                                      Integer.parseInt(txtEdad.getText()),
                                      Double.parseDouble(txtEstatura.getText()),
                                      Boolean.parseBoolean(txtCasado.getText()),
                                      txtSexo.getText(),
                                      direccion);

        System.out.println(persona);
        actualizarPersonaPorId(persona);
        JOptionPane.showMessageDialog(null, "ACTUALIZACION CORRECTA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_botActualizar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botActualizar1;
    private javax.swing.JButton botBuscar;
    private javax.swing.JButton botEditar;
    private javax.swing.JButton botEliminar;
    private javax.swing.JButton botLimpiar;
    private javax.swing.JButton botSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscarEmpleado;
    private javax.swing.JLabel lblCalle;
    private javax.swing.JLabel lblCasado;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEstatura;
    private javax.swing.JLabel lblHobbies;
    private javax.swing.JLabel lblIdPersona;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JList<String> lstHobbies;
    private javax.swing.JTextField txtBuscarIdPersona;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCasado;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEstatura;
    private javax.swing.JTextField txtIdPersona;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}

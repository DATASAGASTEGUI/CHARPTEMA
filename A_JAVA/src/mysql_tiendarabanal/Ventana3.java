package mysql_tiendarabanal;

import java.sql.Connection;
import java.util.List;
import javax.swing.JOptionPane;

public class Ventana3 extends javax.swing.JFrame {

    Connection conexion;
    OperacionesCrud crud;
    int codigo = 0;

    public Ventana3() {
        initComponents();
        Conexion.setConexion("tiendarabanal", "root", "12345678");
        conexion = Conexion.getConexion();
        crud = new OperacionesCrud(conexion);
        cargarDatosComboBox();

    }


    public void cargarDatosComboBox() {
        cboCodigo.removeAllItems();
        List<Integer> codigos_al = crud.obtenerArrayListCodigoCliente();
        cboCodigo.addItem("SELECCIONE");
        if (codigos_al != null) {
            for (Integer x : codigos_al) {
                cboCodigo.addItem(x + "");
                //cboCodigo.addItem(String.valueOf(x));
                //cboCodigo.addItem(x.toString());
            }
        } else {
            JOptionPane.showMessageDialog(this, "ERROR: LISTA VACIA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboCodigo = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        cmdEliminar = new javax.swing.JButton();
        cmdActualizar = new javax.swing.JButton();
        cmdRefrescar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cboCodigo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboCodigoItemStateChanged(evt);
            }
        });

        cmdEliminar.setText("ELIMINAR");
        cmdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarActionPerformed(evt);
            }
        });

        cmdActualizar.setText("ACTUALIZAR");
        cmdActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdActualizarActionPerformed(evt);
            }
        });

        cmdRefrescar.setText("R");
        cmdRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRefrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(cboCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdRefrescar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(cmdEliminar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(cmdActualizar)
                        .addGap(88, 88, 88))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDomicilio)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdRefrescar))
                .addGap(29, 29, 29)
                .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdEliminar)
                    .addComponent(cmdActualizar))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboCodigoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCodigoItemStateChanged
        try {
            if (cboCodigo.getSelectedIndex() != 0) {
                codigo = Integer.parseInt(cboCodigo.getSelectedItem().toString());
                String codigos = cboCodigo.getSelectedItem().toString();//"1"
                Cliente cliente = crud.buscarCliente(Integer.parseInt(codigos));
                txtNombre.setText(cliente.getNombre());
                txtDomicilio.setText(cliente.getDomicilio());
            } else {
                txtNombre.setText("");
                txtDomicilio.setText("");
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_cboCodigoItemStateChanged

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed
        if (cboCodigo.getSelectedIndex() != 0) {
            //int codigo = Integer.parseInt(cboCodigo.getSelectedItem().toString());
            Cliente cliente = new Cliente(codigo);
            if (crud.eliminarCliente(cliente)) {
                //cargarDatosComboBox();
                //cboCodigo.setSelectedIndex(0);
                JOptionPane.showMessageDialog(this, "OK ELIMINAR CLIENTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "ERROR ELIMINAR CLIENTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            }
            cargarDatosComboBox();
        }

    }//GEN-LAST:event_cmdEliminarActionPerformed

    private void cmdActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdActualizarActionPerformed
        String nombre = txtNombre.getText();
        String domicilio = txtDomicilio.getText();

        Cliente cliente = new Cliente(codigo, nombre, domicilio);

        if (crud.actualizarCliente(cliente)) {
            JOptionPane.showMessageDialog(this, "OK ACTUALIZAR CLIENTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "ERROR ACTUALIZAR CLIENTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_cmdActualizarActionPerformed

    private void cmdRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRefrescarActionPerformed
        cargarDatosComboBox();
    }//GEN-LAST:event_cmdRefrescarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboCodigo;
    private javax.swing.JButton cmdActualizar;
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdRefrescar;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

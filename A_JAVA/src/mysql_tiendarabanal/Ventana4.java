package mysql_tiendarabanal;

import java.sql.Connection;
import javax.swing.JOptionPane;
import static mysql_tiendarabanal.Menu.conexion;
import static mysql_tiendarabanal.Menu.crud;

public class Ventana4 extends javax.swing.JFrame {

    Connection conexion;
    OperacionesCrud crud;

    public Ventana4() {
        initComponents();
        Conexion.setConexion("tiendarabanal", "root", "12345678");
        conexion = Conexion.getConexion();
        crud = new OperacionesCrud(conexion);
    }

    public void proceso2_1() {
        String nombre = txtNombre.getText();
        String domicilio = txtDomicilio.getText();
        Cliente cliente = new Cliente(nombre, domicilio);
        byte x;
        if (conexion != null) {
            x = crud.existeCliente(cliente);
            switch (x) {
                case 0:
                    if (crud.insertarCliente(cliente)) {
                        System.out.println("OK: CRUD.INSERTARCLIENTE");
                        JOptionPane.showMessageDialog(this, "OK: CRUD.INSERTARCLIENTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        System.out.println("ERROR: CRUD.INSERTARCLIENTE");
                        JOptionPane.showMessageDialog(this, "ERROR: CRUD.INSERTARCLIENTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 1:
                    System.out.println("YA EXISTE CLIENTE");
                    JOptionPane.showMessageDialog(this, "YA EXISTE CLIENTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case -1:
                    System.out.println("ERROR: CRUD.EXISTECLIENTE");
                    JOptionPane.showMessageDialog(this, "ERROR: CRUD.EXISTECLIENTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            System.out.println("ERROR: CONEXION");
            JOptionPane.showMessageDialog(this, "ERROR: CONEXION", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void proceso2_2() {
        String nombre = txtNombre.getText();
        String domicilio = txtDomicilio.getText();
        Cliente cliente = new Cliente(nombre, domicilio);
        byte x;
        if (conexion != null) {
            if (nombre.length() > 0 && domicilio.length() > 0) {
                if (crud.insertarCliente(cliente)) {
                    System.out.println("OK: CRUD.INSERTARCLIENTE");
                    JOptionPane.showMessageDialog(this, "OK: CRUD.INSERTARCLIENTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    System.out.println("ERROR: CRUD.INSERTARCLIENTE");
                    JOptionPane.showMessageDialog(this, "ERROR: CRUD.INSERTARCLIENTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "ERROR: DEBES INGRESAR DATOS", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            System.out.println("ERROR: CONEXION");
            JOptionPane.showMessageDialog(this, "ERROR: CONEXION", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        cmdInsertar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmdInsertar.setText("INSERTAR");
        cmdInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdInsertarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(cmdInsertar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(cmdInsertar)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdInsertarActionPerformed
        proceso2_2();
    }//GEN-LAST:event_cmdInsertarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdInsertar;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

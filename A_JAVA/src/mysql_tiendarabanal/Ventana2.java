package mysql_tiendarabanal;

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static mysql_tiendarabanal.Menu.conexion;
import static mysql_tiendarabanal.Menu.crud;

public class Ventana2 extends javax.swing.JFrame {

    String[] cabecera = {"CODIGO", "NOMBRE", "DOMICILIO"};
    String[][] data = {};
    DefaultTableModel dtm = new DefaultTableModel(data, cabecera);

    public Ventana2() {
        initComponents();
        personalizar_JFrame();
        personalizar_JTable();
        cargarDatosTable();
    }

    private void cargarDatosTable() {
        limpiarTable();
        Conexion.setConexion("tiendarabanal", "root", "12345678");
        Connection conexion = Conexion.getConexion();
        OperacionesCrud crud = new OperacionesCrud(conexion);

        List<Cliente> clientes_al = null;
        if (conexion != null) {
            if ((clientes_al = crud.getArrayListCliente()) != null) {
                
                
                int nf = clientes_al.size();
                String[] blanco = {"", "", ""};
                for (int i = 0; i < nf; i++) {
                    Cliente c = clientes_al.get(i);
                    dtm.addRow(blanco);
                    dtm.setValueAt(c.getCodigo(), i, 0);
                    dtm.setValueAt(c.getNombre(), i, 1);
                    dtm.setValueAt(c.getDomicilio(), i, 2);
                }
                
                
                
            } else {
                //System.out.println("ERROR: CRUD.GETARRAYLISTCLIENTE");
                JOptionPane.showMessageDialog(this, "ERROR: CRUD.GETARRAYLISTCLIENTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            //System.out.println("ERROR: CONEXION");
            JOptionPane.showMessageDialog(this, "ERROR: CONEXION", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public void limpiarTable() {
        int nf = dtm.getRowCount();
        for (int i = 0; i < nf; i++) {
            dtm.removeRow(0);
        }
    }

    private void personalizar_JTable() {
        tblMostrar.setModel(dtm);
        
        
        
        
    }

    private void personalizar_JFrame() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana2.class.getResource("w2.jpg")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("GUI");
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMostrar = new javax.swing.JTable();
        cmdRefrescar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("MOSTRAR DATOS EN UN JTABLE");
        lblTitulo.setOpaque(true);

        tblMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblMostrar);

        cmdRefrescar.setText("REFRESCAR");
        cmdRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRefrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(cmdRefrescar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(cmdRefrescar)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRefrescarActionPerformed
        cargarDatosTable();
    }//GEN-LAST:event_cmdRefrescarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdRefrescar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblMostrar;
    // End of variables declaration//GEN-END:variables
}

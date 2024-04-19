package TEMA03;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.awt.Color;
import java.awt.Toolkit;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Ventana2 extends javax.swing.JFrame {
    
    String[] cabecera = {"IDEMPLEADO","NOMBRE","EDAD","ESTATURA","CASADO"};
    String[][] datos = {};
    DefaultTableModel dtm = new DefaultTableModel(datos, cabecera);

    public Ventana2() {
        initComponents();
        personalizarVentana();
        personalizarTabla();
        cargarDatos();
    }
    
    private void personalizarVentana() {
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana2.class.getResource("cross1.png")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("GUI");
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //this.setSize(540, 440);
    }
    
    private void personalizarTabla() {
        tblContenido.setModel(dtm);
        DefaultTableCellRenderer centerRenderer_center = new DefaultTableCellRenderer();
        centerRenderer_center.setHorizontalAlignment(JLabel.RIGHT);
        tblContenido.getColumnModel().getColumn(2).setCellRenderer(centerRenderer_center);
        tblContenido.getColumnModel().getColumn(3).setCellRenderer(centerRenderer_center);        
    }
    
    private void cargarDatos() {
        List<Empleado> empleados_al = obtenerListaEmpleados();
        int numeroEmpleados = empleados_al.size();
        String[] filaVacia = {"","","","",""};
        for(int i=0; i<numeroEmpleados; i++) {
            Empleado empleado = empleados_al.get(i);
            dtm.addRow(filaVacia);
            dtm.setValueAt(empleado.getIdEmpleado(), i, 0);
            dtm.setValueAt(empleado.getNombre(), i, 1);
            dtm.setValueAt(empleado.getEdad(), i, 2);
            dtm.setValueAt(empleado.getEstatura(), i, 3);
            dtm.setValueAt(empleado.getCasado(), i, 4);
        }
    }
    
    public List<Empleado> obtenerListaEmpleados() {
        String rutaRelativa = "data/usuarios.json";
        List<Empleado> empleados_al = null;
        try {
            String json = new String(Files.readAllBytes(Paths.get(rutaRelativa)));
            Gson gson = new Gson();
            empleados_al = gson.fromJson(json, new TypeToken<List<Empleado>>() {
            }.getType());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "LECTURA JSON", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return empleados_al;
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblContenido = new javax.swing.JTable();
        botRefrescar = new javax.swing.JButton();
        botLimpiar = new javax.swing.JButton();
        botSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblContenido.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblContenido);

        botRefrescar.setText("REFRESCAR");
        botRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botRefrescarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(botRefrescar)
                .addGap(49, 49, 49)
                .addComponent(botLimpiar)
                .addGap(43, 43, 43)
                .addComponent(botSalir)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botRefrescar)
                    .addComponent(botLimpiar)
                    .addComponent(botSalir))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_botSalirActionPerformed

    private void botLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botLimpiarActionPerformed
         limpiarTabla();
    }//GEN-LAST:event_botLimpiarActionPerformed

    public void limpiarTabla() {
               int numeroFilas = dtm.getRowCount();
        for(int i=0; i<numeroFilas; i++) {
            dtm.removeRow(0);
        }
    }
    
    private void botRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botRefrescarActionPerformed
        limpiarTabla();
        cargarDatos();
    }//GEN-LAST:event_botRefrescarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botLimpiar;
    private javax.swing.JButton botRefrescar;
    private javax.swing.JButton botSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblContenido;
    // End of variables declaration//GEN-END:variables
}

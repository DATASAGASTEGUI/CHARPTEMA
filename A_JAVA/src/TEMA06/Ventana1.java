package TEMA06;

import TEMA05.Direccion;
import TEMA05.Persona;
import static TEMA06.Principal.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.table.DefaultTableModel;

public class Ventana1 extends javax.swing.JFrame {
    
    public static final String URL = "jdbc:oracle:thin:@//localhost:1521/xepdb1";
    private static final String USUARIO = "FACTORIA";
    private static final String CLAVE = "12345678";
    
    Connection conexion = null;

    String[] cabecera = {"IDCLIENTE","EMPRESA","IDVENDEDOR","LIMITE CREDITO"};
    String[][] datos = {};
    DefaultTableModel dtm = new DefaultTableModel(datos, cabecera);
    
    public Ventana1() {
        initComponents();
        tblMostrar.setModel(dtm);
        conexion();
        cargarIdVendedor();
        cargarDatos(Principal.obtenerListaClientes(conexion));
        
    }
    
    private void conexion() {
        try {
            conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("OK: CONEXION");
        } catch (SQLException e) {
            System.out.println("ERROR: CONEXION");
            conexion = null;
        }
    }
    
    private void cargarDatos(List<Cliente> clientes_al) {
        limpiarTabla();
        int numeroClientes = clientes_al.size();
        String[] filaVacia = {"", "", "", ""};
        for (int i = 0; i < numeroClientes; i++) {
            Cliente cliente = clientes_al.get(i);
            dtm.addRow(filaVacia);
            dtm.setValueAt(cliente.getIdCliente(), i, 0);
            dtm.setValueAt(cliente.getEmpresa(), i, 1);
            dtm.setValueAt(cliente.getIdVendedor(), i, 2);
            dtm.setValueAt(cliente.getLimite_credito(), i, 3);
        }
    } 
    
    private void cargarIdVendedor() {
        List<Integer> idvendedores_al = Principal.obtenerListaIdVendedorDistintos(conexion);
        
        cboIdVendedor.addItem("SELECCIONE IDVENDEDOR");
        for (int idVendedor : idvendedores_al) {
            cboIdVendedor.addItem(idVendedor+"");
        }
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMostrar = new javax.swing.JTable();
        cboIdVendedor = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        cboIdVendedor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboIdVendedorItemStateChanged(evt);
            }
        });

        txtNombre.setEditable(false);
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(cboIdVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboIdVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboIdVendedorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboIdVendedorItemStateChanged
        String idVendedor = (String) cboIdVendedor.getSelectedItem();
        
        if (!idVendedor.equalsIgnoreCase("SELECCIONE IDVENDEDOR")) {
            limpiarTabla();
            cargarDatos(Principal.obtenerListaClientesPorIdVendedor(conexion, Integer.parseInt(idVendedor)));
            txtNombre.setText(Principal.obtenerNombrePorIdVendedor(conexion, Integer.parseInt(idVendedor)));
        }else {
            txtNombre.setText("");
            limpiarTabla();
            cargarDatos(Principal.obtenerListaClientes(conexion));
        }
        
    }//GEN-LAST:event_cboIdVendedorItemStateChanged

    private void limpiarTabla() {
        int numeroFilas = dtm.getRowCount();
        for (int i = 0; i < numeroFilas; i++) {
            dtm.removeRow(0);
        }        
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboIdVendedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMostrar;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

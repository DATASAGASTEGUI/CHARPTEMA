package TEMA07;

import java.sql.Connection;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Ventana1 extends javax.swing.JFrame {

    String[] cabecera = {"IDFABRICA", "IDPRODUCTO", "DESCRIPCION", "PRECIO", "EXISTENCIA"};
    String[][] datos = {};
    DefaultTableModel dtm = new DefaultTableModel(datos, cabecera);
    Connection conexion = null;

    public Ventana1() {
        initComponents();
        tblMostrar.setModel(dtm);
        cargarCoboBoxBaseDatos();
    }

    private void cargarCoboBoxBaseDatos() {
        cboBaseDatos.addItem("SELECCIONE BD");
        cboBaseDatos.addItem("MYSQL");
        cboBaseDatos.addItem("ORACLE");
        cboBaseDatos.addItem("SQLITE");
    }

    private void cargarComboBoxIdProducto(List<String> idproductos_al) {
        cboIdProducto.removeAllItems();
        cboIdProducto.addItem("SELECCIONE IDPRODUCTO");
        if (idproductos_al != null) {
            for (String idProducto : idproductos_al) {
                cboIdProducto.addItem(idProducto);
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR: LISTA IDPRODUCTOS VACIA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cargarTableProducto(List<Producto> productos_al) {
        //limpiarTable();
        int numeroProductos = productos_al.size();
        String[] filaVacia = {"", "", "", "", ""};
        for (int i = 0; i < numeroProductos; i++) {
            Producto producto = productos_al.get(i);
            System.out.println(producto.getIdFabrica());
            dtm.addRow(filaVacia);
            dtm.setValueAt(producto.getIdFabrica(), i, 0);
            dtm.setValueAt(producto.getIdProducto(), i, 1);
            dtm.setValueAt(producto.getDescripcion(), i, 2);
            dtm.setValueAt(producto.getPrecio(), i, 3);
            dtm.setValueAt(producto.getExistencia(), i, 4);
        }
    }

    private void cargarTablePedido(List<Pedido> pedidos_al) {
        limpiarTable();
        String[] nuevasCabeceras = {"IDPEDIDO", "IDVENDEDOR", "IDCLIENTE", "IDFABRICA", "IDPRODUCTO", "CANTIDAD", "IMPORTE"};
        dtm.setColumnIdentifiers(nuevasCabeceras);
        int numeroPedidos = pedidos_al.size();
        String[] filaVacia = {"", "", "", "", "", "", ""};
        for (int i = 0; i < numeroPedidos; i++) {
            Pedido pedido = pedidos_al.get(i);
            dtm.addRow(filaVacia);
            dtm.setValueAt(pedido.getIdPedido(), i, 0);
            dtm.setValueAt(pedido.getIdVendedor(), i, 1);
            dtm.setValueAt(pedido.getIdCliente(), i, 2);
            dtm.setValueAt(pedido.getIdFabrica(), i, 3);
            dtm.setValueAt(pedido.getIdProducto(), i, 4);
            dtm.setValueAt(pedido.getCantidad(), i, 5);
            dtm.setValueAt(pedido.getImporte(), i, 6);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMostrar = new javax.swing.JTable();
        cboBaseDatos = new javax.swing.JComboBox<>();
        lblBaseDatos = new javax.swing.JLabel();
        cboIdProducto = new javax.swing.JComboBox<>();

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

        cboBaseDatos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboBaseDatosItemStateChanged(evt);
            }
        });

        lblBaseDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cboIdProducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboIdProductoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(lblBaseDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(cboBaseDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cboIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblBaseDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboBaseDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboBaseDatosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboBaseDatosItemStateChanged
        String bd = (String) cboBaseDatos.getSelectedItem();
        if (!bd.equalsIgnoreCase("SELECCIONE BD")) {
            conexion = Principal.getConexion(bd);
            if (conexion != null) {
                //limpiarTable();
                //String[] nuevasCabeceras = {"IDFABRICA", "IDPRODUCTO", "DESCRIPCION", "PRECIO", "EXISTENCIA"};
                //dtm.setColumnIdentifiers(nuevasCabeceras);
                List<Producto> productos_al = Principal.getListaProductos(conexion);
                List<String> idproductos_al = Principal.getListaIdProductos(conexion);
                cargarComboBoxIdProducto(idproductos_al);
                cargarTableProducto(productos_al);
                
                lblBaseDatos.setText("CONEXION " + bd);
            } else {
                JOptionPane.showMessageDialog(null, "ERROR: CONEXION", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }else {
            limpiarTable();
            String[] nuevasCabeceras = {"IDFABRICA", "IDPRODUCTO", "DESCRIPCION", "PRECIO", "EXISTENCIA"};
            dtm.setColumnIdentifiers(nuevasCabeceras);
            cboIdProducto.removeAllItems();
        }
    }//GEN-LAST:event_cboBaseDatosItemStateChanged

    private void cboIdProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboIdProductoItemStateChanged
        String id = (String) cboIdProducto.getSelectedItem();
        if (id != null) {
            if (!id.equalsIgnoreCase("SELECCIONE IDPRODUCTO")) {
                String[] partes = id.split("_");
                String bd = (String) cboBaseDatos.getSelectedItem();
                conexion = Principal.getConexion(bd);
                List<Pedido> pedidos_al = Principal.getListaPedidos(conexion, partes[0], partes[1]);
                cargarTablePedido(pedidos_al);
            }else {
                limpiarTable();
            }
        }
    }//GEN-LAST:event_cboIdProductoItemStateChanged

    private void limpiarTable() {
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
    private javax.swing.JComboBox<String> cboBaseDatos;
    private javax.swing.JComboBox<String> cboIdProducto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBaseDatos;
    private javax.swing.JTable tblMostrar;
    // End of variables declaration//GEN-END:variables
}

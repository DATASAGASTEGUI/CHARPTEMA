package TEMA07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    public static void main(String[] args) {
        String opcion = "SQLITE";
        Connection conexion = getConexion(opcion);
        
        List<Pedido> pedidos_al = getListaPedidos(conexion, "ACI","41003");
        
        for(Pedido p: pedidos_al) {
            System.out.println(p);
        }

    }

    public static Connection getConexion(String opcion) {
        Connection conexion = null;
        String url = "", usuario = "", clave = "";
        String driver = "";

        switch (opcion) {
            case "MYSQL":
                driver = "com.mysql.cj.jdbc.Driver";
                url = "jdbc:oracle:thin:@//localhost:1521/xepdb1";
                usuario = "FACTORIA";
                clave = "12345678";
                break;
            case "ORACLE":
                driver = "oracle.jdbc.driver.OracleDriver";
                url = "jdbc:mysql://localhost:3307/factoria";
                usuario = "root";
                clave = "12345678";
                break;
            case "SQLITE": 
                driver = "org.sqlite.JDBC";
                url = "jdbc:sqlite:C:\\CSHARPTEMA\\A_JAVA\\src\\TEMA07\\factoria.sqlite";
                usuario = "";
                clave = "";
                break;
        }
        try {
            Class.forName(driver);//Sentencia registrar driver
            conexion = DriverManager.getConnection(url, usuario, clave);
            System.out.println("OK: CONEXION " + opcion);
        } catch (SQLException e) {
            System.out.println("ERROR: CONEXION " + opcion + e);
            conexion = null;
        } catch (ClassNotFoundException ex) {
            System.out.println("ERROR: CLASENOTFOUND " + ex);
        }
        return conexion;
    }

    public static List<Producto> getListaProductos(Connection conexion) {
        List<Producto> productos_al = new ArrayList<>();
        String query = "SELECT * FROM Producto ORDER BY idFabrica ASC, idProducto ASC";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String idFabrica = rs.getString("idFabrica");
                String idProducto = rs.getString("idProducto");
                String descripcion = rs.getString("descripcion");
                double precio = rs.getDouble("precio");
                int existencia = rs.getInt("existencia");
                Producto producto = new Producto(idFabrica, idProducto, descripcion, precio, existencia);
                productos_al.add(producto);
            }
        } catch (SQLException e) {
            System.out.println("ERROR: SELECT");
            productos_al = null;
        }
        return productos_al;
    }
    
    public static List<String> getListaIdProductos(Connection conexion)     {
        List<String> idproductos_al = new ArrayList<>();
        String query = "SELECT idFabrica, idProducto FROM Producto ORDER BY idFabrica ASC, idProducto ASC";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String idFabrica = rs.getString("idFabrica");
                String idProducto = rs.getString("idProducto");
                String id = idFabrica + "_" + idProducto;
                idproductos_al.add(id);
            }
        } catch (SQLException e) {
            System.out.println("ERROR: SELECT");
            idproductos_al = null;
        }
        return idproductos_al;        
    }
    
    public static List<Pedido> getListaPedidos(Connection conexion, String idFabrica, String idProducto) {
        List<Pedido> pedidos_al = new ArrayList<>();
        String query = "SELECT * FROM Pedido WHERE idFabrica = ? AND idProducto = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, idFabrica);
            ps.setString(2, idProducto);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idPedido = rs.getInt("idPedido");
                int  idVendedor = rs.getInt("idVendedor");
                int idCliente = rs.getInt("idCliente");
                String idFabrica1 = rs.getString("idFabrica");
                String idProducto1 = rs.getString("idProducto");
                int cantidad = rs.getInt("cantidad");
                double importe = rs.getDouble("importe");
                Pedido pedido = new Pedido(idPedido, idVendedor, idCliente,idFabrica1, idProducto1, cantidad, importe);
                pedidos_al.add(pedido);
            }
        } catch (SQLException e) {
            System.out.println("ERROR: SELECT");
            pedidos_al = null;
        }
        return pedidos_al;       
    }
}

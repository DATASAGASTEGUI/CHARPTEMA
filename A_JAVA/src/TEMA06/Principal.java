package TEMA06;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static final String URL = "jdbc:oracle:thin:@//localhost:1521/xepdb1";
    private static final String USUARIO = "FACTORIA";
    private static final String CLAVE = "12345678";

    private static final String QUERYSELECT = "SELECT * FROM CLIENTE";

    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("OK: CONEXION");
        } catch (SQLException e) {
            System.out.println("ERROR: CONEXION");
            conexion = null;
        }

        if (conexion != null) {
            //select(conexion);
            /*
            List<Cliente> clientes_al = obtenerListaClientes(conexion);
            for(Cliente cliente: clientes_al) {
                System.out.println(cliente);
            }
             */
        } else {
            System.out.println("ERROR: CONEXION");
        }

    }

    public static void select(Connection conexion) {
        try {
            PreparedStatement ps = conexion.prepareStatement(QUERYSELECT);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String idCliente = rs.getString("idCliente");
                String empresa = rs.getString("empresa");
                System.out.println("Id Cliente: " + idCliente);
                System.out.println("Empresa   : " + empresa);
            }
        } catch (SQLException e) {
            System.out.println("ERROR: SELECT");
        }
    }

    public static List<Cliente> obtenerListaClientes(Connection conexion) {
        List<Cliente> clientes_al = new ArrayList<>();
        try {
            PreparedStatement ps = conexion.prepareStatement(QUERYSELECT);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idCliente = rs.getInt("idCliente");
                String empresa = rs.getString("empresa");
                int idVendedor = rs.getInt("idVendedor");
                double limiteCredito = rs.getDouble("limite_credito");
                Cliente cliente = new Cliente(idCliente, empresa, idVendedor, limiteCredito);
                clientes_al.add(cliente);
            }
        } catch (SQLException e) {
            System.out.println("ERROR: SELECT");
            clientes_al = null;
        }
        return clientes_al;
    }
    
    public static List<Cliente> obtenerListaClientesPorIdVendedor(Connection conexion, int idVendedor1) {
        List<Cliente> clientes_al = new ArrayList<>();
        String query = "SELECT * FROM Cliente WHERE idVendedor = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1,idVendedor1);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idCliente = rs.getInt("idCliente");
                String empresa = rs.getString("empresa");
                int idVendedor = rs.getInt("idVendedor");
                double limiteCredito = rs.getDouble("limite_credito");
                Cliente cliente = new Cliente(idCliente, empresa, idVendedor, limiteCredito);
                clientes_al.add(cliente);
            }
        } catch (SQLException e) {
            System.out.println("ERROR: SELECT");
            clientes_al = null;
        }
        return clientes_al;
    }    

    public static List<Integer> obtenerListaIdVendedorDistintos(Connection conexion) {
        List<Integer> idvendedores_al = new ArrayList<>();
        String query = "SELECT DISTINCT idVendedor FROM Vendedor";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
               idvendedores_al.add(rs.getInt(1));
            }
        } catch (SQLException e) {
            idvendedores_al = null;
        }
        return idvendedores_al;
    }
    
    public static String obtenerNombrePorIdVendedor(Connection conexion, int idVendedor) {
        String query = "SELECT nombre FROM Vendedor WHERE idVendedor = ?";
        String nombre = null;
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1,idVendedor);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
               nombre = rs.getString("nombre");
            }
        } catch (SQLException e) {
             nombre = null;
        }        
        return nombre;
    }

}

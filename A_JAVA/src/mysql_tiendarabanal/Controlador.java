package mysql_tiendarabanal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Controlador {
    
    public static Connection getConexion() {
        Connection conexion = null;
        String url     = "jdbc:mysql://127.0.0.1:3306/tiendarabanal";//PROTOCOLO-IP-PUERTO-BASE DE DATOS
        String usuario = "root";
        String clave   = "12345678";
        try {
            conexion = DriverManager.getConnection(url,usuario,clave);
        }catch(SQLException e) {
            System.out.println("ERROR: CONEXION");
        }
        return conexion;
    }
    
    public static List<Cliente> getArrayListCliente() {
        List<Cliente> clientes_al = new ArrayList<Cliente>();
        Connection conexion = getConexion();
        String query = "SELECT * FROM Cliente";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                int codigo = rs.getInt(1);
                String nombre = rs.getString(2);
                String domicilio = rs.getString(3);
                Cliente c = new Cliente(codigo,nombre,domicilio);
                clientes_al.add(c);
            }
        } catch (Exception ex) {
            System.out.println("ERROR: QUERY");
            clientes_al = null;
        }
        return clientes_al;
    }
    
    
}

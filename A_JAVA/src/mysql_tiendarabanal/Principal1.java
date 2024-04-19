package mysql_tiendarabanal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Principal1 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/tiendarabanal";        //protocolo-IP(127.0.0.1) PUERTO + NOMBRE BASE DE DATOS
        String usuario = "root";
        String clave = "12345678";
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, clave);
            
            String query = "SELECT * FROM Cliente";
            
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            System.out.printf("%6s  %-12s  %-14s\n","CODIGO","NOMBRE","DOMICILIO");
            System.out.printf("%6s  %-12s  %-14s\n","------","------","---------");
            while(rs.next()) {
               int codigo = rs.getInt(1);
               String nombre = rs.getString(2);
               String domicilio = rs.getString(3);
               System.out.printf("%6d  %-12s  %-14s\n",codigo,nombre,domicilio);
            }
      
        
        
        
        } catch (SQLException e) {
            System.out.println("ERROR: CONEXION " + e);
        }
    }

}

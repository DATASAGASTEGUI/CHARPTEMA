package mysql_tiendarabanal;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    private static Connection conexion;

    public static Connection getConexion() {
        return conexion;
    }

    public static void setConexion(String bd, String usuario, String clave) {
        String url = "jdbc:mysql://localhost:3306/"+bd;   
        try {
            conexion = DriverManager.getConnection(url, usuario, clave);
        }catch(Exception e) {
            conexion = null;
        }
    }

}

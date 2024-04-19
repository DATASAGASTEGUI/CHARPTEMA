package mysql_tiendarabanal;

import java.sql.Connection;

public class Probando {

    public static void main(String[] args) {
       
        Conexion.setConexion("tiendarabanal", "root", "12345678");
        Connection conexion = Conexion.getConexion();
        
        if(conexion != null) {
            System.out.println("OK: CONEXION");
        }else {
            System.out.println("ERROR: CONEXION");
        }
        
        
        
    }

}

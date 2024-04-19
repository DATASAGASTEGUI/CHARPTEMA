package mysql_tiendarabanal;

import java.sql.Connection;
import java.util.List;

public class Menu {

    static Connection conexion;
    static OperacionesCrud crud;

    public static void main(String[] args) {

        Conexion.setConexion("tiendarabanal", "root", "12345678");
        conexion = Conexion.getConexion();
        crud = new OperacionesCrud(conexion);

        while (true) {

            Util.cls();
            System.out.println("MENU");
            System.out.println("----");
            System.out.println("1. Mostrar tabla cliente");
            System.out.println("2. Insertar cliente");
            System.out.println("3. Eliminar cliente");
            System.out.println("4. Actualizar cliente");
            System.out.println("5. Mostrar el precio maximo entre todos los artículos");
            System.out.println("0. Salir");

            int opcion = Util.validarEntradaEntero("Ingrese opción? ");

            switch (opcion) {
                case 1:
                    Util.cls();
                    proceso1();
                    Util.pause();
                    break;
                case 2:
                    Util.cls();
                    proceso2();
                    Util.pause();
                    break;
                case 3:
                    Util.cls();
                    proceso3();
                    Util.pause();
                    break;
                case 4:
                    Util.cls();
                    proceso4();
                    Util.pause();
                    break;
                case 5:
                    Util.cls();
                    proceso5();
                    Util.pause();
                    break;
                case 0:
                    System.exit(0);
            }

        }

    }

    public static void proceso1() {
        System.out.println("1. MOSTRAR TABLA CLIENTE");
        System.out.println("------------------------");
        List<Cliente> clientes_al = null;
        if (conexion != null) {
            if ((clientes_al = crud.getArrayListCliente()) != null) {
                Cliente.cabecera();
                for (Cliente c : clientes_al) {
                    c.cuerpo();
                }

            } else {
                System.out.println("ERROR: CRUD.GETARRAYLISTCLIENTE");
            }
        } else {
            System.out.println("ERROR: CONEXION");
        }
    }

    public static void proceso2() {
        System.out.println("2. INSERTAR CLIENTE");
        System.out.println("-------------------");
        int codigo = 6;
        String nombre = "Arturo Roncal";
        String domicilio = "Marconi 634";
        Cliente cliente = new Cliente(codigo, nombre, domicilio);
        byte x;
        if (conexion != null) {
            x = crud.existeCliente(cliente);
            switch (x) {
                case 0:
                    if (crud.insertarCliente(cliente)) {
                        System.out.println("OK: CRUD.INSERTARCLIENTE");
                    } else {
                        System.out.println("ERROR: CRUD.INSERTARCLIENTE");
                    }
                    break;
                case 1:
                    System.out.println("YA EXISTE CLIENTE");
                    break;
                case -1:
                    System.out.println("ERROR: CRUD.EXISTECLIENTE");
            }
        } else {
            System.out.println("ERROR: CONEXION");
        }
    }

    public static void proceso3() {
        System.out.println("3. ELIMINAR CLIENTE");
        System.out.println("-------------------");
        int codigo = 7;
        Cliente cliente = new Cliente(codigo);
        byte x;
        if (conexion != null) {
            x = crud.existeCliente(cliente);
            switch (x) {
                case 0:
                    System.out.println("NO EXISTE CLIENTE");
                    break;
                case 1:
                    if (crud.eliminarCliente(cliente)) {
                        System.out.println("OK: CRUD.ELIMINARCLIENTE");
                    } else {
                        System.out.println("ERROR: CRUD.ELIMINARCLIENTE");
                    }
                    break;
                case -1:
                    System.out.println("ERROR: CRUD.EXISTECLIENTE");
            }
        } else {
            System.out.println("ERROR: CONEXION");
        }

    }

    public static void proceso4() {
        System.out.println("4. ACTUALIZAR CLIENTE");
        System.out.println("---------------------");
        int codigo = 4;
        String nombre = "Carmen Ruiz";
        String domicilio = "Ejercito 123";//"Sarmiento 576 
        Cliente cliente = new Cliente(codigo, nombre, domicilio);
        byte x;
        if (conexion != null) {
            x = crud.existeCliente(cliente);
            switch (x) {
                case 0:
                    System.out.println("NO EXISTE CLIENTE");
                    break;
                case 1:
                    if (crud.actualizarCliente(cliente)) {
                        System.out.println("OK: CRUD.ACTULIZARCLIENTE");
                    } else {
                        System.out.println("ERROR: CRUD.ACTUALIZARCLIENTE");
                    }
                    break;
                case -1:
                    System.out.println("ERROR: CRUD.EXISTECLIENTE");
            }

        } else {
            System.out.println("ERROR: CONEXION");
        }

    }

    public static void proceso5() {
        System.out.println("5. MOSTRAR EL PRECIO MAXIMO ENTRE TODOS LOS ARTICULOS");
        System.out.println("-----------------------------------------------------");
        double precioMaximo = 0;
        if (conexion != null) {
            if((precioMaximo=crud.obtenerPrecioMaximo()) != -1) {
                System.out.println("PRECIO MAXIMO: " + precioMaximo);
            }else {
                System.out.println("ERROR: CRUD.OBTENERPRECIOMAXIMO");
            }
        } else {
            System.out.println("ERROR: CONEXION");
        }
    }
}

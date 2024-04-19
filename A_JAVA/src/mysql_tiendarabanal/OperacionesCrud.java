package mysql_tiendarabanal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class OperacionesCrud implements Operaciones {

    private Connection conexion;

    public OperacionesCrud(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public List<Cliente> getArrayListCliente() {
        List<Cliente> clientes_al = new ArrayList<Cliente>();
        String query = "SELECT * FROM Cliente";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int codigo = rs.getInt(1);
                String nombre = rs.getString(2);
                String domicilio = rs.getString(3);
                Cliente cliente = new Cliente(codigo, nombre, domicilio);
                clientes_al.add(cliente);
            }
        } catch (Exception e) {
            clientes_al = null;
        }
        return clientes_al;
    }

    @Override
    public boolean insertarCliente(Cliente cliente) {
        boolean correcto = true;
        String query = "INSERT INTO Cliente(codigo,nombre,domicilio) VALUES(?,?,?)";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, cliente.getCodigo());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getDomicilio());
            ps.executeUpdate();
        } catch (Exception e) {
            correcto = false;
        }
        return correcto;
    }

    @Override
    public byte existeCliente(Cliente cliente) {
        byte existe = 0;
        String query = "SELECT * FROM Cliente WHERE codigo = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, cliente.getCodigo());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                existe = 1;
            }
        } catch (Exception e) {
            existe = -1;
        }
        return existe;
    }

    @Override
    public boolean eliminarCliente(Cliente cliente) {
        boolean correcto = true;
        String query = "DELETE FROM Cliente WHERE codigo = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, cliente.getCodigo());
            ps.executeUpdate();
        } catch (Exception e) {
            correcto = false;
        }
        return correcto;
    }

    @Override
    public boolean actualizarCliente(Cliente cliente) {
        boolean correcto = true;
        String query = "UPDATE Cliente SET nombre = ?, domicilio = ? WHERE codigo = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getDomicilio());
            ps.setInt(3, cliente.getCodigo());
            ps.executeUpdate();
        } catch (Exception e) {
            correcto = false;
        }
        return correcto;
    }

    @Override
    public double obtenerPrecioMaximo() {
        double precioMaximo = 0;
        String query = "SELECT MAX(precio) AS MAXIMO FROM Detalle";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                precioMaximo = rs.getDouble("MAXIMO");
            }
        } catch (Exception e) {
            precioMaximo = -1;
        }
        return precioMaximo;
    }

    @Override
    public List<Integer> obtenerArrayListCodigoCliente() {
        List<Integer> codigos_al = new ArrayList<Integer>();
        String query = "SELECT codigo FROM Cliente";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                codigos_al.add(codigo);
            }
        } catch (Exception e) {
            codigos_al = null;
        }
        return codigos_al;
    }

    @Override
    public Cliente buscarCliente(int idCliente) {
        Cliente cliente = null;
        String querey = "SELECT * FROM Cliente WHERE codigo = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(querey);
            ps.setInt(1, idCliente);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int codigo = rs.getInt(1);
                String nombre = rs.getString(2);
                String domicilio = rs.getString(3);
                cliente = new Cliente(codigo, nombre, domicilio);
            }
        } catch (Exception e) {
            cliente = null;
        }
        return cliente;
    }

}
